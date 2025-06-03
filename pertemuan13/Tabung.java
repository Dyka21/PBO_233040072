public class Tabung extends Bentuk {
    private double radius;
    private double tinggi;

    public Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        // Rumus luas permukaan tabung: 2πr(r + t)
        return 2 * Math.PI * radius * (radius + tinggi);
    }
}
