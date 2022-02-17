package RPG_Characters.characters;

import RPG_Characters.items.Item;
import RPG_Characters.items.Slot;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;


public class CharacterRPG {
    private String username;
    private String type;
    private String input = " ";
    private Integer level;
    private Integer strength;
    private Integer dexterity;
    private Integer intelligence;
    private Integer weaponDPS;
    private Integer CharacterDPS;
    private Integer baseAttributes;
    private Integer TotalAttributes;
    private static HashMap<Slot, Item> characterEquipment;

    public CharacterRPG(String username) {
        this.username = username;
        this.level = 1;
        this.weaponDPS = 0;
        this.CharacterDPS = 0;
        this.baseAttributes = 0;
        this.TotalAttributes = 0;
        characterEquipment = new HashMap<>();

        while ((!(input.equals("warrior") || input.equals("ranger") || input.equals("rogue") || input.equals("mage")))) {
            System.out.print("\nChoose Type:  Warrior ⚔️ | Ranger 🏹 | Rogue 🗡 | Mage 🪄 \n-> ");
            Scanner sc2 = new Scanner(System.in);
            input = sc2.nextLine().toLowerCase(Locale.ROOT);
        }
        switch (input) {
            case "warrior" -> {
                this.type = input;
                this.strength = 5;
                this.dexterity = 2;
                this.intelligence = 1;
            }
            case "ranger" -> {
                this.type = input;
                this.strength = 1;
                this.dexterity = 7;
                this.intelligence = 1;
            }
            case "rogue" -> {
                this.type = input;
                this.strength = 2;
                this.dexterity = 6;
                this.intelligence = 1;
            }
            default -> {
                this.type = input;
                this.strength = 1;
                this.dexterity = 1;
                this.intelligence = 8;
            }
        }
    }

//    Getters & Setters
    public String getUsername() {
        return username;
    }

    public String getTypeCharacter() {
        return type;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }


    public Integer getWeaponDPS() {
        return weaponDPS;
    }

    public void setWeaponDPS(Integer weaponDPS) {
        this.weaponDPS = weaponDPS;
    }

    public Integer getCharacterDPS() {
        return CharacterDPS;
    }

    public void setCharacterDPS(Integer characterDPS) {
        CharacterDPS = characterDPS;
    }

    public Integer getBaseAttributes() {
        return baseAttributes;
    }

    public void setBaseAttributes(Integer baseAttributes) {
        this.baseAttributes = baseAttributes;
    }

    public Integer getTotalAttributes() {
        return TotalAttributes;
    }

    public void setTotalAttributes(Integer totalAttributes) {
        TotalAttributes = totalAttributes;
    }

    public static HashMap<Slot, Item> getCharacterEquipment() {
        return characterEquipment;
    }

    public static void setCharacterEquipment(String slot, Item item) {
        CharacterRPG.characterEquipment.put(Slot.valueOf(slot), item);
    }


//    public static void setCharacterEquipment(HashMap<Slot, Item> characterEquipment) {
//        CharacterRPG.characterEquipment = characterEquipment;
//    }

    @Override
    public String toString() {
        return  "Name = " + username +
                "\nType = " + type +
                "\nLevel = " + level +
                "\nStrength = " + strength +
                "\nDexterity = " + dexterity +
                "\nIntelligence = " + intelligence +
                "\n\nEquipment\n" + characterEquipment;
//                ", weaponDPS=" + weaponDPS +
//                ", CharacterDPS=" + CharacterDPS +
//                ", baseAttributes=" + baseAttributes +
//                ", TotalAttributes=" + TotalAttributes +
//                "\n, characterEquipment=" + characterEquipment
    }
}