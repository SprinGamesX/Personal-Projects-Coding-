package Basic;

import Relics.Stat;

public abstract class Character {

    protected int level;
    protected Path path;
    protected Elements element;
    protected Build build;

    protected Stat hp;
    protected Stat atk;
    protected Stat def;
    protected Stat spd;
    protected Stat critRate;
    protected Stat critDmg;
    protected Stat breakEffect;
    protected Stat effectHitRate;
    protected Stat elementalDmg;
    protected Stat allTypeDmg;

    public Character() {
        this.level = 80;
        build = new Build();
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    public Elements getElement() {
        return element;
    }

    public void setElement(Elements element) {
        this.element = element;
    }

    public Stat getHp() {
        return hp;
    }

    public void setHp(Stat hp) {
        this.hp = hp;
    }

    public Stat getAtk() {
        return atk;
    }

    public void setAtk(Stat atk) {
        this.atk = atk;
    }

    public Stat getDef() {
        return def;
    }

    public void setDef(Stat def) {
        this.def = def;
    }

    public Stat getSpd() {
        return spd;
    }

    public void setSpd(Stat spd) {
        this.spd = spd;
    }

    public Stat getCritRate() {
        return critRate;
    }

    public void setCritRate(Stat critRate) {
        this.critRate = critRate;
    }

    public Stat getCritDmg() {
        return critDmg;
    }

    public void setCritDmg(Stat critDmg) {
        this.critDmg = critDmg;
    }

    public Stat getBreakEffect() {
        return breakEffect;
    }

    public void setBreakEffect(Stat breakEffect) {
        this.breakEffect = breakEffect;
    }

    public Stat getEffectHitRate() {
        return effectHitRate;
    }

    public void setEffectHitRate(Stat effectHitRate) {
        this.effectHitRate = effectHitRate;
    }

    public Build getBuild() {
        return build;
    }

    public void setBuild(Build build) {
        this.build = build;
    }

    public Stat getElementalDmg() {
        return elementalDmg;
    }

    public void setElementalDmg(Stat elementalDmg) {
        this.elementalDmg = elementalDmg;
    }

    public Stat getAllTypeDmg() {
        return allTypeDmg;
    }

    public void setAllTypeDmg(Stat allTypeDmg) {
        this.allTypeDmg = allTypeDmg;
    }
}
