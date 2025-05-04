package inheritance;

public class Kucing extends Hewan {
    private String ras;

    public void setRas(String ras)
    {
        this.ras = ras;
    }

    public String getRas()
    {
        return ras;
    }

    public void cetak()
    {
        System.out.println("Nama Kucing: " + getNama());
        System.out.println("Ras: " + getRas());
    }
}
