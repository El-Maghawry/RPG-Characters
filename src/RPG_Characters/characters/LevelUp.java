package RPG_Characters.characters;

public class LevelUp {

    public static void levelUp(Character namePlayer) {
        switch (namePlayer.getTypeCharacter()) {
            case "warrior" -> {
                namePlayer.setLevel(namePlayer.getLevel() + 1);
                namePlayer.setStrength(namePlayer.getStrength() + 3);
                namePlayer.setDexterity(namePlayer.getDexterity() + 2);
                namePlayer.setIntelligence(namePlayer.getIntelligence() + 1);
                System.out.println("\n" + namePlayer);
                System.out.println("\nYou're now level " + namePlayer.getLevel() + "!! Congratulations you have leveled up!!");
            }
            case "ranger" -> {
                namePlayer.setLevel(namePlayer.getLevel() + 1);
                namePlayer.setStrength(namePlayer.getStrength() + 1);
                namePlayer.setDexterity(namePlayer.getDexterity() + 5);
                namePlayer.setIntelligence(namePlayer.getIntelligence() + 1);
                System.out.println("\n" + namePlayer);
                System.out.println("\nYou're now level " + namePlayer.getLevel() + "!! Congratulations you have leveled up!!");
            }
            case "mage" -> {
                namePlayer.setLevel(namePlayer.getLevel() + 1);
                namePlayer.setStrength(namePlayer.getStrength() + 1);
                namePlayer.setDexterity(namePlayer.getDexterity() + 1);
                namePlayer.setIntelligence(namePlayer.getIntelligence() + 5);
                System.out.println("\n" + namePlayer);
                System.out.println("\nYou're now level " + namePlayer.getLevel() + "!! Congratulations you have leveled up!!");
            }
            default -> {
                namePlayer.setLevel(namePlayer.getLevel() + 1);
                namePlayer.setStrength(namePlayer.getStrength() + 1);
                namePlayer.setDexterity(namePlayer.getDexterity() + 4);
                namePlayer.setIntelligence(namePlayer.getIntelligence() + 1);
                System.out.println("\n" + namePlayer);
                System.out.println("\nYou're now level " + namePlayer.getLevel() + "!! Congratulations you have leveled up!!");
            }
        }
    }
}
