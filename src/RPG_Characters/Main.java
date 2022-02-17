package RPG_Characters;

import RPG_Characters.characters.CharacterRPG;

import java.util.Scanner;

import static RPG_Characters.menu.MainMenu.mainMenu;


public class Main {
    public static CharacterRPG player;


    public static void main(String[] args) {
        // Welcome Screen
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
        mainMenu();
    }

}





