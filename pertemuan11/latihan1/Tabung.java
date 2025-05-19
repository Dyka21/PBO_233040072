package pertemuan11.latihan1;

// Kelas 'Tabung' merupakan turunan dari kelas abstrak 'Bentuk'
public class Tabung extends Bentuk {

  // Menyimpan nilai tinggi tabung
  private int tinggi;

  // Konstruktor tanpa parameter, mengatur jari-jari ke 0
  public Tabung() {
    super(0);
  }

  // Konstruktor dengan dua parameter untuk jari-jari dan tinggi
  public Tabung(int jari2, int tinggi) {
    super(jari2);       // Menginisialisasi jari-jari melalui konstruktor 'Bentuk'
    this.tinggi = tinggi;
  }

  // Implementasi method 'luas' dari kelas induk
  // Menggunakan rumus: 2 × π × r × (r + t)
  @Override
  public double luas() {
    return 2 * PHI * jari2 * (jari2 + tinggi);
  }

  // Mengambil nilai tinggi saat ini
  public int getTinggi() {
    return tinggi;
  }

  // Mengatur nilai tinggi yang baru
  public void setTinggi(int tinggi) {
    this.tinggi = tinggi;
  }
}
