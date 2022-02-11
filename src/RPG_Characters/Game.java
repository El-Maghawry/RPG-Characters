package RPG_Characters;
// This is where I will do the testing for the code written to see if everything works accordingly
//When performing unit tests, there are a few things to keep in mind that have been previously discussed:
//• One assert per test method (strive for this)
//• Remember AAA – arrange act assert.
//• Be as explicit as possible, every parameter or output is stored in a variable.
//      o Donotinvokethemethodintheassert,invokeitbeforeandsavethereturn.
//• Naming is important.
//      o MethodYouAreTesting_ConditionsItsBeingTestedUnder_ExpectedBehaviour().

import java.time.LocalDate;

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

    public static void main(String[] args) {
//        Character Egy = new Character("Egy", "Mage");
    }
}
