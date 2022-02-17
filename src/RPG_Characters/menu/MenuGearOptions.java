package RPG_Characters.menu;

import RPG_Characters.items.Slot;

import java.util.Scanner;

import static RPG_Characters.characters.Character.setCharacterEquipment;
import static RPG_Characters.Main.*;
import static RPG_Characters.items.CreationGear.*;
import static RPG_Characters.menu.MainMenu.smallSpaceEndMenu;
import static RPG_Characters.menu.MainMenu.spaceBetweenMenus;
import static RPG_Characters.menu.MenuSelectSlot.selectSlot;
import static RPG_Characters.menu.Utility.goBacktoPrevious;

public class MenuGearOptions {
    private static final String message = "\nGear Selected";

    public static void wearAllGearForMyType() {
        createGear();
        switch (player.getTypeCharacter()) {
            case "warrior" -> {
                setCharacterEquipment(String.valueOf(Slot.HEAD), Bronze_helm);
                setCharacterEquipment(String.valueOf(Slot.BODY), Bronze_platbody);
                setCharacterEquipment(String.valueOf(Slot.LEGS), Bronze_platelegs);
                setCharacterEquipment(String.valueOf(Slot.WEAPON), Bronze_SWORD);
            }
            case "ranger" -> {
                setCharacterEquipment(String.valueOf(Slot.HEAD), Coif);
                setCharacterEquipment(String.valueOf(Slot.BODY), Soft_Leather_Body);
                setCharacterEquipment(String.valueOf(Slot.LEGS), Soft_Leather_Chaps);
                setCharacterEquipment(String.valueOf(Slot.WEAPON), Short_Oak_Bow);
            }
            case "rogue" -> {
                setCharacterEquipment(String.valueOf(Slot.HEAD), Coif);
                setCharacterEquipment(String.valueOf(Slot.BODY), Soft_Leather_Body);
                setCharacterEquipment(String.valueOf(Slot.LEGS), Soft_Leather_Chaps);
                setCharacterEquipment(String.valueOf(Slot.WEAPON), Bronze_SWORD);
            }
            default -> {
                setCharacterEquipment(String.valueOf(Slot.HEAD), Wizards_Hat);
                setCharacterEquipment(String.valueOf(Slot.BODY), Wizards_Robe_Top);
                setCharacterEquipment(String.valueOf(Slot.LEGS), Wizards_Robe_Bottom);
                setCharacterEquipment(String.valueOf(Slot.WEAPON), Staff);
            }

        }
    }

    //  Implement exceptions whenever you can
    public static void headGear() {
        createGear();
        System.out.println(spaceBetweenMenus + "Adventurer: " + player.getUsername() + " | Level: " + player.getLevel() + " | Type: " + player.getTypeCharacter());
        System.out.println("\n○ ○ ○  ○ ○ ○ 🪄⚔️ Head Gear 🏹️🗡 ○ ○ ○  ○ ○ ○\n"); //
        System.out.print("""
                 Select Head Gear
                 1. Bronze Helm     | Level: 1 | Type: Warrior
                 2. Coif            | Level: 1 | Type: Ranger/Rogue
                 3. Wizard Hat      | Level: 1 | Type: Mage
                -------------------------------------
                 0. Back to Previous Menu ...
                """ + smallSpaceEndMenu);

        Scanner o = new Scanner(System.in);
        int option = o.nextInt();

        switch (option) {  //Strings different data types throw an error
            case 1 -> {
                if (player.getTypeCharacter().equals("warrior") && player.getLevel() >= 1) {
                    setCharacterEquipment(String.valueOf(Slot.HEAD), Bronze_helm);
                    System.out.println(message);
                } else {
                    System.out.println("\nYou need to be of Warrior type with the required Level to wear this.");
                }
                goBacktoPrevious();
                headGear();
            }
            case 2 -> {
                if (player.getTypeCharacter().equals("rogue") || player.getTypeCharacter().equals("ranger") && player.getLevel() >= 1) {
                    setCharacterEquipment(String.valueOf(Slot.HEAD), Coif);
                    System.out.println(message);
                } else {
                    System.out.println("\nYou need to be of Ranger or Rogue type with the required Level to wear this.");
                }
                goBacktoPrevious();
                headGear();
            }
            case 3 -> {
                if (player.getTypeCharacter().equals("mage") && player.getLevel() >= 1) {
                    setCharacterEquipment(String.valueOf(Slot.HEAD), Wizards_Hat);
                    System.out.println(message);
                } else {
                    System.out.println("\nYou need to be of Mage type with the required Level to wear this.");
                }
                goBacktoPrevious();
                headGear();
            }
            case 0 -> selectSlot();
            default -> {
                System.out.println(spaceBetweenMenus + "\nOption does not exist!\n");
                goBacktoPrevious();
                headGear();
            }


        }
    }


