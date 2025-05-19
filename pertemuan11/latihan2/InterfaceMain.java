package pertemuan11.latihan2;

// Kelas utama untuk menjalankan program
public class InterfaceMain {
    public static void main(String[] args) {
        // Membuat objek KartuElektronik dengan kode bank dan PIN
        KartuElektronik kartu = new KartuElektronik("IF111", "123");

        // Menampilkan hasil otentikasi berdasarkan input PIN
        System.out.println("Otentikasi: " + kartu.otentikasi("123"));
    }
}
