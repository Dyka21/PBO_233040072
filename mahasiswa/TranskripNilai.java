package mahasiswa;
import java.util.Date;
import java.text.SimpleDateFormat;




public class TranskripNilai {
    Mahasiswa mahasiswa;
    KartuHasilStudi khs;
    String tanggalCetak;

    public TranskripNilai(Mahasiswa mahasiswa, KartuHasilStudi khs) {
        this.mahasiswa = mahasiswa;
        this.khs = khs;
        this.tanggalCetak = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy").format(new Date());
    }

    public void tampilkanTranskrip() {
        mahasiswa.tampilkanInfo();
        System.out.println("Semester    : " + khs.semester);
        System.out.println("Tanggal Cetak: " + tanggalCetak);
        System.out.println("IPK         : " + String.format("%.2f", khs.hitungIPK()));
        System.out.println("\nDaftar Mata Kuliah:");
        khs.tampilkanMatakuliah();
    }
}
