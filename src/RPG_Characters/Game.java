package RPG_Characters;

import java.util.Scanner;

public class Game {
    private static boolean run = true;

    public static void goBackToMainMenu(){
        System.out.print("\nPress ENTER to go back to the Main Menu");
        Scanner y = new Scanner(System.in);
        y.nextLine();

    }

    public static void main(String[] args) {
        System.out.println("""
                                                                                                                  
                                                                                                                  \\`-\\`-._
                                                                                                                   \\` )`. `-.__      ,
                 ---.____    ,/k.                                                                 '' , . _       _,-._;'_,-`__,-'    ,/
                  ___,---'  /  ih,__,-----.___ __,-----.       { Welcome to RPG Adventure }      : `. ` , _' :- '--'._ ' `------._,-;'
                         ,-' ,  `:7b----.__---`  .----.-                                          `- ,`- '            `--..__,,---'hh  
                     _.-/   '  /b.`.4p,        ,/k,                             
                  --"  ,    ,-' ^6x, `."^=._  /  ih\\                                                                
                ° . *　　　°　.　°☆ 　. * ● ¸ . ● . ★ ° . *　　　°　.　°☆ °　.　°☆ ○ ° ★　 .　 * 　.★     ° :.☆ ° • ○★　 .　 * 　.★     ° :.☆ ° • ○ * • ○　.　°☆ ○ ° ★　 .　 * 　.★  
                * ° :●. 　 *  ° 　. ● . ★ ° .° ★ ° .° :●. 　 *  °　° :●. 　 *  ° 　. ● . ★ ° .° :●. 　 *  ° 　. ● . ★ ° .° :●. 　 *  ° 　. ● . ★ ° .° :●. 　 *  ° 　.　°☆ ○ ° ★　 .　 * 　.★  
                * 　.　 　°☆ 　. * ● ¸ .★  .  ° 　. ● . ★ ° . *　　　°　.　 :.* • ○     ● . ★ ° . *°　.　 :. 　 * • ○ ° ★ :. 　 * • ○ ° ★° :.☆ ° • ○ * ● ¸ . ● . ★ ° . *　　　°　.　°☆ ○ ° ★　 .　
                """);
        System.out.print("🌋 Name your adventurer: ");
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();

        CharacterRPG player = new CharacterRPG(x);

        while (run) {
            System.out.println("\nMain Menu – Select an Option ○ ○ ○ ");
            System.out.print("1.Go on an Adventure 🌋\n2.Go to Armoury ⚔️\n3.Level-up ⬆️ \n4.Show Stats 📊   \n5.Exit Game ❌\n-> ");
            Scanner o = new Scanner(System.in);
            int option = o.nextInt();
            switch (option) {
                case 1:
                    System.out.println("\nAdventure 🌋 – In development 🪚");
                    goBackToMainMenu();
                    break;
                case 2:
                    System.out.println("\nArmoury ⚔️ – In development 🪚");
                    goBackToMainMenu();
                    break;
                case 3:
                    System.out.println("\nLeveling up ⚡️");
                    player.levelUp(player);
                    goBackToMainMenu();
                    break;
                case 4:
                    System.out.println("\nShowing Stats 📊");
                    System.out.println("\n" + player);
                    goBackToMainMenu();
                    break;
                case 5:
                    System.out.println("\nExiting Game ❌");
                    run = false;
                    break;
                default:
                    System.out.println("\nOption does not exist!");
                    goBackToMainMenu();
            }
        }


//        Let the user chose if he want to level up, show stats or what ever else using switch
    }
}


