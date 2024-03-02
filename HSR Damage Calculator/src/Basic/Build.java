package Basic;

import Relics.*;
public class Build {

    private Relic[] relics;
    private PlanerOrnament[] ornaments;

    public Build(Relic[] relics, PlanerOrnament[] ornaments) {
        this.relics = relics;
        this.ornaments = ornaments;
    }

    public Build() {
        this.relics = new Relic[4];
        this.ornaments = new PlanerOrnament[2];
    }

    // O(n^2)
    public float getStatBonus(AttributeType type){
        float bonus = 0;
        for (Relic relic : relics){
            bonus += relic.getStat(type);
        }
        return bonus;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Relic r : relics){
            s.append(r).append("\n");
        }
        for (PlanerOrnament p : ornaments){
            s.append(p).append("\n");
        }
        return s.toString();
    }
}
