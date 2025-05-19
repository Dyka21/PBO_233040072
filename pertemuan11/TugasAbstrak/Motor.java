package pertemuan11.TugasAbstrak;

public class Motor extends Kendaraan {
    public Motor(String platNomor) {
        super(platNomor);
    }

    @Override
    public double hitungBiayaParkir(int jam) {
        return jam * 2000; // Tarif parkir motor
    }
}