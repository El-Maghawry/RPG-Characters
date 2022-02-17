package RPG_Characters.items;

public abstract class Item {
    private String name;
    private Integer level;
    private Slot slotItem;

    public Item(String name, Integer level, Slot slotItem) {
        this.name = name;
        this.level = level;
        this.slotItem = slotItem;
    }

    protected Item() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Slot getSlotItem() {
        return slotItem;
    }

    public void setSlotItem(Slot slotItem) {
        this.slotItem = slotItem;
    }

    @Override
    public String toString() {
        return  "\nName =" + name +
                "\nLevel=" + level +
                "\nSlotItem=" + slotItem;
    }
}

