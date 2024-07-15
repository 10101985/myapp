package com.mycompany.myapp.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class HomePage extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HomePage() {
        setTitle("Home Page");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Bienvenido a la página de inicio My Construcción");
        panel.add(label);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
			    HomePage homePage = new HomePage();
			    homePage.setVisible(true);
			}
		});
    }
}
