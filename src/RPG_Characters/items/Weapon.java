package RPG_Characters.items;

import static RPG_Characters.characters.Character.getCharacterEquipment;

public class Weapon extends Item {
    private final String WeaponType;
    private final Integer attSpeed;
    private final Integer WeaponDPS;


    public static Weapon AXE;
    public static Weapon DAGGER;
    public static Weapon HAMMER;
    public static Weapon BOW;
    public static Weapon STAFF;
    public static Weapon WAND;



    public Weapon(String name, Integer level, Slot slotItem, Integer attribute, String weaponType, Integer attSpeed) {
        super(name, level, slotItem, attribute);
        WeaponType = weaponType;
        this.attSpeed = attSpeed;
        this.WeaponDPS = attSpeed * attribute; // the slower the weapon the bigger the damage?
    }  // I ASSUME that damage is the same as attribute


    public static String showStatsWeapon(){
        return getCharacterEquipment().get(Slot.WEAPON).toString();
    }


    public Integer getAttSpeed() {
        return attSpeed;
    }

    public Integer getWeaponDPS() {
        return WeaponDPS;
    }

    public String getWeaponType() {
        return WeaponType;
    }

    @Override
    public String toString() {
        return  "\n" + super.getName() + " | Type = " + getWeaponType()  +
                "\nRequired Level = " +getLevel() +
                "\nSpeed = " + getAttSpeed() +
                "\nDamage = " + getWeaponDPS() +
                "\nDPS weapon = " + getWeaponDPS() + "\n"
                ;
    }
}
