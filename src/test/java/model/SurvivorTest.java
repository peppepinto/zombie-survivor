package model;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class SurvivorTest
{
  private static final Survivor SURVIVOR_ALIVE = new Survivor("Antonio");

  @Test
  public void notNullNameForSurvivor()
  {
    assertNotNull(SURVIVOR_ALIVE.getName());
  }

  @Test
  public void hasZeroWoundsForSurvivor()
  {
    assertThat(SURVIVOR_ALIVE.getWounds().get(), is(0));
  }

  @Test
  public void checkIfTheNumberOfActionsIsThreeAtStartTime()
  {
    assertThat(SURVIVOR_ALIVE.getActions().length, is(3));
  }

}
