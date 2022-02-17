package RPG_Characters.items;

public class CreateGear {
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
    public static Weapon Enchanted_Oak_Staff;


    public static void createGear() {
        //warrior level 1
        Bronze_helm = new Armour("Bronze Helm", 1, Slot.HEAD, "warrior", 1);
        Bronze_platbody = new Armour("Bronze Plate body", 1, Slot.BODY, "warrior", 5);
        Bronze_platelegs = new Armour("Bronze Plate legs", 1, Slot.LEGS, "warrior", 2);
        Bronze_SWORD = new Weapon("Bronze Sword","melee",1, Slot.WEAPON, 10, 2);

        //Ranger level 1
        Coif = new Armour("Leather Coif", 1, Slot.HEAD, "ranger", 1);
        Soft_Leather_Body = new Armour("Soft Leather body", 1, Slot.BODY, "ranger", 3);
        Soft_Leather_Chaps = new Armour("Soft Leather legs", 1, Slot.LEGS, "ranger", 3);
        Short_Oak_Bow = new Weapon("Short Oak Bow","range",1, Slot.WEAPON, 8, 2);

        //Mage level 1
        Wizards_Hat = new Armour("Wizard Hat", 1, Slot.HEAD, "mage", 1);
        Wizards_Robe_Top = new Armour("Wizard Robe Top", 1, Slot.BODY, "mage", 3);
        Wizards_Robe_Bottom = new Armour("Soft Leather legs", 1, Slot.LEGS, "mage", 3);
        Enchanted_Oak_Staff = new Weapon("Short Oak Bow","mage",1, Slot.WEAPON, 8, 2);

    }
}
