package rpg_lab;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AxeTest {
    private static final int AXE_ATTACK = 10;
    private static final int AXE_DURABILITY = 10;
    private static final int DUMMY_HEALTH = 10;
    private static final int DUMMY_EXPERIENCE = 10;
    private Axe axe;
    private Dummy dummy;

    @Before
    public void setUp(){
        this.axe = new Axe(AXE_ATTACK , AXE_DURABILITY);

    }
    @Test
    public void weaponAttacksLosesDurability(){
        axe.attack(dummy);
        Assert.assertEquals(AXE_DURABILITY - 1,axe.getDurabilityPoints());
    }

    @Test
    public void weaponAttacksCanLosesAllDurability(){
        for (int i = 0; i < AXE_DURABILITY; i++) {
            axe.attack(dummy);
        }
        Assert.assertEquals(0,axe.getDurabilityPoints());
    }

    @Test (expected = IllegalStateException.class)
    public void testAttackWithBrokenAxe(){
        Axe axe = new Axe(AXE_ATTACK,0);
        axe.attack(dummy);
    }

}