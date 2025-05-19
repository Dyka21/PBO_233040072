package pertemuan11.TugasInterface;

public class UserAdmin implements Autentikasi {
    private String username = "admin";
    private String password = "admin123";

    @Override
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}
