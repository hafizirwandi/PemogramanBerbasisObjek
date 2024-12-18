package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KalkulatorSederhana extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton btn7, btn8, btn9, btnPlus, btnMinus, btnEquals;

    public KalkulatorSederhana() {
        setTitle("Kalkulator Sederhana");
        setSize(250, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 4));

        textField = new JTextField();
        add(textField);

        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btnPlus = new JButton("+");
        btnMinus = new JButton("-");
        btnEquals = new JButton("=");

        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnPlus.addActionListener(this);
        btnMinus.addActionListener(this);
        btnEquals.addActionListener(this);

        add(btn7);
        add(btn8);
        add(btn9);
        add(btnPlus);
        add(btnMinus);
        add(btnEquals);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        textField.setText(textField.getText() + command);
    }

    public static void main(String[] args) {
        new KalkulatorSederhana();
    }
}