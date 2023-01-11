import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Heroes {
    String name;
    String type;
    Integer HP;
    Integer Attack;
    Integer Defense;
    Integer Magic;
    Integer MagicDefense;
    Integer HealingMagic;
    Integer Evasion;
    Integer Speed;
    Integer MP;
    String Specials;
    Vector<item> items;
    Vector<item> spells;
    Boolean agro = false;

    public Integer getAttack() {
        return Attack;
    }

    public Integer getDefense() {
        return Defense;
    }

    public Integer getEvasion() {
        return Evasion;
    }

    public Integer getHealingMagic() {
        return HealingMagic;
    }

    public Integer getHP() {
        return HP;
    }

    public Integer getMagic() {
        return Magic;
    }

    public Integer getMagicDefense() {
        return MagicDefense;
    }

    public Integer getSpeed() {
        return Speed;
    }

    public Integer getMP() {
        return MP;
    }

    public Vector<item> getItems() {
        return items;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Vector<item> getSpells() {
        return spells;
    }

    public void setAttack(Integer attack) {
        Attack = attack;
    }

    public void setDefense(Integer defense) {
        Defense = defense;
    }

    public void setEvasion(Integer evasion) {
        Evasion = evasion;
    }

    public void setHealingMagic(Integer healingMagic) {
        HealingMagic = healingMagic;
    }

    public String getSpecials() {
        return Specials;
    }

    public void setHP(Integer HP) {
        this.HP = HP;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMagic(Integer magic) {
        Magic = magic;
    }

    public void setSpells(Vector<item> spells) {
        this.spells = spells;
    }

    public void setMagicDefense(Integer magicDefense) {
        MagicDefense = magicDefense;
    }

    public void setMP(Integer MP) {
        this.MP = MP;
    }

    public void setSpecials(String specials) {
        Specials = specials;
    }

    public void setSpeed(Integer speed) {
        Speed = speed;
    }

    public void setItems(Vector<item> items) {
        this.items = items;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Special(item move, Heroes hero, Vector<Heroes> good, Vector<Heroes> bad){

    }

    public Integer attacking(item move){
        Integer damage = move.getOffense() * this.Attack;
        return damage;
    }

    public void parry()
    {

    }
    public void defend(){
        this.setDefense(this.getDefense() + 100);
        this.setMagicDefense(this.getMagicDefense() + 100);
    }
    public void item(){
        for (Integer i = 0; i < items.size(); i++) {
            System.out.println(items.elementAt(i));

        }
    }
    public void spells(Vector<Heroes> turnOrder){
        Scanner response = new Scanner(System.in);
        System.out.println("Which spell would you like to use?");
        for (Integer i = 0; i < this.spells.size(); i++) {
            System.out.println(this.spells.elementAt(i).name);
        }
        String answer = response.nextLine();
        for (Integer i = 0; i < this.spells.size(); i++)
        {
            if (this.spells.elementAt(i).name == answer)
            {
                System.out.println("Who would you like to use it on?");
                for (Integer j = 0; j < turnOrder.size(); j++)
                {
                    System.out.println(turnOrder.elementAt(j).name);
                    answer = response.nextLine();
                    for (Integer k = 0; k < turnOrder.size(); k++)
                    {
                        if (turnOrder.elementAt(k).name == answer)
                        {
                            this.damage(this.spells.elementAt(i), turnOrder.elementAt(k));
                        }
                    }
                }
            }
        }
    }
    public void damage(item move, Heroes other){
        Integer amount = attacking(move);
        Integer value = other.getDefense() - amount;
        other.setHP(other.getHP() + value);
    }


};
class Hero extends Heroes{
    public void Hero(){
        Scanner name = new Scanner(System.in);
        System.out.println("Enter name.");
        this.name = name.nextLine();
        this.type = "good";
        this.Attack = 10;
        this.HP = 100;
        this.MP = 100;
        this.Defense = 10;
        this.Evasion = 10;
        this.HealingMagic = 10;
        this.MagicDefense = 10;
        this.Speed = 10;
        this.Magic = 10;
        this.Specials = "Slash of Justice";
        item sword = new sword();
        this.items.add(sword);
        item shield = new shield();
        this.items.add(shield);
        spells lightning = new lightning();
        this.spells.add(lightning);
        spells heal = new heal();
        this.spells.add(heal);
        spells stronk = new stronk();
        this.spells.add(stronk);


    }
    public void Special(item move, Heroes hero, Vector<Heroes> good, Vector<Heroes> bad){
        Integer damage = attacking(move) * 3;
        System.out.println("Hero used Slash of Justice!");
        Integer value = hero.getDefense() - damage;
        hero.setHP(hero.getHP() + value);

    }
}
/*
add group healing
 */
class Healer extends Heroes{
    public void Healer(){
        Scanner name = new Scanner(System.in);
        System.out.println("Enter name.");
        this.name = name.nextLine();
        this.type = "good";
        this.Attack = 5;
        this.HP = 130;
        this.MP = 170;
        this.Defense = 10;
        this.Evasion = 10;
        this.HealingMagic = 100;
        this.MagicDefense = 70;
        this.Speed = 10;
        this.Magic = 40;
        this.Specials = "Angelic Presence";
        item scepter = new scepter();
        this.items.add(scepter);
        spells air = new air();
        this.spells.add(air);
        spells vines = new vines();
        this.spells.add(vines);
        spells heal = new heal();
        this.spells.add(heal);
        spells midHeal = new midHeal();
        this.spells.add(midHeal);
        spells bigHeal = new bigHeal();
        this.spells.add(bigHeal);
    }
    public void Special(item move, Heroes hero, Vector<Heroes> good, Vector<Heroes> bad){
        for (Integer i = 0; i < good.size(); i++)
        {
            good.elementAt(i).HP = good.elementAt(i).HP + (this.HealingMagic / 2);
        }
        this.MP = this.MP / 2;

    }
}
/*
add attacking multiple opponents
 */
class Mage extends Heroes{
    public void Mage(){
        Scanner name = new Scanner(System.in);
        System.out.println("Enter name.");
        this.name = name.nextLine();
        this.type = "good";
        this.Attack = 5;
        this.HP = 70;
        this.MP = 250;
        this.Defense = 10;
        this.Evasion = 10;
        this.HealingMagic = 5;
        this.MagicDefense = 30;
        this.Speed = 10;
        this.Magic = 100;
        this.Specials = "Basically a nuke";
        item staff = new staff();
        this.items.add(staff);
        spells fire = new fire();
        spells water = new water();
        spells earth = new earth();
        spells air = new air();
        spells lightning = new lightning();
        spells vine = new vines();
        spells magBuff = new magBuff();
        this.spells.add(fire);
        this.spells.add(water);
        this.spells.add(earth);
        this.spells.add(air);
        this.spells.add(lightning);
        this.spells.add(vine);
        this.spells.add(magBuff);
    }
    public void Special(item move, Heroes hero, Vector<Heroes> good, Vector<Heroes> bad){
        for (Integer i = 0; i < bad.size(); i++)
        {
            bad.elementAt(i).HP = bad.elementAt(i).HP - this.Magic;
        }
        this.MP = 0;
    }
}
/*
Add missing mechanic
 */
class Chameleon extends Heroes{
    public void Chameleon(){
        Scanner name = new Scanner(System.in);
        System.out.println("Enter name.");
        this.name = name.nextLine();
        this.type = "good";
        this.Attack = 7;
        this.HP = 50;
        this.MP = 100;
        this.Defense = 9;
        this.Evasion = 100;
        this.HealingMagic = 0;
        this.MagicDefense = 11;
        this.Speed = 100;
        this.Magic = 10;
        this.Specials = "Group Camo";
        item tongue = new tongue();
        this.items.add(tongue);
        spells earth = new earth();
        this.spells.add(earth);
    }
    public void Special(item move, Heroes hero, Vector<Heroes> good, Vector<Heroes> bad){
        for (Integer i = 0; i < good.size(); i++)
        {
            good.elementAt(i).Evasion = good.elementAt(i).Evasion + (good.elementAt(i).Evasion / 2);
        }

    }
}
class Sweeper extends Heroes{
    public void Sweeper(){
        Scanner name = new Scanner(System.in);
        System.out.println("Enter name.");
        this.name = name.nextLine();
        this.type = "good";
        this.Attack = 150;
        this.HP = 100;
        this.MP = 100;
        this.Defense = 5;
        this.Evasion = 50;
        this.HealingMagic = 0;
        this.MagicDefense = 5;
        this.Speed = 120;
        this.Magic = 10;
        this.Specials = "The Sweep";
        item dagger = new dagger();
        this.items.add(dagger);
        spells water = new water();
        spells speedBuff = new speedBuff();
        this.spells.add(water);
        this.spells.add(speedBuff);
    }
    public void Special(item move, Heroes hero, Vector<Heroes> good, Vector<Heroes> bad){
        for (Integer i = 0; i < bad.size(); i++)
        {
            this.damage(this.items.elementAt(0), bad.elementAt(i));
        }
        this.MP = this.MP - 25;



    }
}
class Shield extends Heroes{
    public void Shield(){
        Scanner name = new Scanner(System.in);
        System.out.println("Enter name.");
        this.name = name.nextLine();
        this.type = "good";
        this.Attack = 3;
        this.HP = 200;
        this.MP = 100;
        this.Defense = 150;
        this.Evasion = 1;
        this.HealingMagic = 10;
        this.MagicDefense = 100;
        this.Speed = 1;
        this.Magic = 10;
        this.Specials = "Take Agro";
        item bigShield = new bigShield();
        this.items.add(bigShield);
        spells buffDefenses = new buffDefenses();
        this.spells.add(buffDefenses);
    }
    public void Special(item move, Heroes hero, Vector<Heroes> good, Vector<Heroes> bad){
        this.agro = true;

    }
}
class Shrub extends Heroes{
    public void Shrub(){
        this.name = "Awakened Shrub";
        this.Attack = 1;
        this.type = "bad";
        this.HP = 50;
        this.MP = 100;
        this.Defense = 50;
        this.Evasion = 1;
        this.HealingMagic = 100;
        this.MagicDefense = 50;
        this.Speed = 1;
        this.Magic = 15;
        this.Specials = "Awakened State";
        item branch = new branch();
        this.items.add(branch);
        spells vine = new vines();
        this.spells.add(vine);
    }
    public void Special(item move, Heroes hero, Vector<Heroes> good, Vector<Heroes> bad){
        this.Attack = 10;
        this.Evasion = 10;
        this.Magic = 25;

    }
}
class Nothic extends Heroes{
    public void Nothic(){
        this.name = "Nothic";
        this.Attack = 3;
        this.type = "bad";
        this.HP = 100;
        this.MP = 500;
        this.Defense = 50;
        this.Evasion = 1;
        this.HealingMagic = 100;
        this.MagicDefense = 100;
        this.Speed = 5;
        this.Magic = 200;
        this.Specials = "Summon the undead";
        item evilStaff = new evilStaff();
        this.items.add(evilStaff);
        spells fire = new fire();
        spells water = new water();
        spells earth = new earth();
        spells air = new air();
        spells lightning = new lightning();
        spells vine = new vines();
        spells magBuff = new magBuff();
        this.spells.add(fire);
        this.spells.add(water);
        this.spells.add(earth);
        this.spells.add(air);
        this.spells.add(lightning);
        this.spells.add(vine);
        this.spells.add(magBuff);
    }
    public void Special(item move, Heroes hero, Vector<Heroes> good, Vector<Heroes> bad){
        Random rand = new Random();
        Integer number = rand.nextInt(3);
        for (Integer i = 0; i < number; i++)
        {
            Heroes Undead = new Undead();
            bad.add(Undead);
        }
        this.MP = this.MP - 50;

    }
}
class Rats extends Heroes{
    public void Rats(){
        this.name = "Rats";
        this.type = "bad";
        this.Attack = 25;
        this.HP = 250;
        this.MP = 125;
        this.Defense = 30;
        this.Evasion = 5;
        this.HealingMagic = 0;
        this.MagicDefense = 30;
        this.Speed = 13;
        this.Magic = 0;
        this.Specials = "Rat attack";
        item mouth = new mouth();
        this.items.add(mouth);

    }
    public void Special(item move, Heroes hero, Vector<Heroes> good, Vector<Heroes> bad){
        for (Integer i = 0; i < bad.size(); i++)
        {
            this.damage(this.items.elementAt(0), good.elementAt(i));
        }
        this.MP = this.MP - 25;

    }
}
class Hawk extends Heroes{
    public void Hawk(){
        this.name = "Hawk";
        this.type = "bad";
        this.Attack = 13;
        this.HP = 100;
        this.MP = 100;
        this.Defense = 20;
        this.Evasion = 7;
        this.HealingMagic = 0;
        this.MagicDefense = 30;
        this.Speed = 10;
        this.Magic = 20;
        this.Specials = "Air advantage";
        item talons = new talons();
        this.items.add(talons);
        spells air = new air();
        this. spells.add(air);

    }
    public void Special(item move, Heroes hero, Vector<Heroes> good, Vector<Heroes> bad){
        this.Speed = this.Speed * 2;
        this.Evasion = this.Evasion * 2;

    }
}
class Eagle extends Heroes{
    public void Eagle(){
        this.name = "Eagle";
        this.type = "bad";
        this.Attack = 15;
        this.HP = 100;
        this.MP = 100;
        this.Defense = 30;
        this.Evasion = 3;
        this.HealingMagic = 0;
        this.MagicDefense = 20;
        this.Speed = 15;
        this.Magic = 10;
        this.Specials = "America";
        item talons = new talons();
        this.items.add(talons);
        spells air = new air();
        this. spells.add(air);
    }
    public void Special(item move, Heroes hero, Vector<Heroes> good, Vector<Heroes> bad){
        item talons = new talons();
        item gun = new gun();
        this.items.remove(talons);
        this.items.add(gun);
        this.MP = 0;

    }
}
class Panther extends Heroes{
    public void Panther(){
        this.name = "Panther";
        this.type = "bad";
        this.Attack = 17;
        this.HP = 100;
        this.MP = 100;
        this.Defense = 50;
        this.Evasion = 7;
        this.HealingMagic = 0;
        this.MagicDefense = 80;
        this.Speed = 10;
        this.Magic = 0;
        this.Specials = "The Purple fruit from Black Panther";
        item claws = new talons();
        this.items.add(claws);

    }
    public void Special(item move, Heroes hero, Vector<Heroes> good, Vector<Heroes> bad){
        this.Attack = this.Attack + 5;
        this.Defense = this.Defense + 10;
        this.Evasion = this.Evasion * 2;
        this.MagicDefense = this.MagicDefense + 5;
        this.Speed = this.Speed + 1;
        this.MP = 0;

    }
}
class AnimatedArmor extends Heroes{

    public void AnimatedArmor(){
        this.name = "Animated Armor";
        this.type = "bad";
        this.Attack = 1;
        this.HP = 10;
        this.MP = 100;
        this.Defense = 100;
        this.Evasion = 1;
        this.HealingMagic = 100;
        this.MagicDefense = 100;
        this.Speed = 1;
        this.Magic = 15;
        this.Specials = "Possessed by Ghost";
        item bigShield = new bigShield();
        this.items.add(bigShield);
        spells buffDefenses = new buffDefenses();
        this.spells.add(buffDefenses);

    }
    public void Special(item move, Heroes hero, Vector<Heroes> good, Vector<Heroes> bad){
        this.Attack = 10;
        this.Speed = 3;
        this.MP = 0;

    }
}
class Goat extends Heroes{
    public void Goat(){
        this.name = "Goat";
        this.type = "bad";
        this.Attack = 11;
        this.HP = 100;
        this.MP = 100;
        this.Defense = 30;
        this.Evasion = 1;
        this.HealingMagic = 0;
        this.MagicDefense = 55;
        this.Speed = 5;
        this.Magic = 0;
        this.Specials = "Grass";
        item horns = new horns();
        this.items.add(horns);
    }
    public void Special(item move, Heroes hero, Vector<Heroes> good, Vector<Heroes> bad){
        this.HP = this.HP + 10;

    }
}
class GiantShark extends Heroes{
    public void GiantShark(){
        this.name = "Giant Shark";
        this.type = "bad";
        this.Attack = 20;
        this.HP = 100;
        this.MP = 100;
        this.Defense = 60;
        this.Evasion = 1;
        this.HealingMagic = 0;
        this.MagicDefense = 10;
        this.Speed = 2;
        this.Magic = 10;
        this.Specials = "Dynamax";
        item teeth = new mouth();
        this.items.add(teeth);
        spells water = new water();
        this.spells.add(water);
    }
    public void Special(item move, Heroes hero, Vector<Heroes> good, Vector<Heroes> bad){
        this.HP = this.HP * 2;
        this.MP = 0;

    }
}
class BlinkDog extends Heroes{
    public void BlinkDog(){
        this.name = "Blink Dog";
        this.type = "bad";
        this.Attack = 5;
        this.HP = 50;
        this.MP = 100;
        this.Defense = 50;
        this.Evasion = 5;
        this.HealingMagic = 0;
        this.MagicDefense = 50;
        this.Speed = 5;
        this.Magic = 15;
        this.Specials = "A SHOTGUN";
        item gun = new gun();
        this.items.add(gun);
        spells lightning = new lightning();
        this.spells.add(lightning);
    }
    public void Special(item move, Heroes hero, Vector<Heroes> good, Vector<Heroes> bad){
        this.Attack = this.Attack * 5;
        this.MP = 0;

    }
}
class Kufra extends Heroes{
    public void Kufra()
    {
        this.name = "Kufra the soul god";
        this.type = "bad";
        this.Attack = 50;
        this.HP = 500;
        this.MP = 100;
        this.Defense = 100;
        this.Evasion = 10;
        this.HealingMagic = 0;
        this.MagicDefense = 100;
        this.Speed = 15;
        this.Magic = 100;
        this.Specials = "resurrection";
        item gun = new gun();
        this.items.add(gun);
        spells lightning = new lightning();
        this.spells.add(lightning);
    }
    public void Special(item move, Heroes hero, Vector<Heroes> good, Vector<Heroes> bad){
        Shrub shrub = new Shrub();
        Rats rats = new Rats();
        Hawk hawk = new Hawk();
        Eagle eagle = new Eagle();
        Panther panther = new Panther();
        Goat goat = new Goat();
        GiantShark giantShark = new GiantShark();
        BlinkDog blinkDog = new BlinkDog();
        Nothic nothic = new Nothic();
        AnimatedArmor animatedArmor = new AnimatedArmor();
        Random rand = new Random();
        Integer choice = rand.nextInt(10);
        switch (choice)

        {
            case 0:{
                bad.add(shrub);
            }
            case 1:{
                bad.add(rats);

            }
            case 2:
            {
                bad.add(hawk);
            }
            case 3:
            {
                bad.add(eagle);
            }
            case 4:
            {
                bad.add(panther);

            }
            case 5:
            {
                bad.add(goat);
            }
            case 6:
            {
                bad.add(giantShark);
            }
            case 7:
            {
                bad.add(blinkDog);
            }
            case 8:
            {
                bad.add(animatedArmor);
            }
            case 9:
            {
                bad.add(nothic);
            }
        }

    }
}
class Undead extends Heroes{
    public void Undead()
    {
        this.name = "Undead";
        this.Attack = 5;
        this.type = "bad";
        this.HP = 10;
        this.MP = 0;
        this.Defense = 20;
        this.Evasion = 1;
        this.HealingMagic = 0;
        this.MagicDefense = 50;
        this.Speed = 1;
        this.Magic = 0;
        this.Specials = "Die";
    }


    public void Special(item move, Heroes hero, Vector<Heroes> good, Vector<Heroes> bad) {
        this.HP = 0;
    }
}



