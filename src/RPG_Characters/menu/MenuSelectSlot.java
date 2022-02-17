package RPG_Characters.menu;

import java.util.Scanner;

import static RPG_Characters.Main.*;
import static RPG_Characters.menu.MainMenu.smallSpaceEndMenu;
import static RPG_Characters.menu.MainMenu.spaceBetweenMenus;
import static RPG_Characters.menu.MenuEquipment.equipmentMenu;
import static RPG_Characters.menu.MenuGearOptions.*;
import static RPG_Characters.menu.MenuGearOptions.wearAllGearForMyType;
import static RPG_Characters.menu.Utility.goBacktoPrevious;

public class MenuSelectSlot {

    public static void selectSlot() {
        // this is made only so the user is allowed to choose the wrong type and we can trow an error
        System.out.println(spaceBetweenMenus +
                "Adventurer: " + player.getUsername() + " | Level: "+ player.getLevel() + " | Type: "+ player.getTypeCharacter());
        System.out.println("\n○ ○ ○  ○ ○ ○ 🪄⚔️ Armoury 🏹️🗡 ○ ○ ○  ○ ○ ○\n"); //
        System.out.print("""
                 1. ⭐️ Wear All Gear for my Type!
                 2. 🥷🏿 View All Head Gear ->
                 3. 🦾 View All Top Gear ->
                 4. 🦿 View All Bottom Gear ->
                 5. 🗡 View All Weapons ->
                -------------------------------------
                 0. Back to Previous Menu ...
                """ + smallSpaceEndMenu);

        Scanner o = new Scanner(System.in);
        int option = o.nextInt();
        switch (option) {  //Strings different data types throw an error
            case 1 -> {
                System.out.println("\nWearing All Gear For Your Type!\n");
                wearAllGearForMyType();
                goBacktoPrevious();
                selectSlot();
            }
            case 2 -> {
                System.out.println("\nView Head Gear\n");
                headGear();
                goBacktoPrevious();

            }
            case 3 -> {
                System.out.println("\nView Top Gear\n");
                bodyGear();
                goBacktoPrevious();
            }

            case 4 -> {
                System.out.println("\nView Bottom Gear\n");
                legsGear();
                goBacktoPrevious();

            }

            case 5 -> {
                System.out.println("\n\n");
                weaponGear();
                goBacktoPrevious();

            }
            case 0 -> {
                equipmentMenu();
            }
            default -> {
                System.out.println(spaceBetweenMenus + "\nOption does not exist!\n");
                goBacktoPrevious();
                selectSlot();
            }
        }
    }

}
