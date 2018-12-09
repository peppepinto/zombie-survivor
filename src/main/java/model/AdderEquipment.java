package model;

import java.util.List;

public class AdderEquipment
{
  public void addInHand(String item, List<String> inHand){
    inHand.add(item);
  }

  public void addInReserve(String item, List<String> inReserve){
    inReserve.add(item);
  }
}
