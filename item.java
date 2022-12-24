public class item {
    String name;
    Integer offense;
    Integer defense;
    Integer healing;

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
