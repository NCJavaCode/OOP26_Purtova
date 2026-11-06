
public class President {

    private static President president;

    private String name;

    private President(String name) {
        this.name = name;
    }

    public static President getInstance(String name) {
        if (president == null) {
            president = new President(name);
        }
        return president;
    }

    public String getName() {
        return name;
    }
}
