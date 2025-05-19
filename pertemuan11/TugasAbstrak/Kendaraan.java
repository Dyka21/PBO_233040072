package pertemuan11.TugasAbstrak;

public abstract class Kendaraan {
    protected String platNomor;

    public Kendaraan(String platNomor) {
        this.platNomor = platNomor;
    }

    // Method abstrak
    public abstract double hitungBiayaParkir(int jam);

    public String getPlatNomor() {
        return platNomor;
    }
}
