package RPG_Characters.menu;

import java.util.Scanner;

import static RPG_Characters.Main.player;
import static RPG_Characters.characters.LevelUp.levelUp;
import static RPG_Characters.menu.MenuEquipment.equipmentMenu;
import static RPG_Characters.menu.Utility.goBacktoPrevious;

public class MainMenu {
    private static boolean run = true;
    public static final String spaceBetweenMenus = "\n\n\n\n\n\n\n\n\n\n\n";
    public static final String smallSpaceEndMenu = "\n\n\n-> ";

    public static void mainMenu() {


        while (run) {

            System.out.println(spaceBetweenMenus +
                    "Adventurer: " + player.getUsername() + " | Level: " + player.getLevel() + " | Type: " + player.getTypeCharacter());
            System.out.println(
                    "\n○ ○ ○  ○ ○ ○ Main Menu ○ ○ ○  ○ ○ ○\n");
            System.out.print("""
                    1. ❌ Go on an Adventure 🌋
                    2. Go to Armoury ⚔️
                    3. Level-up ⬆️
                    4. Show Stats 📊
                    -------------------------------------
                    0.Exit Game ..."""
                    + smallSpaceEndMenu);

            Scanner o = new Scanner(System.in);
            int option = o.nextInt();

            switch (option) { //Strings different data types throw an error
                case 1 -> {
                    System.out.println(spaceBetweenMenus + "\nAdventure 🌋 – (In development 🪚)" + spaceBetweenMenus);
                    goBacktoPrevious();
                }
                case 2 -> {
                    System.out.println(spaceBetweenMenus);
                    equipmentMenu();
                }
                case 3 -> {
                    System.out.println(spaceBetweenMenus + "\nLeveling up ⚡️");
                    levelUp(player);
                    goBacktoPrevious();
                }
                case 4 -> {
                    System.out.println(spaceBetweenMenus + "\nShowing Stats 📊");
                    System.out.println("\n" + player);
                    goBacktoPrevious();
                }
                case 0 -> {
                    System.out.println(spaceBetweenMenus + "\n🛑 Exiting Game... Game has Ended... ");
                    run = false;
                }
                default -> {
                    System.out.println(spaceBetweenMenus + "\nOption does not exist!" + spaceBetweenMenus);
                    goBacktoPrevious();
                }
            }
        }
    }
}
