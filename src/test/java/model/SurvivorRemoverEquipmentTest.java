package model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SurvivorRemoverEquipmentTest
{
  private static final Weapon KATANA = Weapon.KATANA;
  private static final Weapon KNIFE = Weapon.KNIFE;

  Survivor survivor;

  @Before
  public void initialize(){
    survivor = new Survivor("Antonio");
  }

  @Test
  public void removeWeaponInAEmptyInHandList()
  {
    int sizeBeforeRemove = survivor.getEquipment().getInHand().size();
    survivor.getEquipment().removeInHand(KATANA);
    assertEquals(sizeBeforeRemove,survivor.getEquipment().getInHand().size());
  }

  @Test
  public void removeWeaponInAnEmptyInReserveList()
  {
    int sizeBeforeRemove = survivor.getEquipment().getInReserve().size();
    survivor.getEquipment().removeInReserve(KATANA);
    assertEquals(sizeBeforeRemove,survivor.getEquipment().getInReserve().size());
  }

  @Test
  public void removeWeaponInHand()
  {
    survivor.getEquipment().addInHand(KATANA);
    survivor.getEquipment().addInHand(KNIFE);
    survivor.getEquipment().removeInHand(KATANA);
    assertEquals(survivor.getEquipment().getInHand().stream().findFirst().get(), KNIFE);
  }

  @Test
  public void removeWeaponInReserve()
  {
    survivor.getEquipment().addInReserve(KATANA);
    survivor.getEquipment().addInReserve(KNIFE);
    survivor.getEquipment().removeInReserve(KATANA);
    assertEquals(survivor.getEquipment().getInReserve().stream().findFirst().get(), KNIFE);
  }
}
