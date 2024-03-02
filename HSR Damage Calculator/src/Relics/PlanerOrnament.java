package Relics;

public class PlanerOrnament {
    private PlanerTypes type;
    private RelicAttribute main;
    private RelicAttribute[] subs;

    public PlanerOrnament(PlanerTypes type, RelicAttribute main, RelicAttribute[] subs) {
        this.type = type;
        this.main = main;
        this.subs = subs;
    }

    public PlanerTypes getType() {
        return type;
    }

    public void setType(PlanerTypes type) {
        this.type = type;
    }

    public RelicAttribute getMain() {
        return main;
    }

    public void setMain(RelicAttribute main) {
        this.main = main;
    }

    public RelicAttribute[] getSubs() {
        return subs;
    }

    public void setSubs(RelicAttribute[] subs) {
        this.subs = subs;
    }
    public float getStat(AttributeType type){
        float stat = 0;
        if (main.getType() == type) stat += main.getScale();
        for (RelicAttribute a : subs){
            if (a.getType() == type) stat += a.getScale();
        }

        return stat;
    }

    @Override
    public String toString() {
        return "Set:" + type + "\nMain: " + main +"\n"+subs[0]+"\n"+subs[1]+"\n"+subs[2]+"\n"+subs[3];

    }
}
