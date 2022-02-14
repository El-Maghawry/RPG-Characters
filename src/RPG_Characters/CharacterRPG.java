package RPG_Characters;

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
    private Integer experience;
    private Integer lifePointsMax;
    private Integer lifePointsCurrent;
    private Integer weaponSlot;
    private Integer helmSlot;
    private Integer bodySlot;
    private Integer legsSlot;
    private Integer weaponDPS;
    private Integer CharacterDPS;
    private Integer baseAttributes;
    private Integer TotalAttributes;
    //      something like a bag of stuff for carrying items?


    public CharacterRPG(String username) {
        this.username = username;
        this.level = 1;
        this.experience = 0;
        this.lifePointsMax = 150;
        this.lifePointsCurrent = lifePointsMax;
        this.helmSlot = 0;
        this.bodySlot = 0;
        this.legsSlot = 0;
        this.weaponSlot = 0;
        this.weaponDPS = 0;
        this.CharacterDPS = 0;
        this.baseAttributes = 0;
        this.TotalAttributes = 0;

        while ((!(input.equals("warrior") || input.equals("ranger") || input.equals("rogue") || input.equals("mage")))) {
            System.out.print("\nChoose Type:  Warrior ⚔️ | Ranger 🏹 | Rogue 🗡 | Mage 🪄 \n-> ");
            Scanner sc2 = new Scanner(System.in);
            input = sc2.nextLine().toLowerCase(Locale.ROOT);
        }
        if (input.equals("warrior")) {
            this.type = input;
            System.out.println("Welcome " + this.username + " You have selected the ⚔️ Warrior type!");
            this.strength = 5;
            this.dexterity = 2;
            this.intelligence = 1;

        } else if (input.equals("ranger")) {
            this.type = input;
            System.out.println("Welcome " + this.username + " You have selected the 🏹 Ranger type!");
            this.strength = 1;
            this.dexterity = 7;
            this.intelligence = 1;

        } else if (input.equals("rogue")) {
            this.type = input;
            System.out.println("Welcome " + this.username + " You have selected the 🗡 Rogue type!");
            this.strength = 2;
            this.dexterity = 6;
            this.intelligence = 1;


        } else {
            this.type = input;
            System.out.println("Welcome " + this.username + " You have selected the 🪄 Mage type!");
            this.strength = 1;
            this.dexterity = 1;
            this.intelligence = 8;

        }}

        public void levelUp(CharacterRPG namePlayer) {
            if (namePlayer.getType().equals("warrior")) {
                namePlayer.setLevel(namePlayer.getLevel() + 1);
                namePlayer.setStrength(namePlayer.getStrength() + 3);
                namePlayer.setDexterity(namePlayer.getDexterity() + 2);
                namePlayer.setIntelligence(namePlayer.getIntelligence() + 1);
                System.out.println("\n" + namePlayer);
                System.out.println("\nYou're now level " + namePlayer.getLevel() + "!! Congratulations you have leveled up!!");

            } else if (namePlayer.getType().equals("ranger")) {
                namePlayer.setLevel(namePlayer.getLevel() + 1);
                namePlayer.setStrength(namePlayer.getStrength() + 1);
                namePlayer.setDexterity(namePlayer.getDexterity() + 5);
                namePlayer.setIntelligence(namePlayer.getIntelligence() + 1);
                System.out.println("\n" + namePlayer);
                System.out.println("\nYou're now level " + namePlayer.getLevel() + "!! Congratulations you have leveled up!!");

            } else if (namePlayer.getType().equals("mage") ) {
                namePlayer.setLevel(namePlayer.getLevel() + 1);
                namePlayer.setStrength(namePlayer.getStrength() + 1);
                namePlayer.setDexterity(namePlayer.getDexterity() + 1);
                namePlayer.setIntelligence(namePlayer.getIntelligence() + 5);
                System.out.println("\n" + namePlayer);
                System.out.println("\nYou're now level " + namePlayer.getLevel() + "!! Congratulations you have leveled up!!");

            } else{
                namePlayer.setLevel(namePlayer.getLevel() + 1);
                namePlayer.setStrength(namePlayer.getStrength() + 1);
                namePlayer.setDexterity(namePlayer.getDexterity() + 4);
                namePlayer.setIntelligence(namePlayer.getIntelligence() + 1);
                System.out.println("\n" + namePlayer);
                System.out.println("\nYou're now level " + namePlayer.getLevel() + "!! Congratulations you have leveled up!!");
            }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getLifePointsMax() {
        return lifePointsMax;
    }

    public void setLifePointsMax(Integer lifePointsMax) {
        this.lifePointsMax = lifePointsMax;
    }

    public Integer getLifePointsCurrent() {
        return lifePointsCurrent;
    }

    public void setLifePointsCurrent(Integer lifePointsCurrent) {
        this.lifePointsCurrent = lifePointsCurrent;
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

    public Integer getHelmSlot() {
        return helmSlot;
    }

    public void setHelmSlot(Integer helmSlot) {
        this.helmSlot = helmSlot;
    }

    public Integer getBodySlot() {
        return bodySlot;
    }

    public void setBodySlot(Integer bodySlot) {
        this.bodySlot = bodySlot;
    }

    public Integer getLegsSlot() {
        return legsSlot;
    }

    public void setLegsSlot(Integer legsSlot) {
        this.legsSlot = legsSlot;
    }

    public Integer getWeaponSlot() {
        return weaponSlot;
    }

    public void setWeaponSlot(Integer weaponSlot) {
        this.weaponSlot = weaponSlot;
    }

    @Override
    public String toString() {
        return "CharacterRPG{" +
                "username='" + username + '\'' +
                ", type='" + type + '\'' +
                "\n, level=" + level +
                ", strength=" + strength +
                ", dexterity=" + dexterity +
                ", intelligence=" + intelligence +
                ", experience=" + experience +
                "\n, lifePointsMax=" + lifePointsMax +
                ", lifePointsCurrent=" + lifePointsCurrent +
                "\n, weaponSlot=" + weaponSlot +
                ", helmSlot=" + helmSlot +
                ", bodySlot=" + bodySlot +
                ", legsSlot=" + legsSlot +
                ", weaponDPS=" + weaponDPS +
                ", CharacterDPS=" + CharacterDPS +
                "\n, baseAttributes=" + baseAttributes +
                ", TotalAttributes=" + TotalAttributes +
                '}';
    }
        }



