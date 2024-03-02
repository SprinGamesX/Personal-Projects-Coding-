package Trailblazers;

import Basic.Character;
import Basic.Elements;
import Basic.Path;
import Relics.Stat;
import Relics.StatType;

public class TrailblazerPhysical extends Character {

    public TrailblazerPhysical() {
        super();
        this.path = Path.DESTRUCTION;
        this.element = Elements.PHYSICAL;
        this.atk = new Stat(StatType.ATK, 621);
        this.hp = new Stat(StatType.HP, 1203);
        this.def = new Stat(StatType.DEF, 461);
        this.spd = new Stat(StatType.SPD, 100);
        critRate = new Stat(StatType.CRITRATE, 5);
        critDmg = new Stat(StatType.CRITDMG, 50);
    }


    /**
     * All formulas were provided by PRYDWEN.GG
     * Deals Physical DMG equal to 50-100% of the Trailblazer's ATK to a single enemy.
     **/
    public float basicAttack(int level, boolean checkCrit){

        // Base DMG = (Skill Multiplier + Extra Multiplier) * Scaling Attribute + Extra DMG
        float baseDmg = (float) ((0.4 + (0.1 * level) + 0) * atk.getStat() + 0);
        // DMG% Multiplier = 100% + Elemental DMG% + All Type DMG% + DoT DMG% + Other DMG%
        float dmgMultiplier = 1 + elementalDmg.getStat() + allTypeDmg.getStat() + 0 + 0;
        // DEF Multiplier = 100% - [DEF / (DEF + 200 + 10 * Attacker Level)]
        float defMultiplier = 1;
        // RES Multiplier = 100% - (RES% - RES PEN%)
        float resMultiplier = 1;
        // DMG Taken Multiplier = 100% + Elemental DMG Taken% + All Type DMG Taken%
        float dmgTakenMultiplier = 1;
        // Universal DMG Reduction Multiplier = 100% * (1 - DMG Reduction_1) * (1 - DMG Reduction_2) * ...
        float universalDmgReductionMultiplier = (float) (1 * (1 - 0.9));
        // Weaken Multiplier = 100% - Weaken%
        float weakenMultiplier = 1;


        if (checkCrit){
            return (baseDmg * dmgMultiplier * defMultiplier * resMultiplier * dmgTakenMultiplier * universalDmgReductionMultiplier * weakenMultiplier) * (1 + critDmg.getStat()/100);
        }
        return (baseDmg * dmgMultiplier * defMultiplier * resMultiplier * dmgTakenMultiplier * universalDmgReductionMultiplier * weakenMultiplier);
    }
}
