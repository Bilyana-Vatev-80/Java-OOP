package test.java.store;

import main.java.store.Store;

import static org.junit.Assert.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import store.Product;

public class StoreTests {
    private Store store;
    private store.Product product;

    @Before
    public void setUp() {
        store = new Store();
        product = new store.Product("Fanta", 2, 2.40);
        store.addProduct(product);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetProductShouldReturnUnmodifiableList() {
        store.getProducts().remove(product);
    }

    @Test
    public void testGetCountShouldReturnCorrectValue() {
        assertEquals(1, store.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddProductWhenIsNull() {
        store.addProduct(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddProductShouldTheExWhenQuantityIsLessOrEqualToZero() {
        store.addProduct(new Product("Coca-cola", 0, 1.20));
    }

    @Test
    public void testAddProductShouldAddProduct() {
        store.addProduct(new Product("Cola-cola", 1, 1.20));
        assertEquals(2, store.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBuyProductShouldThExWhenProductNotExsit() {
        store.buyProduct("Crisp", 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBuyProductWhereThereIsNotEnoughQuantity() {
        store.buyProduct("Fanta", 5);
    }

    @Test
    public void testBuyProductShouldReturnCorrectProduct(){
        assertEquals(4.80, store.buyProduct("Fanta", 2),0.0);
    }

    @Test
    public void testGetTheMostExpensiveProductShouldReturnCorrectProduct(){
        store.addProduct(new Product("Crisp", 3, 1.20));
        Product expect = store.getProducts().get(0);
        Product actual = store.getTheMostExpensiveProduct();
        assertEquals(expect, actual);
    }
}
