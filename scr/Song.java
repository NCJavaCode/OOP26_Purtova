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
        System.out.println("Пісня: " + getName());
        System.out.println("Виконавець: " + artist);
        System.out.println("Тривалість: " + duration + " хв");
    }

    @Override
    public void aboutInfo() {
        System.out.println("Це пісня");
    }
}