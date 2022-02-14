package RPG_Characters;
import java.util.Scanner;

public class Game {
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
        System.out.println("\n" + player);
        player.levelUp(player);
        player.levelUp(player);
        player.levelUp(player);


//        Let the user chose if he want to level up, show stats or what ever else using switch
    }
}


