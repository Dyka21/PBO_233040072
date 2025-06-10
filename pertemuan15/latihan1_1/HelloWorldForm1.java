package pertemuan15.latihan1_1;

import javax.swing.*;

public class HelloWorldForm1 extends JFrame {
    public HelloWorldForm1() {
        // Membuat label dengan teks "Hello World!"
        JLabel label = new JLabel("Hello World!");

        // Menambahkan label ke form
        add(label);

        // Menentukan judul form
        setTitle("Latihan 1-1");

        // Menentukan ukuran form
        setSize(200, 100);

        // Menentukan agar form terlihat
        setVisible(true);
    }

    // Program utama
    public static void main(String[] args) {
        new HelloWorldForm1();
    }
}

