package com.mycompany.myapp.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {

	private JTextField userText;
    private JPasswordField passwordText;

    public Login() {
        setTitle("Login");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        placeComponents(panel);

        add(panel);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Usuario:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aquí iría la lógica de autenticación
                String user = userText.getText();
                String password = new String(passwordText.getPassword());
                if (authenticate(user, password)) {
                    JOptionPane.showMessageDialog(null, "Login exitoso");
                    HomePage homePage = new HomePage();
                    homePage.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                }
            }
        });
    }

    private boolean authenticate(String user, String password) {
        // Aquí iría la lógica de autenticación real (conexión a base de datos)
        return "admin".equals(user) && "password".equals(password);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
			    Login login = new Login();
			    login.setVisible(true);
			}
		});
    }
}