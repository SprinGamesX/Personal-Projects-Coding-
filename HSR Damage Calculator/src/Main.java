import Relics.AttributeType;
import Relics.Relic;
import Relics.RelicAttribute;
import Relics.RelicTypes;

public class Main {
    public static void main(String[] args) {
        RelicAttribute[] subs = {new RelicAttribute(AttributeType.CRIT_RATE, 5), new RelicAttribute(AttributeType.CRIT_DAMAGE, 15), new RelicAttribute(AttributeType.ATK_FLAT, 42), new RelicAttribute(AttributeType.ATK, 14)};
        Relic relic = new Relic(RelicTypes.GENIUS_OF_BRILLIANT_STARS,new RelicAttribute(AttributeType.ATK_FLAT, 132), subs);
        System.out.println(relic);
    }
}