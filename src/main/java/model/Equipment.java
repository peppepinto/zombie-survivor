package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Equipment
{
  private Collection inHand = new ArrayList<String>();
  private Collection inReserve = new ArrayList<String>();
  private AdderEquipment adderEquipment = new AdderEquipment();
  private RemoverEquipment removerEquipment = new RemoverEquipment();

  public Collection getInHand()
  {
    return Collections.unmodifiableCollection(inHand);
  }

  public Collection getInReserve()
  {
    return Collections.unmodifiableCollection(inReserve);
  }

  public void addInHand(String item){
    adderEquipment.addInHand(item, (List) inHand);
  }

  public void addInReserve(String item){
    adderEquipment.addInReserve(item, (List) inReserve);
  }

  public void removeInHand(String item){
    removerEquipment.removeInHand(item, (List) inHand);
  }

  public void removeInReserve(String item){
    removerEquipment.removeInReserve(item, (List) inReserve);
  }
}

