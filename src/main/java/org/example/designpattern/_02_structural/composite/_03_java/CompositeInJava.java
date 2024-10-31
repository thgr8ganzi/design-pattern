package org.example.designpattern._02_structural.composite._03_java;

import javax.swing.*;

public class CompositeInJava {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 150, 20);
        frame.add(textField);

        JButton button = new JButton("Click");
        button.setBounds(50, 100, 95, 30);
        button.addActionListener(e -> textField.setText("Hello World"));

        frame.add(button);

        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
