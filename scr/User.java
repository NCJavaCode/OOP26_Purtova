public class User implements Nameable, Informable {
    private String name;
    private String email;
    private String className = "User";

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    public void showInfo() {
        System.out.println("Ім'я користувача: " + name);
        System.out.println("Email: " + email);
    }
}