    public static void bodyGear() {
        createGear();
        System.out.println(spaceBetweenMenus + "Adventurer: " + player.getUsername() + " | Level: " + player.getLevel() + " | Type: " + player.getTypeCharacter());
        System.out.println("\n○ ○ ○  ○ ○ ○ 🪄⚔️ Head Gear 🏹️🗡 ○ ○ ○  ○ ○ ○\n"); //
        System.out.print("""
                 Select Head Gear:
                 1. Bronze Plate Body       | Level: 1 | Type: Warrior
                 2. Soft Leather Body       | Level: 1 | Type: Ranger/Rogue
                 3. Wizards Robe Top        | Level: 1 | Type: Mage
                -------------------------------------
                 0. Back to Previous Menu ...
                """ + smallSpaceEndMenu);

        Scanner o = new Scanner(System.in);
        int option = o.nextInt();
        switch (option) {  //Strings different data types throw an error
            case 1 -> {
                if (player.getTypeCharacter().equals("warrior") && player.getLevel() >= 1) {
                    setCharacterEquipment(String.valueOf(Slot.HEAD), Bronze_platbody);
                    System.out.println(message);
                } else {System.out.println("\nYou need to be of Warrior type with the required Level to wear this.");}
                goBacktoPrevious();
                bodyGear();
            }
            case 2 -> {
                if (player.getTypeCharacter().equals("rogue") || player.getTypeCharacter().equals("ranger") && player.getLevel() >= 1) {
                    setCharacterEquipment(String.valueOf(Slot.HEAD), Soft_Leather_Body);
                    System.out.println(message);
                } else {System.out.println("\nYou need to be of Ranger or Rogue type with the required Level to wear this.");}
                goBacktoPrevious();
                bodyGear();
            }
            case 3 -> {
                if (player.getTypeCharacter().equals("mage") && player.getLevel() >= 1) {
                    setCharacterEquipment(String.valueOf(Slot.HEAD), Wizards_Robe_Top);
                    System.out.println(message);
                } else {System.out.println("\nYou need to be of Mage type with the required Level to wear this.");}
                goBacktoPrevious();
                bodyGear();
            }
            case 0 -> selectSlot();
            default -> {
                System.out.println(spaceBetweenMenus + "\nOption does not exist!\n");
                goBacktoPrevious();
                bodyGear();
            }

        }

    }

