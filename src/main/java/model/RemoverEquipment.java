package model;

import java.util.List;

public class RemoverEquipment
{
  public void removeInHand(String item, List inHand){
    inHand.remove(item);
  }

  public void removeInReserve(String item, List inReserve){
    inReserve.remove(item);
  }
}
