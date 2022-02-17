package RPG_Characters.characters;

public class BaseAttribute {
    private static Integer baseAttribute;

    public static Integer CalculateBaseAttribute(Character player) {

        switch (player.getTypeCharacter()) { // this is the base attribute
            case "warrior" -> baseAttribute = player.getStrength();
            case "mage" -> baseAttribute = player.getIntelligence();
            default -> baseAttribute = player.getDexterity();
        }
        return baseAttribute; // = giving the totalAttributes
    }

    public static Integer getBaseAttribute() {
        return baseAttribute;
    }
}