package pertemuan15.latihan1_3;

import java.awt.event.*;
import javax.swing.*;

public class HelloWorldForm3 extends JFrame implements ActionListener {
    private JButton button;

    public HelloWorldForm3() {
        JLabel label = new JLabel("Hello World!");
        button = new JButton("Klik Saya!");

        // Menambahkan event listener ke button
        button.addActionListener(this);

        // Menambahkan komponen ke form
        add(label, "North");
        add(button, "South");

        setTitle("Latihan 1-3");
        setSize(200, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Method untuk menangani event ketika button ditekan
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "Button telah diklik!");
    }

    // Program utama
    public static void main(String[] args) {
        new HelloWorldForm3();
    }
}

