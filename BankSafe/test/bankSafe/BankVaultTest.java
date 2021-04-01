package bankSafe;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class BankVaultTest {
    private BankVault bankVault;
    private Item item;

    @Before
    public void setUp() throws OperationNotSupportedException {
        bankVault = new BankVault();
        item = new Item("Az", "1");
        bankVault.addItem("A1", item);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetVaultCellsShouldReturnUnmodifiable(){
        bankVault.getVaultCells().put("s", item);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddItemThExWhenDoesNotIsExit() throws OperationNotSupportedException {
        bankVault.getVaultCells();
        bankVault.addItem("A10", item);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddItemThExWhenIsTaken() throws OperationNotSupportedException {
        bankVault.getVaultCells();
        bankVault.addItem("A1", item);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddThExWhenItemIsAlreadyAtCell() throws OperationNotSupportedException {
        bankVault.addItem("A2", item);
        bankVault.addItem("A2", item);
    }

    @Test
    public void testAddShouldReturnCorrectString() throws OperationNotSupportedException {
        Assert.assertEquals("Item:2 saved successfully!", bankVault.addItem("A4", new Item("SA", "2")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveItemThExWhenCellDoesNotExit(){
        bankVault.removeItem("s",item);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveItemThExWhenItemDoesNotExit(){
        bankVault.removeItem("A1", new Item("s", "3"));
    }

    @Test
    public void testRemoveItemShouldReturnCorrectString(){
        Assert.assertEquals("Remove item:1 successfully!", bankVault.removeItem("A1", item));
    }

}