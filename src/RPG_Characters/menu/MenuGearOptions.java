package RPG_Characters.menu;

import RPG_Characters.items.Slot;

import java.util.Scanner;

import static RPG_Characters.CharacterRPG.setCharacterEquipment;
import static RPG_Characters.Main.*;
import static RPG_Characters.items.CreateGear.*;
import static RPG_Characters.menu.MenuSelectSlot.selectSlot;

public class MenuGearOptions {

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
                    setCharacterEquipment(String.valueOf(Slot.WEAPON), Enchanted_Oak_Staff);
                }

            }
    }

//  Implement exceptions whenever you can
    public static void headGear() {
        createGear();
        System.out.println(spaceBetweenMenus +
                "\n○ ○ ○  ○ ○ ○ 🪄⚔️ Head Gear 🏹️🗡 ○ ○ ○  ○ ○ ○\n"); //
        System.out.print("""
                 Select Head Gear:
                 1. Bronze Helm
                 2. Coif
                 3. Wizard Hat
                -------------------------------------
                 4. Back to Previous Menu ...
                """ + smallSpaceEndMenu);
        Scanner o = new Scanner(System.in);
        int option = o.nextInt();
        String message = "Gear Selected";
        switch (option) {  //Strings different data types throw an error

            case 1 -> {if (player.getTypeCharacter().equals("warrior") && player.getLevel().equals(1)) {
                    setCharacterEquipment(String.valueOf(Slot.HEAD), Bronze_helm);
                    System.out.println(message);
                } else { System.out.println("You need to be of Warrior type with the required Level to wear this."); }
            }
            case 2 -> { if (player.getTypeCharacter().equals("rogue") || player.getTypeCharacter().equals("ranger") && player.getLevel().equals(1)) {
                    setCharacterEquipment(String.valueOf(Slot.HEAD), Coif);
                    System.out.println(message);
                } else { System.out.println("You need to be of Ranger or Rogue type with the required Level to wear this.");}
            }
            case 3 -> { if (player.getTypeCharacter().equals("mage") && player.getLevel().equals(1)) {
                setCharacterEquipment(String.valueOf(Slot.HEAD), Wizards_Hat);
                System.out.println(message);
            } else { System.out.println("You need to be of Mage type with the required Level to wear this.");}
            }
            case 4 -> selectSlot();
            default -> {
                System.out.println(spaceBetweenMenus + "\nOption does not exist!\n");
            }


        }
        goBacktoPrevious();
        headGear();
    }
    public static void bodyGear() {
        createGear();
        System.out.println(spaceBetweenMenus +
                "\n○ ○ ○  ○ ○ ○ 🪄⚔️ Head Gear 🏹️🗡 ○ ○ ○  ○ ○ ○\n"); //
        System.out.print("""
                 Select Head Gear:
                 1. Bronze Plate Body
                 2. Soft Leather Body
                 3. Wizards Robe Top
                -------------------------------------
                 4. Back to Previous Menu ...
                """ + smallSpaceEndMenu);
        Scanner o = new Scanner(System.in);
        int option = o.nextInt();
        String message = "Gear Selected";
        switch (option) {  //Strings different data types throw an error

            case 1 -> {if (player.getTypeCharacter().equals("warrior") && player.getLevel().equals(1)) {
                setCharacterEquipment(String.valueOf(Slot.HEAD), Bronze_platbody);
                System.out.println(message);
            } else { System.out.println("You need to be of Warrior type with the required Level to wear this."); }
            }
            case 2 -> { if (player.getTypeCharacter().equals("rogue") || player.getTypeCharacter().equals("ranger") && player.getLevel().equals(1)) {
                setCharacterEquipment(String.valueOf(Slot.HEAD), Soft_Leather_Body);
                System.out.println(message);
            } else { System.out.println("You need to be of Ranger or Rogue type with the required Level to wear this.");}
            }
            case 3 -> { if (player.getTypeCharacter().equals("mage") && player.getLevel().equals(1)) {
                setCharacterEquipment(String.valueOf(Slot.HEAD), Wizards_Robe_Top);
                System.out.println(message);
            } else { System.out.println("You need to be of Mage type with the required Level to wear this.");}
            }
            case 4 -> selectSlot();
            default -> {
                System.out.println(spaceBetweenMenus + "\nOption does not exist!\n");
            }


        }
        goBacktoPrevious();
        bodyGear();
    }

    public static void legsGear() {
        createGear();
        System.out.println(spaceBetweenMenus +
                "\n○ ○ ○  ○ ○ ○ 🪄⚔️ Head Gear 🏹️🗡 ○ ○ ○  ○ ○ ○\n"); //
        System.out.print("""
                 Select Head Gear:
                 1. Bronze Plate Legs
                 2. Soft Leather Chaps
                 3. Wizards Robe Bottom
                -------------------------------------
                 4. Back to Previous Menu ...
                """ + smallSpaceEndMenu);
        Scanner o = new Scanner(System.in);
        int option = o.nextInt();
        String message = "Gear Selected";
        switch (option) {  //Strings different data types throw an error

            case 1 -> {if (player.getTypeCharacter().equals("warrior") && player.getLevel().equals(1)) {
                setCharacterEquipment(String.valueOf(Slot.HEAD), Bronze_platelegs);
                System.out.println(message);
            } else { System.out.println("You need to be of Warrior type with the required Level to wear this."); }
            }
            case 2 -> { if (player.getTypeCharacter().equals("rogue") || player.getTypeCharacter().equals("ranger") && player.getLevel().equals(1)) {
                setCharacterEquipment(String.valueOf(Slot.HEAD), Soft_Leather_Chaps);
                System.out.println(message);
            } else { System.out.println("You need to be of Ranger or Rogue type with the required Level to wear this.");}
            }
            case 3 -> { if (player.getTypeCharacter().equals("mage") && player.getLevel().equals(1)) {
                setCharacterEquipment(String.valueOf(Slot.HEAD), Wizards_Robe_Bottom);
                System.out.println(message);
            } else { System.out.println("You need to be of Mage type with the required Level to wear this.");}
            }
            case 4 -> selectSlot();
            default -> {
                System.out.println(spaceBetweenMenus + "\nOption does not exist!\n");
            }


        }
        goBacktoPrevious();
        legsGear();
    }

//    public static void weaponGear() {
//    }
}