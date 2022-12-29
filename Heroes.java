import java.util.Scanner;

public class Heroes {
    String name;
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
    String items[];
    String spells[];

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

    public String[] getItems() {
        return items;
    }

    public String getName() {
        return name;
    }

    public String[] getSpells() {
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

    public void setMagic(Integer magic) {
        Magic = magic;
    }

    public void setSpells(String[] spells) {
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

    public void setItems(String[] items) {
        this.items = items;
    }

    public void setName(String name) {
        this.name = name;
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
        for (Integer i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }
    public void spells(){
        for (Integer i = 0; i < spells.length; i++) {
            System.out.println(spells[i]);
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
    }
    public void slashOfJustice(item move, Heroes other){
        Integer damage = attacking(move) * 3;
        System.out.println("Hero used Slash of Justice!");
        Integer value = other.getDefense() - damage;
        other.setHP(other.getHP() + value);

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
    }
    public void slashOfJustice(item move, Heroes other){
        Integer damage = attacking(move) * 3;
        System.out.println("Hero used Slash of Justice!");
        Integer value = other.getDefense() - damage;
        other.setHP(other.getHP() + value);

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
    }
    public void slashOfJustice(item move, Heroes other){
        Integer damage = attacking(move) * 3;
        System.out.println("Hero used Slash of Justice!");
        Integer value = other.getDefense() - damage;
        other.setHP(other.getHP() + value);

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
    }
    public void slashOfJustice(item move, Heroes other){
        Integer damage = attacking(move) * 3;
        System.out.println("Hero used Slash of Justice!");
        Integer value = other.getDefense() - damage;
        other.setHP(other.getHP() + value);

    }
}
class Sweeper extends Heroes{
    public void Sweeper(){
        Scanner name = new Scanner(System.in);
        System.out.println("Enter name.");
        this.name = name.nextLine();
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
    }
    public void slashOfJustice(item move, Heroes other){
        Integer damage = attacking(move) * 3;
        System.out.println("Hero used Slash of Justice!");
        Integer value = other.getDefense() - damage;
        other.setHP(other.getHP() + value);

    }
}
class Shield extends Heroes{
    public void Shield(){
        Scanner name = new Scanner(System.in);
        System.out.println("Enter name.");
        this.name = name.nextLine();
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
    }
    public void slashOfJustice(item move, Heroes other){
        Integer damage = attacking(move) * 3;
        System.out.println("Hero used Slash of Justice!");
        Integer value = other.getDefense() - damage;
        other.setHP(other.getHP() + value);

    }
}
class Shrub extends Heroes{
    public void Shrub(){
        this.name = "Awakened Shrub";
        this.Attack = 1;
        this.HP = 50;
        this.MP = 100;
        this.Defense = 50;
        this.Evasion = 1;
        this.HealingMagic = 100;
        this.MagicDefense = 50;
        this.Speed = 1;
        this.Magic = 15;
        this.Specials = "Awakened State";
    }
    public void slashOfJustice(item move, Heroes other){
        Integer damage = attacking(move) * 3;
        System.out.println("Hero used Slash of Justice!");
        Integer value = other.getDefense() - damage;
        other.setHP(other.getHP() + value);

    }
}
class Nothic extends Heroes{
    public void Nothic(){
        this.name = "Nothic";
        this.Attack = 1;
        this.HP = 50;
        this.MP = 100;
        this.Defense = 50;
        this.Evasion = 1;
        this.HealingMagic = 100;
        this.MagicDefense = 50;
        this.Speed = 1;
        this.Magic = 15;
        this.Specials = "Awakened State";
    }
    public void slashOfJustice(item move, Heroes other){
        Integer damage = attacking(move) * 3;
        System.out.println("Hero used Slash of Justice!");
        Integer value = other.getDefense() - damage;
        other.setHP(other.getHP() + value);

    }
}
class Rats extends Heroes{
    public void Rats(){
        this.name = "Rats";
        this.Attack = 1;
        this.HP = 50;
        this.MP = 100;
        this.Defense = 50;
        this.Evasion = 1;
        this.HealingMagic = 100;
        this.MagicDefense = 50;
        this.Speed = 1;
        this.Magic = 15;
        this.Specials = "Awakened State";
    }
    public void slashOfJustice(item move, Heroes other){
        Integer damage = attacking(move) * 3;
        System.out.println("Hero used Slash of Justice!");
        Integer value = other.getDefense() - damage;
        other.setHP(other.getHP() + value);

    }
}
class Hawk extends Heroes{
    public void Hawk(){
        this.name = "Hawk";
        this.Attack = 1;
        this.HP = 50;
        this.MP = 100;
        this.Defense = 50;
        this.Evasion = 1;
        this.HealingMagic = 100;
        this.MagicDefense = 50;
        this.Speed = 1;
        this.Magic = 15;
        this.Specials = "Awakened State";
    }
    public void slashOfJustice(item move, Heroes other){
        Integer damage = attacking(move) * 3;
        System.out.println("Hero used Slash of Justice!");
        Integer value = other.getDefense() - damage;
        other.setHP(other.getHP() + value);

    }
}
class Eagle extends Heroes{
    public void Eagle(){
        this.name = "Eagle";
        this.Attack = 1;
        this.HP = 50;
        this.MP = 100;
        this.Defense = 50;
        this.Evasion = 1;
        this.HealingMagic = 100;
        this.MagicDefense = 50;
        this.Speed = 1;
        this.Magic = 15;
        this.Specials = "Awakened State";
    }
    public void slashOfJustice(item move, Heroes other){
        Integer damage = attacking(move) * 3;
        System.out.println("Hero used Slash of Justice!");
        Integer value = other.getDefense() - damage;
        other.setHP(other.getHP() + value);

    }
}
class Panther extends Heroes{
    public void Panther(){
        this.name = "Panther";
        this.Attack = 1;
        this.HP = 50;
        this.MP = 100;
        this.Defense = 50;
        this.Evasion = 1;
        this.HealingMagic = 100;
        this.MagicDefense = 50;
        this.Speed = 1;
        this.Magic = 15;
        this.Specials = "Awakened State";
    }
    public void slashOfJustice(item move, Heroes other){
        Integer damage = attacking(move) * 3;
        System.out.println("Hero used Slash of Justice!");
        Integer value = other.getDefense() - damage;
        other.setHP(other.getHP() + value);

    }
}
class AnimatedArmor extends Heroes{
    public void AnimatedArmor(){
        this.name = "Animated Armor";
        this.Attack = 1;
        this.HP = 50;
        this.MP = 100;
        this.Defense = 50;
        this.Evasion = 1;
        this.HealingMagic = 100;
        this.MagicDefense = 50;
        this.Speed = 1;
        this.Magic = 15;
        this.Specials = "Awakened State";
    }
    public void slashOfJustice(item move, Heroes other){
        Integer damage = attacking(move) * 3;
        System.out.println("Hero used Slash of Justice!");
        Integer value = other.getDefense() - damage;
        other.setHP(other.getHP() + value);

    }
}
class Goat extends Heroes{
    public void Goat(){
        this.name = "Goat";
        this.Attack = 1;
        this.HP = 50;
        this.MP = 100;
        this.Defense = 50;
        this.Evasion = 1;
        this.HealingMagic = 100;
        this.MagicDefense = 50;
        this.Speed = 1;
        this.Magic = 15;
        this.Specials = "Awakened State";
    }
    public void slashOfJustice(item move, Heroes other){
        Integer damage = attacking(move) * 3;
        System.out.println("Hero used Slash of Justice!");
        Integer value = other.getDefense() - damage;
        other.setHP(other.getHP() + value);

    }
}
class GiantShark extends Heroes{
    public void GiantShark(){
        this.name = "Giant Shark";
        this.Attack = 1;
        this.HP = 50;
        this.MP = 100;
        this.Defense = 50;
        this.Evasion = 1;
        this.HealingMagic = 100;
        this.MagicDefense = 50;
        this.Speed = 1;
        this.Magic = 15;
        this.Specials = "Awakened State";
    }
    public void slashOfJustice(item move, Heroes other){
        Integer damage = attacking(move) * 3;
        System.out.println("Hero used Slash of Justice!");
        Integer value = other.getDefense() - damage;
        other.setHP(other.getHP() + value);

    }
}
class BlinkDog extends Heroes{
    public void BlinkDog(){
        this.name = "Blink Dog";
        this.Attack = 1;
        this.HP = 50;
        this.MP = 100;
        this.Defense = 50;
        this.Evasion = 1;
        this.HealingMagic = 100;
        this.MagicDefense = 50;
        this.Speed = 1;
        this.Magic = 15;
        this.Specials = "Awakened State";
    }
    public void slashOfJustice(item move, Heroes other){
        Integer damage = attacking(move) * 3;
        System.out.println("Hero used Slash of Justice!");
        Integer value = other.getDefense() - damage;
        other.setHP(other.getHP() + value);

    }
}



