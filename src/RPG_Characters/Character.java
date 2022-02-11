package RPG_Characters;
import java.util.HashMap;


public class Character {
    private HashMap<String, Integer> nameCharacter;



    public Character(HashMap<String, Integer> nameCharacter, String type) {
        this.nameCharacter = nameCharacter;

        if (type.equals("warrior")) {
            nameCharacter.put("level", 1);
            nameCharacter.put("type", 0);
            nameCharacter.put("strength", 5);
            nameCharacter.put("dexterity", 2);
            nameCharacter.put("intelligence", 1);
            nameCharacter.put("dps", 1);
            nameCharacter.put("experience", 0);
            nameCharacter.put("lifePoints", 100);

        } else if (type.equals("ranger")) {
            nameCharacter.put("level", 1);
            nameCharacter.put("type", 0);
            nameCharacter.put("strength", 1);
            nameCharacter.put("dexterity", 7);
            nameCharacter.put("intelligence", 1);
            nameCharacter.put("dps", 1);
            nameCharacter.put("experience", 0);
            nameCharacter.put("lifePoints", 100);

        } else if (type.equals("rogue")) {
            nameCharacter.put("level", 1);
            nameCharacter.put("type", 0);
            nameCharacter.put("strength", 2);
            nameCharacter.put("dexterity", 6);
            nameCharacter.put("intelligence", 1);
            nameCharacter.put("dps", 1);
            nameCharacter.put("experience", 0);
            nameCharacter.put("lifePoints", 100);

        }else if (type.equals("mage")) {
            nameCharacter.put("level", 1);
            nameCharacter.put("type", 0);
            nameCharacter.put("strength", 1);
            nameCharacter.put("dexterity", 1);
            nameCharacter.put("intelligence", 8);
            nameCharacter.put("dps", 1);
            nameCharacter.put("experience", 0);
            nameCharacter.put("lifePoints", 100);
        }else {
            System.out.println("invalid type chose again"); //chosen names in list? and blocked somehow
        }

        }


    }
//    Equipment (Head, Body, legs, Weapons) should alter character's power
//  F-> Total attribute = base + attributes from all equipped armor
//  F-> Character DPS = Weapon DPS * (1 + TotalMainPrimaryAttribute/100) | no weapon dps = 1
//  F-> Weapon DPS = Damage * Attack speed |          from where can I get the attack speed?

// TIPS:
// It is recommended to make custom type (class) called PrimaryAttribute to encapsulate the attributes.
// have a base abstract Item with Weapon and Armor can inherit.
// It is recommended to think about how this Weapon check is implemented.
//      hint, think about some OO Design here, maybe it could be in the inherited classes with
//      a base abstract method to be more extendable. You can use unit testing to see if your refactors break the
//      functionality.
// Make a non-weapon/weapon slots
// It is recommended to store the equipment as a HashMap<Slot, Item> // a dictionary basically
// characters equipment have a base abstract Item with Weapon and Armor can inherit. These simplifies equipment management greatly.
//  All items have: Name, Required level to equip the item, Slot in which the item is equipped (how many slots are there).
//  Hint: you can see how this will behave differently based on the character class. Consider using polymorphism here to aid you.


//QUESTIONS:
// Weapon damage and character damage??????? The NOTE: comment on page 5
//      -> Note: When calculating the DPS of a character, the weapon DPS is used, not the damage.
//You can create Slot as an enumerator.?? page 6
// no life points or anything like that?