    public static void legsGear() {
        createGear();
        System.out.println(spaceBetweenMenus + "Adventurer: " + player.getUsername() + " | Level: " + player.getLevel() + " | Type: " + player.getTypeCharacter());
        System.out.println("\n○ ○ ○  ○ ○ ○ 🪄⚔️ Head Gear 🏹️🗡 ○ ○ ○  ○ ○ ○\n"); //
        System.out.print("""
                 Select Head Gear:
                 1. Bronze Plate Legs       | Level: 1 | Type: Warrior
                 2. Soft Leather Chaps      | Level: 1 | Type: Ranger/Rogue
                 3. Wizards Robe Bottom     | Level: 1 | Type: Mage
                -------------------------------------
                 0. Back to Previous Menu ...
                """ + smallSpaceEndMenu);

        Scanner o = new Scanner(System.in);
        int option = o.nextInt();
        switch (option) {  //Strings different data types throw an error

            case 1 -> {
                if (player.getTypeCharacter().equals("warrior") && player.getLevel() >= 1) {
                    setCharacterEquipment(String.valueOf(Slot.HEAD), Bronze_platelegs);
                    System.out.println(message);
                } else {
                    System.out.println("\nYou need to be of Warrior type with the required Level to wear this.");
                }
                goBacktoPrevious();
                legsGear();
            }
            case 2 -> {
                if (player.getTypeCharacter().equals("rogue") || player.getTypeCharacter().equals("ranger") && player.getLevel() >= 1) {
                    setCharacterEquipment(String.valueOf(Slot.HEAD), Soft_Leather_Chaps);
                    System.out.println(message);
                } else {
                    System.out.println("\nYou need to be of Ranger or Rogue type with the required Level to wear this.");
                }
                goBacktoPrevious();
                legsGear();
            }
            case 3 -> {
                if (player.getTypeCharacter().equals("mage") && player.getLevel() >= 1) {
                    setCharacterEquipment(String.valueOf(Slot.HEAD), Wizards_Robe_Bottom);
                    System.out.println(message);
                } else {
                    System.out.println("\nYou need to be of Mage type with the required Level to wear this.");
                }
                goBacktoPrevious();
                legsGear();
            }
            case 0 -> selectSlot();
            default -> {
                System.out.println(spaceBetweenMenus + "\nOption does not exist!\n");
                goBacktoPrevious();
                legsGear();
            }


        }

    }

    public static void weaponGear() {
        createGear();
        System.out.println(spaceBetweenMenus + "Adventurer: " + player.getUsername() + " | Level: " + player.getLevel() + " | Type: " + player.getTypeCharacter());
        System.out.println("\n○ ○ ○  ○ ○ ○ 🪄⚔️ Weapons 🏹️🗡 ○ ○ ○  ○ ○ ○\n"); //
        System.out.print("""
                 Select Weapons:
                 1. Bronze Sword            | Level: 1 | Type: Warrior/Rogue
                 2. Oak Short Bow           | Level: 1 | Type: Ranger
                 3. Enchanted Oak Staff     | Level: 1 | Type: Mage
                 4. Oak Wand                | Level: 5 | Type: Mage
                -------------------------------------
                 0. Back to Previous Menu ...
                """ + smallSpaceEndMenu);

        Scanner o = new Scanner(System.in);
        int option = o.nextInt();
        switch (option) {  //Strings different data types throw an error
            case 1 -> {
                if (player.getTypeCharacter().equals("warrior") | player.getTypeCharacter().equals("Rogue") && player.getLevel() >= 1) {
                    setCharacterEquipment(String.valueOf(Slot.WEAPON), Bronze_SWORD);
                    System.out.println(message);
                } else {System.out.println("\nYou need to be of Warrior or Rogue type with the required Level to wear this.");}
                goBacktoPrevious();
                weaponGear();
            }
            case 2 -> {
                if (player.getTypeCharacter().equals("ranger") && player.getLevel() >= 1) {
                    setCharacterEquipment(String.valueOf(Slot.WEAPON), Short_Oak_Bow);
                    System.out.println(message);
                } else {System.out.println("\nYou need to be of Ranger or Rogue type with the required Level to wear this.");}
                goBacktoPrevious();
                weaponGear();
            }
            case 3 -> {
                if (player.getTypeCharacter().equals("mage") && player.getLevel() >= 1) {
                    setCharacterEquipment(String.valueOf(Slot.WEAPON), Staff);
                    System.out.println(message);
                } else {System.out.println("\nYou need to be of Mage type with the required Level to wear this.");}
                goBacktoPrevious();
                weaponGear();
            }
            case 4 -> {
                if (player.getTypeCharacter().equals("mage") && player.getLevel() >= 5) {
                    setCharacterEquipment(String.valueOf(Slot.WEAPON), Wand);
                    System.out.println(message);
                } else {System.out.println("\nYou need to be of Mage type with the required Level to wear this.");}
                goBacktoPrevious();
                weaponGear();
            }
            case 0 -> selectSlot();
            default -> {
                System.out.println(spaceBetweenMenus + "\nOption does not exist!\n");
                goBacktoPrevious();
                weaponGear();
            }

        }

    }
}