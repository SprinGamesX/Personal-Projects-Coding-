package Relics;

public class RelicAttribute {

    private AttributeType type;
    private float scale;

    public RelicAttribute(AttributeType type, float scale) {
        this.type = type;
        this.scale = scale;
    }

    public AttributeType getType() {
        return type;
    }

    public void setType(AttributeType type) {
        this.type = type;
    }

    public float getScale() {
        return scale;
    }

    public void setScale(float scale) {
        this.scale = scale;
    }

    @Override
    public String toString() {
        return type + ":" + scale;
    }
}
