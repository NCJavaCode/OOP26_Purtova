public class Main {
    public static void main(String[] args) {

        MusicItem item1 = new Song("I Mean It", "G-Eazy", 4);
        MusicItem item2 = new Playlist("Улюблені пісні", 188);

        item1.displayInfo();

        System.out.println();

        item2.displayInfo();
    }
}