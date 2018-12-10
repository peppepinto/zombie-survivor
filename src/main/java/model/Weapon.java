package model;

public enum Weapon
{
  FRYING_PAN(10),
  BASEBALL_PAT(40),
  KNIFE(50),
  KATANA(70),
  MOLOTOV(80),
  PISTOL(100);

  private int damage;

  Weapon(int damage)
  {
    this.damage = damage;
  }

  public int getDamage()
  {
    return damage;
  }
}
