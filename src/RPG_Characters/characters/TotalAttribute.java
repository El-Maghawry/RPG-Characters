package RPG_Characters.characters;

import RPG_Characters.items.Slot;

import static RPG_Characters.characters.BaseAttribute.getBaseAttribute;
import static RPG_Characters.characters.Character.getCharacterEquipment;

public class TotalAttribute {
    private static Integer totalAttribute;


    public static Integer CalculateTotalAttribute(Character player) {
        Integer armourAttributes = getCharacterEquipment().get(Slot.HEAD).getArmourAttribute() +
                getCharacterEquipment().get(Slot.BODY).getArmourAttribute() +
                getCharacterEquipment().get(Slot.LEGS).getArmourAttribute();

        return totalAttribute = getBaseAttribute() + armourAttributes; // = giving the totalAttributes
        }

    public static Integer getTotalAttribute() {
        return totalAttribute;
    }
}
