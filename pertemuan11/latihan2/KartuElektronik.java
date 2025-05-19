package pertemuan11.latihan2;

// Kelas KartuElektronik menerapkan interface Kartu
public class KartuElektronik implements Kartu {
    // Menyimpan kode bank dan PIN sebagai data privat
    private String kodeBank;
    private String pin;

    // Konstruktor menerima dua parameter dan menyimpan nilainya
    public KartuElektronik(String kodeBank, String pin) {
        super(); // Memanggil konstruktor dari Object (tidak wajib, tapi eksplisit)
        this.kodeBank = kodeBank;
        this.pin = pin;
    }

    // Implementasi method otentikasi dari interface Kartu
    // Bandingkan input PIN dengan PIN yang tersimpan
    @Override
    public boolean otentikasi(String pinInput) {
        return pin.equals(pinInput);
    }

    // Implementasi method encode dari interface Kartu
    // Di sini hanya placeholder (belum ada enkripsi nyata)
    @Override
    public String encode(String pin) {
        // Placeholder untuk enkripsi PIN, bisa dikembangkan
        return null;
    }
}