package pertemuan11.TugasAbstrak;

public class Mobil extends Kendaraan {
    public Mobil(String platNomor) {
        super(platNomor);
    }

    @Override
    public double hitungBiayaParkir(int jam) {
        return jam * 5000; // Tarif parkir mobil
    }
}