public class Song extends MusicItem {
    private String artist;
    private int duration;

    public Song(String title, String artist, int duration) {
        super(title);
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public void displayInfo() {
        System.out.println(artist);
    }
}