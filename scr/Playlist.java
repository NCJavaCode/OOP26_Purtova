public class Playlist extends MusicItem {
    private int songCount;

    public Playlist(String name, int songCount) {
        super(name);
        this.songCount = songCount;
    }

    @Override
    public void displayInfo() {
        System.out.println("Плейлист: " + getName());
        System.out.println("Кількість пісень: " + songCount);
    }

    @Override
    public void aboutInfo() {
        System.out.println("Це плейлист");
    }
}