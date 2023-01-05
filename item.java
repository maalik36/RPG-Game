public class item {
    String name;
    Integer offense;
    Integer defense;
    Integer healing;
    Integer magic;

    public void item(){

    }
    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getDefense() {
        return defense;
    }

    public Integer getHealing() {
        return healing;
    }

    public Integer getOffense() {
        return offense;
    }

    public String getName() {
        return name;
    }

    public void setHealing(Integer healing) {
        this.healing = healing;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOffense(Integer offense) {
        this.offense = offense;
    }

}
class sword extends  item{
    sword()
    {
        this.name = "Sword of Legend";
        this.offense = 17;
        this.defense = 3;
        this.healing = 0;
        this.magic = 0;
    }
}
class shield extends  item{
    shield()
    {
        this.name = "Heroes shield";
        this.offense = 0;
        this.defense = 17;
        this.healing = 0;
        this.magic = 0;
    }
}
class staff extends  item{
    staff()
    {
        this.name = "Mage's Staff";
        this.offense = 1;
        this.defense = 1;
        this.healing = 5;
        this.magic = 20;
    }
}
class scepter extends  item{
    scepter()
    {
        this.name = "Healing Scepter";
        this.offense = 1;
        this.defense = 1;
        this.healing = 20;
        this.magic = 5;
    }
}
class tongue extends  item{
    tongue()
    {
        this.name = "Tongue";
        this.offense = 6;
        this.defense = 0;
        this.healing = 0;
        this.magic = 1;
    }
}
class bigShield extends  item{
    bigShield()
    {
        this.name = "Iron Wall";
        this.offense = 5;
        this.defense = 25;
        this.healing = 0;
        this.magic = 0;
    }
}
class dagger extends  item{
    dagger()
    {
        this.name = "Thief's dagger";
        this.offense = 10;
        this.defense = 1;
        this.healing = 0;
        this.magic = 0;
    }
}
class gun extends  item{
    gun()
    {
        this.name = "GUN";
        this.offense = 20;
        this.defense = 0;
        this.healing = 0;
        this.magic = 10;
    }
}
class talons extends  item{
    talons()
    {
        this.name = "claws";
        this.offense = 8;
        this.defense = 0;
        this.healing = 0;
        this.magic = 0;
    }
}
class mouth extends  item{
    mouth()
    {
        this.name = "Teeth";
        this.offense = 17;
        this.defense = 0;
        this.healing = 0;
        this.magic = 0;
    }
}
class horns extends  item{
    horns()
    {
        this.name = "Goat horns";
        this.offense = 12;
        this.defense = 6;
        this.healing = 0;
        this.magic = 0;
    }
}
class evilStaff extends  item{
    evilStaff()
    {
        this.name = "Warlock's staff";
        this.offense = 3;
        this.defense = 3;
        this.healing = 0;
        this.magic = 30;
    }
}
class branch extends  item{
    branch()
    {
        this.name = "Just a branch";
        this.offense = 1;
        this.defense = 1;
        this.healing = 0;
        this.magic = 5;
    }
}
class spells extends  item{
    Integer MPCost;
}
class fire extends  spells{
    fire()
    {
        this.name = "Fire";
        this.offense = 0;
        this.defense = 0;
        this.healing = 0;
        this.magic = 10;
        this.MPCost = 5;
    }
}
class water extends  spells{
    water()
    {
        this.name = "Water";
        this.offense = 0;
        this.defense = 0;
        this.healing = 0;
        this.magic = 10;
        this.MPCost = 5;
    }
}
class earth extends  spells{
    earth()
    {
        this.name = "Earth";
        this.offense = 0;
        this.defense = 0;
        this.healing = 0;
        this.magic = 10;
        this.MPCost = 5;
    }
}
class air extends  spells{
    air()
    {
        this.name = "Air";
        this.offense = 0;
        this.defense = 0;
        this.healing = 0;
        this.magic = 10;
        this.MPCost = 5;
    }
}
class vines extends  spells{
    vines()
    {
        this.name = "Vines";
        this.offense = 0;
        this.defense = 0;
        this.healing = 0;
        this.magic = 10;
        this.MPCost = 5;
    }
}
class lightning extends  spells{
    lightning()
    {
        this.name = "Lightning";
        this.offense = 0;
        this.defense = 0;
        this.healing = 0;
        this.magic = 10;
        this.MPCost = 5;
    }
}
class buffDefenses extends  spells{
    buffDefenses()
    {
        this.name = "Guard Up";
        this.offense = 0;
        this.defense = 0;
        this.healing = 0;
        this.magic = 0;
        this.MPCost = 15;
    }
    public void guardUp(){

    }
}
class heal extends  spells{
    heal()
    {
        this.name = "Heal";
        this.offense = 0;
        this.defense = 0;
        this.healing = 10;
        this.magic = 0;
        this.MPCost = 10;
    }
}
class midHeal extends  spells{
    midHeal()
    {
        this.name = "MidHeal";
        this.offense = 0;
        this.defense = 0;
        this.healing = 20;
        this.magic = 0;
        this.MPCost = 20;
    }
}
class bigHeal extends  spells{
    bigHeal()
    {
        this.name = "BigHeal";
        this.offense = 0;
        this.defense = 0;
        this.healing = 50;
        this.magic = 0;
        this.MPCost = 40;
    }
}
class stronk extends  spells{
    stronk()
    {
        this.name = "Stronk";
        this.offense = 0;
        this.defense = 0;
        this.healing = 0;
        this.magic = 10;
        this.MPCost = 15;
    }
}
class magBuff extends  spells{
    magBuff()
    {
        this.name = "Power Surge";
        this.offense = 0;
        this.defense = 0;
        this.healing = 0;
        this.magic = 10;
        this.MPCost = 15;
    }
}
class speedBuff extends  spells{
    speedBuff()
    {
        this.name = "I am Speed";
        this.offense = 0;
        this.defense = 0;
        this.healing = 0;
        this.magic = 10;
        this.MPCost = 15;
    }
}
