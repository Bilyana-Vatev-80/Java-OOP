package rpg_lab;


import org.junit.Assert;
import org.junit.Test;

public class AxeTest {
    @Test
    public void weaponAttacksLosesDurability(){
        Axe axe = new Axe(10 , 10);
        Dummy dummy = new Dummy(10,10);

        axe.attack(dummy);
        Assert.assertEquals(9,axe.getDurabilityPoints());
    }
    @Test
    public void weaponAttacksCanLosesAllDurability(){
        Axe axe = new Axe(10 , 0);
        Dummy dummy = new Dummy(1000,10);
        for (int i = 0; i < 10; i++) {
            axe.attack(dummy);
        }
        Assert.assertEquals(0,axe.getDurabilityPoints());
    }
    @Test (expected = IllegalStateException.class)
    public void testAttackWithBrokenAxe(){
        Axe axe = new Axe(10 , 0);
        Dummy dummy = new Dummy(1000,10);

        axe.attack(dummy);
    }

}