package FinalDanStatic;

public class Mahasiswa {
    private final String nim; // final: tidak bisa diubah setelah inisialisasi
    private String nama;
    private static int totalMahasiswa = 0; // static: shared oleh semua objek
    public static final int MAX_SKS = 24; // final: nilai tetap

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        totalMahasiswa++;
    }

    public void displayInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Max SKS: " + MAX_SKS);
    }

    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }
}
