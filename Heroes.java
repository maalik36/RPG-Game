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

    public void Attacking(){

    }
};

