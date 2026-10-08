public class Song extends MusicItem implements Nameable, Informable {
    private String artist;
    private int duration;
    private String className = "Song";

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

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    public void showInfo() {
        displayInfo();
    }
}