package pertemuan11.TugasInterface;

public class UserBiasa implements Autentikasi {
    private String username = "user";
    private String password = "user123";

    @Override
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}
