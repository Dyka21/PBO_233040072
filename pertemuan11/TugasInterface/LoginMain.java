package pertemuan11.TugasInterface;

public class LoginMain {
    public static void main(String[] args) {
        Autentikasi admin = new UserAdmin();
        Autentikasi user = new UserBiasa();

        System.out.println("Login Admin: " + admin.login("admin", "admin123"));
        System.out.println("Login User: " + user.login("user", "salah"));
    }
}
