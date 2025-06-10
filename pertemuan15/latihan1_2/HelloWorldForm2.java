package pertemuan15.latihan1_2;

import javax.swing.*;

public class HelloWorldForm2 extends JFrame {
    private JLabel label;

    public HelloWorldForm2() {
        label = new JLabel();
        label.setText("Hello World!");

        add(label);
        setTitle("Program pertama");

        setSize(600, 300);
    }
}