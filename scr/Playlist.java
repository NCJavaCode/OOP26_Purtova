public class Playlist extends MusicItem {
    private String name;
    private int songCount;

    public Playlist(String name, int songCount) {
        super(name);
        this.name = name;
        this.songCount = songCount;
    }

    public String getName() {
        return name;
    }

    @Override
    public void displayInfo() {
        System.out.println(name);
    }
}