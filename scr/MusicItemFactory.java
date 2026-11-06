
public class MusicItemFactory {

    public static MusicItem createMusicItem(String type, String name,
                                            String artist, int duration,
                                            int songCount) {

        if (type.equalsIgnoreCase("song")) {
            return new Song(name, artist, duration);
        } else if (type.equalsIgnoreCase("playlist")) {
            return new Playlist(name, songCount);
        }

        throw new IllegalArgumentException("Невідомий тип музичного об'єкта");
    }
}

