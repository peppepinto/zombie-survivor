package model;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class SurvivorAdderEquipmentTest
{
  private static final Weapon PISTOL = Weapon.PISTOL;
  private static final Weapon KNIFE = Weapon.KNIFE;
  private static final Weapon KATANA = Weapon.KATANA;
  private static final Weapon BASEBALL_PAT = Weapon.BASEBALL_PAT;
  private Survivor survivor;

  @Before
  public void initialize() {
    survivor = new Survivor("Antonio");
  }

  @Test
  public void hasAListOfEquipment()
  {
    assertNotNull(new Survivor("Antonio").getEquipment());
  }

  @Test(expected = UnsupportedOperationException.class)
  public void illegalNumberOfEquipments()
  {
    survivor.getEquipment().getInHand().add("New element");
  }

  @Test
  public void addInHandElement() throws Exception
  {
    survivor.getEquipment().addInHand(PISTOL);
    survivor.getEquipment().addInHand(KNIFE);
    assertThat(survivor.getEquipment().getInHand().size(), is(2));
  }

  @Test
  public void checkTheAddOfElementInHand() throws Exception
  {
    survivor.getEquipment().addInHand(PISTOL);
    assertThat(survivor.getEquipment().getInHand().stream().findFirst().get(), is(PISTOL));
  }

  @Test
  public void addInReserveElement()
  {
    survivor.getEquipment().addInReserve(PISTOL);
    survivor.getEquipment().addInReserve(KNIFE);
    assertThat(survivor.getEquipment().getInReserve().size(), is(2));
  }

  @Test
  public void checkTheAddOfElementInReserve()
  {
    survivor.getEquipment().addInReserve(PISTOL);
    assertThat(survivor.getEquipment().getInReserve().stream().findFirst().get(), is(PISTOL));
  }

  @Test(expected = RuntimeException.class)
  public void addThreeElementInHand() throws Exception
  {
    survivor.getEquipment().addInHand(PISTOL);
    survivor.getEquipment().addInHand(KNIFE);
    survivor.getEquipment().addInHand(KATANA);
  }

  @Test(expected = Exception.class)
  public void addFourElementInReserve()
  {
    survivor.getEquipment().addInReserve(PISTOL);
    survivor.getEquipment().addInReserve(KATANA);
    survivor.getEquipment().addInReserve(KNIFE);
    survivor.getEquipment().addInReserve(PISTOL);
  }

  @Test
  public void addARightMixOfEquipment() throws Exception
  {
    survivor.getEquipment().addInReserve(PISTOL);
    survivor.getEquipment().addInReserve(KATANA);
    survivor.getEquipment().addInReserve(KNIFE);
    survivor.getEquipment().addInHand(BASEBALL_PAT);
    survivor.getEquipment().addInHand(KNIFE);
  }
}
