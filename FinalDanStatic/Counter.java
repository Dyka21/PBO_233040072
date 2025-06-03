package FinalDanStatic;

public class Counter {
     private static int instanceCount = 0; // static: milik kelas, bukan objek

    public Counter() {
        instanceCount++; // setiap objek baru -> tambah
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}
