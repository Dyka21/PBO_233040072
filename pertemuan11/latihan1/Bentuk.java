package pertemuan11.latihan1;

// Kelas abstrak 'Bentuk' sebagai dasar untuk berbagai jenis bentuk lainnya
public abstract class Bentuk {

  // Konstanta PHI bernilai 3.14, umum digunakan dalam perhitungan lingkaran
  protected double PHI = 3.14;

  // Atribut jari-jari, dapat diakses oleh turunan kelas karena menggunakan akses protected
  protected int jari2;

  // Konstruktor untuk memberikan nilai awal pada atribut jari2
  public Bentuk(int jari2) {
    // Pemanggilan konstruktor superclass (Object) secara eksplisit
    super();
    this.jari2 = jari2;
  }

  // Method abstrak yang harus dibuat implementasinya di subclass
  public abstract double luas();

  // Mengembalikan nilai jari-jari yang sedang digunakan
  public int getJari2() {
    return jari2;
  }

  // Mengatur ulang nilai jari-jari
  public void setJari2(int jari2) {
    this.jari2 = jari2;
  }
}