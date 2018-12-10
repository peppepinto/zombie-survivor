package model;

import java.util.List;

public class AdderEquipment
{
  private static final int MAX_WEAPON_IN_HAND = 2;
  private static final int MAX_WEAPON_IN_RESERVE = 3;

  public void addInHand(Weapon weapon, List<Weapon> inHand)
  {
    if(inHand.size()< MAX_WEAPON_IN_HAND){
      inHand.add(weapon);
    }else {
      throw new AdderEquipmentException("The survivor just have 2 weapons in hand");
    }
  }

  public void addInReserve(Weapon weapon, List<Weapon> inReserve){
    if(inReserve.size()< MAX_WEAPON_IN_RESERVE){
      inReserve.add(weapon);
    }else {
      throw new AdderEquipmentException("The reserve is full");
    }
  }

  private class AdderEquipmentException extends RuntimeException
  {
    AdderEquipmentException(String message)
    {
      super(message);
    }
  }
}
