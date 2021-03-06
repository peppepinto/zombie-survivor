package model;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Survivor
{
  private String name;
  private AtomicInteger wounds;
  private Equipment equipment;
  private Action[] actions;

  public Survivor(String name)
  {
    this.name = name;
    this.wounds = new AtomicInteger();
    this.actions = new Action[3];
    this.equipment = new Equipment();
  }

  public String getName()
  {
    return name;
  }

  public AtomicInteger getWounds()
  {
    return wounds;
  }

  public Action[] getActions()
  {
    return actions;
  }

  public Equipment getEquipment()
  {
    return equipment;
  }
}