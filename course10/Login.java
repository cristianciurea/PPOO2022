package ro.ase.seminar10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton button1;
    private JPanel panel1;

    public Login()
    {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textField1.getText().equals("admin")
                &&passwordField1.getText().equals("admin")) {
                    JOptionPane.showMessageDialog(null,
                            "Autentificare cu succes " + textField1.getText());
                    Calculator calculator = new Calculator();
                    calculator.setBounds(1, 1, 650, 500);
                    calculator.setVisible(true);
                }
                else
                    JOptionPane.showMessageDialog(null,
                            "Autentificare esuata!");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Application");
        frame.setContentPane(new Login().panel1);
        frame.setBounds(1,1,650, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
