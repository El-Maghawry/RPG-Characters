package RPG_Characters;

import RPG_Characters.items.Armour;
import RPG_Characters.items.Slot;
import RPG_Characters.items.Weapon;

import java.util.Scanner;

import static RPG_Characters.CharacterRPG.setCharacterEquipment;
import static RPG_Characters.EquipmentMenu.equipmentMenu;
import static RPG_Characters.items.Armour.*;
import static RPG_Characters.items.Weapon.*;


public class Main {
    public static CharacterRPG Player;
    private static boolean run = true;
    static final String spaceBetweenMenus = "\n\n\n\n\n\n\n\n\n\n\n";
    static final String smallSpaceEndMenu = "\n\n\n-> ";



    public static void main(String[] args) {
        //armour warrior
        // create armour somewhere else?
        Bronze_helm = new Armour("Bronze Helm", 1, Slot.HEAD, "warrior", 1);
        Bronze_platbody = new Armour("Bronze Platebody", 1, Slot.BODY, "warrior", 5);
        Bronze_platelegs = new Armour("Bronze Platelegs", 1, Slot.LEGS, "warrior", 2);
        Bronze_SWORD = new Weapon("Bronze Sword","melee",1, Slot.WEAPON, 10, 2);


        // Startup screen
        System.out.println("""
                                                                                                                                                         
                                                                                                                  \\`-\\`-._
                                                                                                                   \\` )`. `-.__      ,
                 ---.____    ,/k.                                                                 '' , . _       _,-._;'_,-`__,-'    ,/
                  ___,---'  /  ih,__,-----.___ __,-----.      |  Welcome to RPG Adventure  |     : `. ` , _' :- '--'._ ' `------._,-;'
                         ,-' ,  `:7b----.__---`  .----.-                                          `- ,`- '            `--..__,,---'hh  
                     _.-/   '  /b.`.4p,        ,/k,                             
                  --"  ,    ,-' ^6x, `."^=._  /  ih\\                                                                
                ° . *　　　°　.　°☆ 　. * ● ¸ . ● . ★ ° . *　　　°　.　°☆ °　.　°☆ ○ ° ★　 .　 * 　.★     ° :.☆ ° • ○★　 .　 * 　.★     ° :.☆ ° • ○ * • ○　.　°☆ ○ ° ★　 .　 * 　.★  
                * ° :●. 　 *  ° 　. ● . ★ ° .° ★ ° .° :●. 　 *  °　° :●. 　 *  ° 　. ● . ★ ° .° :●. 　 *  ° 　. ● . ★ ° .° :●. 　 *  ° 　. ● . ★ ° .° :●. 　 *  ° 　.　°☆ ○ ° ★　 .　 * 　.★  
                * 　.　 　°☆ 　. * ● ¸ .★  .  ° 　. ● . ★ ° . *　　　°　.　 :.* • ○     ● . ★ ° . *°　.　 :. 　 * • ○ ° ★ :. 　 * • ○ ° ★° :.☆ ° • ○ * ● ¸ . ● . ★ ° . *　　　°　.　°☆ ○ ° ★　 .　
                """);
        System.out.print("🌋 Name your adventurer: ");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();

        CharacterRPG player = new CharacterRPG(userName);
        Player = player;

        setCharacterEquipment(String.valueOf(Slot.HEAD), Bronze_helm);
        setCharacterEquipment(String.valueOf(Slot.BODY), Bronze_platbody);
        setCharacterEquipment(String.valueOf(Slot.LEGS), Bronze_platelegs);
        setCharacterEquipment(String.valueOf(Slot.WEAPON), Bronze_SWORD);

        while (run) {
            System.out.println(spaceBetweenMenus +
                    "Adventurer: " + userName + " | Level: "+ player.getLevel() + " | Type: "+ player.getTypeCharacter());
            System.out.println(
                    "\n○ ○ ○  ○ ○ ○ Main Menu ○ ○ ○  ○ ○ ○\n");
            System.out.print("""
                    "1.Go on an Adventure 🌋 ❌
                    2.Go to Armoury ⚔️
                    3.Level-up ⬆️
                    4.Show Stats 📊
                    5.Exit Game ..."""
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
                    player.levelUp(player);
                    goBacktoPrevious();
                }
                case 4 -> {
                    System.out.println(spaceBetweenMenus + "\nShowing Stats 📊");
                    System.out.println("\n" + player);
                    goBacktoPrevious();
                }
                case 5 -> {
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

    public static void goBacktoPrevious(){
        System.out.print("\nPress ENTER to go back");
        Scanner y = new Scanner(System.in);
        y.nextLine();  }




}


