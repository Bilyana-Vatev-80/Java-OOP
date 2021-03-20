package rpg_lab;

import org.junit.Test;
import org.mockito.*;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HeroTest {

   @Test
   public void testItemDropShouldDropCorrectly(){
      Weapon weapon = Mockito.mock(Weapon.class);

      Hero hero = new Hero("Test_Hero",weapon);

      Target target = mock(Target.class);

      when(target.isDead()).thenReturn(true);

      Random random = mock(Random.class);

      Weapon weapon3 = Mockito.mock(Weapon.class);

      when(weapon3.getAttack()).thenReturn(73);

      when(target.dropWeapon(random)).thenReturn(weapon3);

      Weapon wep = hero.attack(target, random);

      assertEquals(73, wep.getAttack());

   }
}