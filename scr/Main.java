public class Main {
    public static void main(String[] args) {
        Song song = new Song("I Mean It", "G-Eazy", 4);
        User user = new User("Kira", "purtovakira@gmail.com");

        System.out.println("Назва класу: " + song.getClassName());
        System.out.println("Назва класу: " + user.getClassName());

        System.out.println();

        song.showInfo();

        System.out.println();

        user.showInfo();

        System.out.println();

        MusicItem item = new Playlist("Улюблені пісні", 188);
        item.displayInfo();
    }
}