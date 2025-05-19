package pertemuan11.latihan1;

public class Main {
  public static void main(String[] args) {
    // Membuat objek Lingkaran dengan jari-jari 10
    Lingkaran lingkaran = new Lingkaran(10);

    // Menampilkan informasi tentang lingkaran
    System.out.println("== Lingkaran ==");
    System.out.println("jari2: " + lingkaran.getJari2());         // Ambil nilai jari-jari
    System.out.println("luas:" + lingkaran.luas());               // Tampilkan hasil perhitungan luas lingkaran

    // Membuat objek Tabung dengan jari-jari 10 dan tinggi 5
    Tabung tabung = new Tabung(10, 5);

    // Menampilkan informasi tentang tabung
    System.out.println("== Tabung ==");
    System.out.println("jari2: " + tabung.getJari2() + ", Tinggi:" + tabung.getTinggi());  // Ambil jari-jari dan tinggi
    System.out.println("luas:" + tabung.luas());                                           // Tampilkan luas permukaan tabung
  }
}


