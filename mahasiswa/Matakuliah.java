package mahasiswa;

public class Matakuliah {
    String kode, nama, nilaiHuruf;
    int sks;
    Dosen dosenPengampu;

    public Matakuliah(String kode, String nama, int sks, String nilaiHuruf, Dosen dosenPengampu) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.nilaiHuruf = nilaiHuruf;
        this.dosenPengampu = dosenPengampu;
    }

    public double getNilaiAngka() {
        switch (nilaiHuruf) {
            case "A": return 4.0;
            case "AB": return 3.5;
            case "B": return 3.0;
            case "BC": return 2.5;
            case "C": return 2.0;
            case "D": return 1.0;
            default: return 0.0;
        }
    }

    public void tampilkanInfo() {
        System.out.println(kode + " - " + nama + " - " + nilaiHuruf + " - " + sks);
        dosenPengampu.tampilkanInfo();
    }
}
