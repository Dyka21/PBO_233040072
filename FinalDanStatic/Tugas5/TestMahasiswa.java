package FinalDanStatic.Tugas5;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("230001", "Alice");
        Mahasiswa m2 = new Mahasiswa("230002", "Bob");

        m1.displayInfo();
        System.out.println("-------------------");
        m2.displayInfo();

        System.out.println("===================");
        System.out.println("Total Mahasiswa: " + Mahasiswa.getTotalMahasiswa());
    }
}
