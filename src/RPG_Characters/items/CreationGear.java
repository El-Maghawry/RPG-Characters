package RPG_Characters.items;

public class CreationGear {
    //variables warrior level 1
    public static Armour Bronze_helm;
    public static Armour Bronze_platbody;
    public static Armour Bronze_platelegs;
    public static Weapon Bronze_SWORD;

    //variables Ranger level 1
    public static Armour Coif;
    public static Armour Soft_Leather_Body;
    public static Armour Soft_Leather_Chaps;
    public static Weapon Short_Oak_Bow;

    //variables Mage level 1
    public static Armour Wizards_Hat;
    public static Armour Wizards_Robe_Top;
    public static Armour Wizards_Robe_Bottom;
    public static Weapon Staff;
    public static Weapon Wand;


    public static void createGear() {
        //warrior level 1
        Bronze_helm = new Armour("Bronze Helm", 1, Slot.HEAD, "Warrior", 1);
        Bronze_platbody = new Armour("Bronze Plate body", 1, Slot.BODY, "Warrior", 5);
        Bronze_platelegs = new Armour("Bronze Plate legs", 1, Slot.LEGS, "Warrior", 2);
        Bronze_SWORD = new Weapon("Bronze Sword",1,Slot.WEAPON,8, "Melee", 2);

        //Ranger level 1
        Coif = new Armour("Leather Coif", 1, Slot.HEAD, "Ranger/Rogue", 1);
        Soft_Leather_Body = new Armour("Soft Leather body", 1, Slot.BODY, "Ranger/Rogue", 3);
        Soft_Leather_Chaps = new Armour("Soft Leather legs", 1, Slot.LEGS, "Ranger/Rogue", 3);
        Short_Oak_Bow = new Weapon("Short Oak Bow",1,Slot.WEAPON,8,"Range", 2);

        //Mage level 1
        Wizards_Hat = new Armour("Wizard Hat", 1, Slot.HEAD, "Mage", 1);
        Wizards_Robe_Top = new Armour("Wizard Robe Top", 1, Slot.BODY, "Mage", 3);
        Wizards_Robe_Bottom = new Armour("Wizard Robe Bottom", 1, Slot.LEGS, "Mage", 3);
        Staff = new Weapon("Staff",1, Slot.WEAPON,8, "Magic", 2);
        Wand = new Weapon("Wand",5, Slot.WEAPON, 13, "Magic", 5);

    }
}
