package RPG_Characters.items;

import static RPG_Characters.CharacterRPG.getCharacterEquipment;

public class Armour extends Item{
    private String armourType;
    private Integer Attribute;

    public static Armour Bronze_helm;
    public static Armour Bronze_platbody;
    public static Armour Bronze_platelegs;

    public Armour(String name, Integer level, Slot slotItem, String armourType, Integer Attribute) {
        super(name, level, slotItem);
        this.armourType = armourType;
        this.Attribute = Attribute;
    }

    public static String showStatsArmour(){
        return getCharacterEquipment().get(Slot.HEAD) +
                "\n"+ getCharacterEquipment().get(Slot.BODY)+
                "\n"+ getCharacterEquipment().get(Slot.LEGS);
    }


    public Integer getAttribute() {
        return Attribute;
    }

    public String getArmourType() {
        return armourType;
    }

    public void setArmourType(String armourType) {
        this.armourType = armourType;
    }

    @Override
    public String toString() {
        return  super.getName() +
                "\nlevel = " + getLevel() +
                "\nslot = " + getSlotItem() +
                "\nType = " + getArmourType() +
                "\nBonus Attribute = " + getAttribute() + "\n";
    }
}
