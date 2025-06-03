package FinalDanStatic;

public class DatabaseConnection {
    public static String connectionString;

    static {
        // static block: dijalankan sekali saja ketika class pertama kali diload
        connectionString = "jdbc:mysql://localhost:3306/mydb";
        System.out.println("Static block executed: connectionString initialized.");
    }
}
