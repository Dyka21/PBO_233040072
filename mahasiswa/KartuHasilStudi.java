
package mahasiswa;


import java.util.ArrayList;
import java.util.Date;

public class KartuHasilStudi {
    ArrayList<Matakuliah> daftarMatkul = new ArrayList<>();
    int semester;

    public KartuHasilStudi(int semester) {
        this.semester = semester;
    }

    public void tambahMatakuliah(Matakuliah mk) {
        daftarMatkul.add(mk);
    }

    public double hitungIPK() {
        double totalBobot = 0;
        int totalSKS = 0;

        for (Matakuliah mk : daftarMatkul) {
            totalBobot += mk.getNilaiAngka() * mk.sks;
            totalSKS += mk.sks;
        }

        return (totalSKS == 0) ? 0 : totalBobot / totalSKS;
    }

    public void tampilkanMatakuliah() {
        for (Matakuliah mk : daftarMatkul) {
            mk.tampilkanInfo();
            System.out.println();
        }
    }
}
