package UI;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;
//
public class PaymentScreen extends JFrame {
	public PaymentScreen() {
		setBounds(100, 100, 450, 150);
		setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(null);
		
		getContentPane().setBackground(new Color(30, 144, 255));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Thank You For Shopping\n");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		lblNewLabel.setBounds(0, 0, 450, 63);
		getContentPane().add(lblNewLabel);
		
		JLabel lblWithUs = new JLabel("With Us!");
		lblWithUs.setForeground(new Color(255, 255, 255));
		lblWithUs.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		lblWithUs.setBounds(147, 59, 172, 63);
		getContentPane().add(lblWithUs);
	}

}
