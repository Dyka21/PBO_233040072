package pertemuan11.latihan1;

// Kelas 'Lingkaran' merupakan turunan dari kelas abstrak 'Bentuk'
public class Lingkaran extends Bentuk {

  // Konstruktor menerima nilai jari-jari dan meneruskan ke konstruktor induk
  public Lingkaran(int jari2) {
    super(jari2); // Memanfaatkan konstruktor dari kelas 'Bentuk'
  }

  // Implementasi konkret dari method abstrak 'luas'
  // Rumus yang digunakan: PHI × jari-jari × jari-jari
  @Override
  public double luas() {
    return PHI * jari2 * jari2;
  }
}
