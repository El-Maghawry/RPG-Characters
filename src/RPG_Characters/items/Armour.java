package RPG_Characters.items;

import static RPG_Characters.characters.CharacterRPG.getCharacterEquipment;

public class Armour extends Item{
    private String armourType;
    private Integer Attribute;




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
        return  "\n" + super.getName() +" | Type= " + getArmourType()  +
                "\nRequired level = " + getLevel() +
                "\nslot = " + getSlotItem() +
                "\nBonus Attribute = " + getAttribute() + "\n";
    }
}
