package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Equipment
{
  private Collection inHand = new ArrayList<Weapon>();
  private Collection inReserve = new ArrayList<Weapon>();
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

  public void addInHand(Weapon weapon)
  {
    adderEquipment.addInHand(weapon, (List) inHand);
  }

  public void addInReserve(Weapon weapon){
    adderEquipment.addInReserve(weapon, (List) inReserve);
  }

  public void removeInHand(Weapon weapon){
    removerEquipment.removeInHand(weapon, (List) inHand);
  }

  public void removeInReserve(Weapon weapon){
    removerEquipment.removeInReserve(weapon, (List) inReserve);
  }
}

