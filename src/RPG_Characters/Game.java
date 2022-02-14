package RPG_Characters;
// This is where I will do the testing for the code written to see if everything works accordingly
//When performing unit tests, there are a few things to keep in mind that have been previously discussed:
//• One assert per test method (strive for this)
//• Remember AAA – arrange act assert.
//• Be as explicit as possible, every parameter or output is stored in a variable.
//      o Donotinvokethemethodintheassert,invokeitbeforeandsavethereturn.
//• Naming is important.
//      o MethodYouAreTesting_ConditionsItsBeingTestedUnder_ExpectedBehaviour().

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

//tests should cover the following behavior:
//        1) A character is level 1 when created.
//        2) When a character gains a level, it should be level 2.
//        3) Each character class is created with the proper default attributes.
//        o Use level 1 stats for each character as expected.
//        o This results in four test methods.
//        4) Each character class has their attributes increased when leveling up.
//        o Create each class once, level them up once.
//        o Use the base attributes, plus one instance of the level up as the expected.
//        o E.g. Warrior -> levelup() -> ( Strength = 8, Dexterity = 4, Intelligence = 2) expected. o This results in four test methods.
public class Game {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        System.out.println("""
                ° . *　　　°　.　°☆ 　. * ● ¸ . ● . ★ ° . *　　　°　.　°☆ ○ ° ★　 .　 * 　.★     ° :.☆ ° • ○
                ★ 　° :. ★　 * • ○ ° ★　 . * ● ¸ .{ Welcome to RPG Adventure }　° :●. 　 *  ° 　. ● . ★ ° .\s
                * 　.　 　°☆ 　. * ● ¸ . 　　　★ 　　　　　. 　  ° 　. ● . ★ ° . *　　　°　.　 :. 　 * • ○ ° ★　
                """);
        System.out.print("Name your adventurer: ");
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();

//        System.out.print("\nChoose Type:\n| Warrior ⚔️ | Ranger 🏹 | Rogue\uD83D\uDDE1 | Mage 🪄 |\n-> ");
//        Scanner sc2 = new Scanner(System.in);
//        String y = sc2.nextLine().toLowerCase(Locale.ROOT);

        CharacterRPG player = new CharacterRPG(x);
        System.out.println("\n" + player);

        clearScreen();
    }
}


