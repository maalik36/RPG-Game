public class Heroes {
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
        Integer value = getDefense() - amount;
        other.setHP(other.getHP() - value);
    }

};


