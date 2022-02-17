package RPG_Characters.items;

public class Armour extends Item{
    private String armourType;


    public Armour(String name, Integer level, Slot slotItem, String armourType, Integer attribute) {
        super(name, level, slotItem, attribute);
        this.armourType = armourType;
    }

    public String getArmourType() {
        return armourType;
    }


    @Override
    public String toString() {
        return  "\n" + super.getName() +" | Type = " + getArmourType()  +
                "\nRequired level = " + getLevel() +
                "\nslot = " + getSlotItem() +
                "\nBonus Attribute = " + getArmourAttribute() + "\n";
    }
}
