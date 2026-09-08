public class Playlist {
    private String name;
    private int songCount;

    public Playlist(String name, int songCount) {
        this.name = name;
        this.songCount = songCount;
    }
    public String getName() {
        return name;
    }
}