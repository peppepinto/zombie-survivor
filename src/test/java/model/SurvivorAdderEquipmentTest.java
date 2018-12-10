package model;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class SurvivorAdderEquipmentTest
{
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
    survivor.getEquipment().addInHand("pistols");
    survivor.getEquipment().addInHand("knife");
    assertThat(survivor.getEquipment().getInHand().size(), is(2));
  }

  @Test
  public void checkTheAddOfElementInHand() throws Exception
  {
    survivor.getEquipment().addInHand("pistol");
    assertThat(survivor.getEquipment().getInHand().stream().findFirst().get(), is("pistol"));
  }

  @Test
  public void addInReserveElement()
  {
    survivor.getEquipment().addInReserve("pistol");
    survivor.getEquipment().addInReserve("knife");
    assertThat(survivor.getEquipment().getInReserve().size(), is(2));
  }

  @Test
  public void checkTheAddOfElementInReserve()
  {
    survivor.getEquipment().addInReserve("pistol");
    assertThat(survivor.getEquipment().getInReserve().stream().findFirst().get(), is("pistol"));
  }

  @Test(expected = RuntimeException.class)
  public void addThreeElementInHand() throws Exception
  {
    survivor.getEquipment().addInHand("pistol");
    survivor.getEquipment().addInHand("knife");
    survivor.getEquipment().addInHand("sword");
  }

  @Test(expected = Exception.class)
  public void addFourElementInReserve()
  {
    survivor.getEquipment().addInReserve("pistol");
    survivor.getEquipment().addInReserve("pistol");
    survivor.getEquipment().addInReserve("pistol");
    survivor.getEquipment().addInReserve("pistol");
  }

  @Test
  public void addARightMixOfEquipment() throws Exception
  {
    survivor.getEquipment().addInReserve("pistol");
    survivor.getEquipment().addInReserve("pistol");
    survivor.getEquipment().addInReserve("pistol");
    survivor.getEquipment().addInHand("pistol");
    survivor.getEquipment().addInHand("knife");
  }
}
