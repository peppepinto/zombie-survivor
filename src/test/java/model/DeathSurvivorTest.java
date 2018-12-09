package model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DeathSurvivorTest
{
  private static final Survivor SURVIVOR_DEAD = new Survivor("Tommy");
  private static final DeathChecker DEATH_SURVIVOR_CHECKER = new DeathChecker();

  @Before
  public void setUp() throws Exception
  {
    SURVIVOR_DEAD.getWounds().lazySet(2);
  }

  @Test
  public void checkIfASurvivorIsNotDead()
  {
    assertFalse(DEATH_SURVIVOR_CHECKER.test(new Survivor("Frank")));
  }

  @Test
  public void checkIfASurvivorIsDead()
  {
    assertTrue(DEATH_SURVIVOR_CHECKER.test(SURVIVOR_DEAD));
  }

}
