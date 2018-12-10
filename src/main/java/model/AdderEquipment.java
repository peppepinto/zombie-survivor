package model;

import java.util.List;

public class AdderEquipment
{

  private static final int MAX_ELEMENT_IN_HAND =2;
  private static final int MAX_ELEMENT_IN_RESERVE =3;

  public void addInHand(String item, List<String> inHand)
  {
    if(inHand.size()< MAX_ELEMENT_IN_HAND){
      inHand.add(item);
    }else {
      throw new AdderEquipmentException("The survivor just have 2 element in hand");
    }
  }

  public void addInReserve(String item, List<String> inReserve){
    if(inReserve.size()< MAX_ELEMENT_IN_RESERVE){
      inReserve.add(item);
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
