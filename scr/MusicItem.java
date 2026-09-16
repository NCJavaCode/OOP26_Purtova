public abstract class MusicItem {
    private String name;

    public MusicItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void displayInfo();
}