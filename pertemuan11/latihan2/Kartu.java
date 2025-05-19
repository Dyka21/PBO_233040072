package pertemuan11.latihan2;
// Interface 'Kartu' berisi kontrak yang wajib diimplementasikan oleh kelas konkret
public interface Kartu {
    // Method untuk memverifikasi PIN yang dimasukkan
    public boolean otentikasi(String pin);

    // Method untuk mengenkripsi PIN (belum diimplementasikan di interface)
    public String encode(String pin);
}
