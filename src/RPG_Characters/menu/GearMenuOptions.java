package RPG_Characters.menu;

import RPG_Characters.items.Armour;
import RPG_Characters.items.Slot;
import RPG_Characters.items.Weapon;

import static RPG_Characters.CharacterRPG.setCharacterEquipment;
import static RPG_Characters.Main.player;

public class GearMenuOptions {
    //variables warrior level 1
    private static Armour Bronze_helm;
    private static Armour Bronze_platbody;
    private static Armour Bronze_platelegs;
    private static Weapon Bronze_SWORD;

    //variables Ranger level 1
    private static Armour Coif;
    private static Armour Soft_Leather_Body;
    private static Armour Soft_Leather_Legs;
    private static Weapon Short_Oak_Bow;

    //variables Mage level 1
    private static Armour Wizard_Hat;
    private static Armour Wizard_Robe_Top;
    private static Armour Wizard_Robe_Bottom;
    private static Weapon Enchanted_Oak_Staff;


    public static void createGear() {
        //warrior level 1
        Bronze_helm = new Armour("Bronze Helm", 1, Slot.HEAD, "warrior", 1);
        Bronze_platbody = new Armour("Bronze Plate body", 1, Slot.BODY, "warrior", 5);
        Bronze_platelegs = new Armour("Bronze Plate legs", 1, Slot.LEGS, "warrior", 2);
        Bronze_SWORD = new Weapon("Bronze Sword","melee",1, Slot.WEAPON, 10, 2);

        //Ranger level 1
        Coif = new Armour("Leather Coif", 1, Slot.HEAD, "ranger", 1);
        Soft_Leather_Body = new Armour("Soft Leather body", 1, Slot.BODY, "ranger", 3);
        Soft_Leather_Legs = new Armour("Soft Leather legs", 1, Slot.LEGS, "ranger", 3);
        Short_Oak_Bow = new Weapon("Short Oak Bow","range",1, Slot.WEAPON, 8, 2);

        //Mage level 1
        Wizard_Hat = new Armour("Wizard Hat", 1, Slot.HEAD, "mage", 1);
        Wizard_Robe_Top = new Armour("Wizard Robe Top", 1, Slot.BODY, "mage", 3);
        Wizard_Robe_Bottom = new Armour("Soft Leather legs", 1, Slot.LEGS, "mage", 3);
        Enchanted_Oak_Staff = new Weapon("Short Oak Bow","mage",1, Slot.WEAPON, 8, 2);

    }

    public static void wearAllGearForMyType() {
            createGear();

            switch (player.getTypeCharacter()) {
                case "warrior" -> {
                    setCharacterEquipment(String.valueOf(Slot.HEAD), Bronze_helm);
                    setCharacterEquipment(String.valueOf(Slot.BODY), Bronze_platbody);
                    setCharacterEquipment(String.valueOf(Slot.LEGS), Bronze_platelegs);
                    setCharacterEquipment(String.valueOf(Slot.WEAPON), Bronze_SWORD);
                } case "ranger" -> {
                    setCharacterEquipment(String.valueOf(Slot.HEAD), Coif);
                    setCharacterEquipment(String.valueOf(Slot.BODY), Soft_Leather_Body);
                    setCharacterEquipment(String.valueOf(Slot.LEGS), Soft_Leather_Legs);
                    setCharacterEquipment(String.valueOf(Slot.WEAPON), Short_Oak_Bow);
                }
                case "rogue" -> {
                    setCharacterEquipment(String.valueOf(Slot.HEAD), Coif);
                    setCharacterEquipment(String.valueOf(Slot.BODY), Soft_Leather_Body);
                    setCharacterEquipment(String.valueOf(Slot.LEGS), Soft_Leather_Legs);
                    setCharacterEquipment(String.valueOf(Slot.WEAPON), Bronze_SWORD);
                }
                default -> {
                    setCharacterEquipment(String.valueOf(Slot.HEAD), Wizard_Hat);
                    setCharacterEquipment(String.valueOf(Slot.BODY), Wizard_Robe_Top);
                    setCharacterEquipment(String.valueOf(Slot.LEGS), Wizard_Robe_Bottom);
                    setCharacterEquipment(String.valueOf(Slot.WEAPON), Enchanted_Oak_Staff);
                }

            }
            System.out.println(player);
    }
//    public static void headGear(;) {
//
//    }
//    public static void bodyGear() {
//    }
//    public static void legsGear() {
//    }
//    public static void weaponGear() {
//    }
}