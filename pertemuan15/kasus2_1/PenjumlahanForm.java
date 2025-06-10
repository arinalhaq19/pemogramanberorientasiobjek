package Pertemuan15.Kasus2_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PenjumlahanForm extends JFrame implements ActionListener {
    private JTextField input1, input2;
    private JButton tombolJumlah;

    public PenjumlahanForm() {
        // Membuat textfield
        input1 = new JTextField();
        input2 = new JTextField();

        // Membuat tombol
        tombolJumlah = new JButton("Jumlah");
        tombolJumlah.addActionListener(this);

        // Set layout dan tambahkan komponen
        setLayout(new GridLayout(3, 1));
        add(input1);
        add(input2);
        add(tombolJumlah);

        // Konfigurasi JFrame
        setTitle("Penjumlahan");
        setSize(200, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int angka1 = Integer.parseInt(input1.getText());
            int angka2 = Integer.parseInt(input2.getText());
            int hasil = angka1 + angka2;

            // Tampilkan hasil menggunakan JOptionPane
            JOptionPane.showMessageDialog(this, "Jumlah: " + hasil);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new PenjumlahanForm();
    }
}