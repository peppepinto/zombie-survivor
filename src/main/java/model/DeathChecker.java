package model;

import java.util.function.Predicate;

public class DeathChecker implements Predicate<Survivor>
{
  @Override
  public boolean test(Survivor survivor)
  {
    return survivor.getWounds().get()>=2;
  }
}
