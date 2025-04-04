package mahasiswa;

public class Dosen {
    String nama;

    public Dosen(String nama) {
        this.nama = nama;
    }

    public void tampilkanInfo() {
        System.out.println("Dosen Pengampu: " + nama);
    }

}
