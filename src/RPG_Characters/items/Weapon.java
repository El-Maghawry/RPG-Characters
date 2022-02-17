package RPG_Characters.items;

import static RPG_Characters.characters.CharacterRPG.getCharacterEquipment;

public class Weapon extends Item {
    private final String WeaponType;
    private final Integer damage;
    private final Integer attSpeed;
    private final Integer WeaponDPS;


    public static Weapon AXE;
    public static Weapon DAGGER;
    public static Weapon HAMMER;
    public static Weapon BOW;
    public static Weapon STAFF;
    public static Weapon WAND;


    public Weapon(String name, String WeaponType, Integer level, Slot slotItem, Integer damage, Integer attSpeed) {
        super(name, level, slotItem);
        this.WeaponType = WeaponType;
        this.damage = damage; // I ASSUME that damage is the same as attribute
        this.attSpeed = attSpeed;
        this.WeaponDPS = attSpeed * damage; // the slower the weapon the bigger the damage?


    }

    public static String showStatsWeapon(){
        return getCharacterEquipment().get(Slot.WEAPON).toString();
    }

    public Integer getDamage() {
        return damage;
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
        return  "\n" + super.getName() + " | Type= " + getWeaponType()  +
                "\nRequired Level = " +getLevel() +
                "\nSpeed = " + getAttSpeed() +
                "\nDamage = " + getDamage() +
                "\nDPS weapon = " + getWeaponDPS() + "\n"
                ;
    }
}
