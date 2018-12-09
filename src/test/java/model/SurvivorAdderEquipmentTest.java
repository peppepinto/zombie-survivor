package model;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;


public class SurvivorAdderEquipmentTest
{

  @Test
  public void hasAListOfEquipment()
  {
    assertNotNull(new Survivor("Antonio").getEquipment());
  }

  @Test(expected = UnsupportedOperationException.class)
  public void illegalNumberOfEquipments()
  {
    new Survivor("Antonio").getEquipment().getInHand().add("New element");
  }

  @Test
  public void addInHandElement()
  {
    Survivor survivor = new Survivor("Antonio");
    survivor.getEquipment().addInHand("pistols");
    survivor.getEquipment().addInHand("knife");
    assertThat(survivor.getEquipment().getInHand().size(), is(2));
  }

  @Test
  public void checkTheAddOfElementInHand()
  {
    Survivor survivor = new Survivor("Antonio");
    survivor.getEquipment().addInHand("pistol");
    assertThat(survivor.getEquipment().getInHand().stream().findFirst().get(), is("pistol"));
  }

  @Test
  public void addInReserveElement()
  {
    Survivor survivor = new Survivor("Antonio");
    survivor.getEquipment().addInReserve("pistol");
    survivor.getEquipment().addInReserve("knife");
    assertThat(survivor.getEquipment().getInReserve().size(), is(2));
  }

  @Test
  public void checkTheAddOfElementInReserve()
  {
    Survivor survivor = new Survivor("Antonio");
    survivor.getEquipment().addInReserve("pistol");
    assertThat(survivor.getEquipment().getInReserve().stream().findFirst().get(), is("pistol"));
  }
}
