package mahasiswa;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("233040072", "Andyka Khaerulana", "Teknik Informatika");
        KartuHasilStudi khs = new KartuHasilStudi(4);

        Dosen d1 = new Dosen("Budi Santoso");
        Dosen d2 = new Dosen("Sri Wahyuni");
        Dosen d3 = new Dosen("Andi Saputra");

        Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemrograman 1", 3, "A", d1);
        Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemrograman 2", 3, "BC", d2);
        Matakuliah mk3 = new Matakuliah("003", "Pemrograman Berorientasi Objek", 3, "B", d3);

        khs.tambahMatakuliah(mk1);
        khs.tambahMatakuliah(mk2);
        khs.tambahMatakuliah(mk3);

        TranskripNilai transkrip = new TranskripNilai(mhs, khs);
        transkrip.tampilkanTranskrip();
    }
    }

