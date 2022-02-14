package RPG_Characters;

import java.util.Scanner;

public class Game {
    private static boolean run = true;

    public static void main(String[] args) {
        System.out.println("""
                \n° . *　　　°　.　°☆ 　. * ● ¸ . ● . ★ ° . *　　　°　.　°☆ ○ ° ★　 .　 * 　.★     ° :.☆ ° • ○ * ● ¸ . ● . ★ ° . *　　　°　.　°☆ ○ ° ★　 .　 * 　.★     ° :.☆ ° • ○★　 .　 * 　.★     ° :.☆ ° • ○ * ● ¸ . ● . ★ ° . *　　　°　.　°☆ ○ ° ★　 .　 * 　.★     ° :.☆ ° • ○
                ★ 　° :. ★　 * • ○ ° ★　 . * ● ¸ .{ Welcome to RPG Adventure }　° :●. 　 *  ° 　. ● . ★ ° .° :●. 　 *  ° 　. ● . ★ ° .° :●. 　 *  ° 　. ● . ★ ° .° :●. 　 *  °　° :●. 　 *  ° 　. ● . ★ ° .° :●. 　 *  ° 　. ● . ★ ° .° :●. 　 *  ° 　. ● . ★ ° .° :●. 　 *  ° 　 　\s
                * 　.　 　°☆ 　. * ● ¸ .★  .  ° 　. ● . ★ ° . *　　　°　.　 :. 　 * • ○ ° ★　* 　.　 　°☆ 　. * ● ¸ . ★　.° 　. ● . ★ ° . *°　.　 :. 　 * • ○ ° ★ :. 　 * • ○ ° ★° :.☆ ° • ○ * ● ¸ . ● . ★ ° . *　　　°　.　°☆ ○ ° ★　 .　 * 　.★     ° :.☆ ° • ○★　 .　 * 　.★     ° :.☆
                """);
        System.out.print("Name your adventurer: ");
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
                    System.out.println("In development 🪚");
                    break;
                case 2:
                    System.out.println("In development 🪚");
                    break;
                case 3:
                    System.out.println("Leveling up ⚡️");
                    player.levelUp(player);
                    break;
                case 4:
                    System.out.println("Showing Stats – In development 🪚");
                    System.out.println("\n" + player);
                    break;
                case 5:
                    System.out.println("Exiting Game");
                    run = false;
                    break;
                default:
                    System.out.println("Option does not exist!");
            }
        }


//        Let the user chose if he want to level up, show stats or what ever else using switch
    }
}


