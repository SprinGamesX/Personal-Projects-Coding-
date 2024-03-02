package Relics;

public class Stat {


    private StatType type;
    private int base;
    private float bonusPercent;
    private int bonusFlat;

    public Stat(StatType type, int base, float bonusPercent, int bonusFlat) {
        this.type = type;
        this.base = base;
        this.bonusPercent = bonusPercent;
        this.bonusFlat = bonusFlat;
    }
    public Stat(StatType type, int base) {
        this.type = type;
        this.base = base;
    }

    public StatType getType() {
        return type;
    }

    public void setType(StatType type) {
        this.type = type;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public float getBonusPercent() {
        return bonusPercent;
    }

    public void setBonusPercent(float bonusPercent) {
        this.bonusPercent = bonusPercent;
    }

    public int getBonusFlat() {
        return bonusFlat;
    }

    public void setBonusFlat(int bonusFlat) {
        this.bonusFlat = bonusFlat;
    }

    public float getStat(){
        return base + base * bonusPercent + bonusFlat;
    }
}






