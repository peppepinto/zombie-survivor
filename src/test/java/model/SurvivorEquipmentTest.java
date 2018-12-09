package model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class SurvivorEquipmentTest
{
  private static final Survivor SURVIVOR_ALIVE = new Survivor("Antonio");

  @Test
  public void hasAListOfEquipment()
  {
    assertNotNull(SURVIVOR_ALIVE.getEquipments());
  }

  @Before
  public void setUp() throws Exception
  {
    for (int i=0; i<SURVIVOR_ALIVE.getEquipments().length; i++){
      SURVIVOR_ALIVE.getEquipments()[i] = new Equipment("pistol");
    }
  }

  @Test(expected = ArrayIndexOutOfBoundsException.class)
  public void illegalNumberOfEquipments()
  {
    SURVIVOR_ALIVE.getEquipments()[SURVIVOR_ALIVE.getEquipments().length] = new Equipment("pistol");
  }

}
