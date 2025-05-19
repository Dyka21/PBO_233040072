package pertemuan11.TugasAbstrak;

public class KendaraanMain {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil("D 1234 XY");
        Kendaraan motor = new Motor("B 5678 AB");

        System.out.println("Mobil " + mobil.getPlatNomor() + " bayar: " + mobil.hitungBiayaParkir(3));
        System.out.println("Motor " + motor.getPlatNomor() + " bayar: " + motor.hitungBiayaParkir(3));
    }
}
