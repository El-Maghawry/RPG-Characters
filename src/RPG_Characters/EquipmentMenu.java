package RPG_Characters;

import java.util.Scanner;

import static RPG_Characters.items.Armour.showStatsArmour;
import static RPG_Characters.items.AvailableGear.*;
import static RPG_Characters.items.AvailableGear.showAvailableMageGear;

public class EquipmentMenu extends Main {

    public static void equipmentMenu() {
        System.out.println(spaceBetweenMenus +
                "\n○ ○ ○  ○ ○ ○ ⚔️ Armoury ⚔️ ○ ○ ○  ○ ○ ○\n");
        System.out.print("""
                 1. Show Gear Stats 📊
                 2. Show Available Gear  🪄 ⚔️ 🏹 🗡
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
                switch (Player.getTypeCharacter()) {
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
                // TODO: 16/02/2022 Gateway to Wear/Change Equipment  
                goBacktoPrevious();
                equipmentMenu();
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
