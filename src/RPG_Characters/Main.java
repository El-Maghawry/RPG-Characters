package RPG_Characters;

import java.util.Scanner;

import static RPG_Characters.menu.MenuEquipment.equipmentMenu;


public class Main {
    public static CharacterRPG player;
    private static boolean run = true;
    public static final String spaceBetweenMenus = "\n\n\n\n\n\n\n\n\n\n\n";
    public static final String smallSpaceEndMenu = "\n\n\n-> ";



    public static void main(String[] args) {
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

        player = new CharacterRPG(userName);



        while (run) {
            System.out.println(spaceBetweenMenus +
                    "Adventurer: " + userName + " | Level: "+ player.getLevel() + " | Type: "+ player.getTypeCharacter());
            System.out.println(
                    "\n○ ○ ○  ○ ○ ○ Main Menu ○ ○ ○  ○ ○ ○\n");
            System.out.print("""
                    1.Go on an Adventure 🌋 ❌
                    2.Go to Armoury ⚔️
                    3.Level-up ⬆️
                    4.Show Stats 📊
                    -------------------------------------
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


