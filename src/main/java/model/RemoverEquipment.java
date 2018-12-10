package model;

import java.util.List;

public class RemoverEquipment
{
  public void removeInHand(Weapon weapon, List inHand){
    inHand.remove(weapon);
  }

  public void removeInReserve(Weapon weapon, List inReserve){
    inReserve.remove(weapon);
  }
}
