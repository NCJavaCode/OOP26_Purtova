public class Main {
    public static void main(String[] args) {

        Song song = new Song("I Mean It", "G-Eazy", 4);
        Playlist playlist = new Playlist("Улюблені пісні", 188);

        song.displayInfo();
        song.aboutInfo();

        System.out.println();

        playlist.displayInfo();
        playlist.aboutInfo();
        playlist.displayInfo("Назва");
    }
}