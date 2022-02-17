package RPG_Characters.menu;

import java.util.Scanner;

import static RPG_Characters.Main.*;
import static RPG_Characters.items.Armour.showStatsArmour;
import static RPG_Characters.items.AvailableGear.*;
import static RPG_Characters.menu.SelectSlot.selectSlot;

public class EquipmentMenu{

    public static void equipmentMenu() {
        System.out.println(spaceBetweenMenus +
                "\n○ ○ ○  ○ ○ ○ 🪄⚔️ Armoury 🏹️🗡 ○ ○ ○  ○ ○ ○\n"); // TODO: 16/02/2022  Equip items menu needs to be done
        System.out.print("""
                 1. Show Gear Stats 📊 (Stop wearing bronze all the time ❌)
                 2. Show Available Gear My Type  📜
                 3. Equip items ⚡️ 
                 4. Back to Main Menu ...
                """ + smallSpaceEndMenu);

        Scanner o = new Scanner(System.in);
        int option = o.nextInt();


        switch (option) {  //Strings different data types throw an error
            case 1 -> {
                System.out.println("\nShow Gear Stats \uD83D\uDCCA\n");
                System.out.println(showStatsArmour());
                goBacktoPrevious();
                equipmentMenu();
            }
            case 2 -> {
                System.out.println("\nShow Available Gear \n");
                switch (player.getTypeCharacter()) {
                    case "warrior" -> System.out.println(showAvailableWarriorGear());
                    case "ranger" -> System.out.println(showAvailableRangerGear());
                    case "rogue" -> System.out.println(showAvailableRogueGear());
                    default -> System.out.println(showAvailableMageGear());
                }
                goBacktoPrevious();
                equipmentMenu();

            }
            case 3 -> {
                System.out.println("\nEquip items ⚡️\n");
                selectSlot();

            }

            case 4 -> { // Back to main menu
            }
            default -> {
                System.out.println(spaceBetweenMenus + "\nOption does not exist!\n");
                goBacktoPrevious();
                equipmentMenu();
            }
        }
    }


}
