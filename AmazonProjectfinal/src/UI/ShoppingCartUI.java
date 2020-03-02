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
import Linked_List.*;
public class ShoppingCartUI extends JFrame{
	//
	private JTextField textField;
	public ShoppingCartUI() {
		setBounds(100, 100, 400, 550);
		setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(null);
		
		getContentPane().setLayout(null);
		
		JTextPane txtpnHi = new JTextPane();
		txtpnHi.setBounds(0, 50, 400, 408);
		getContentPane().add(txtpnHi);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(0, 0, 400, 50);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblShoppingCart = new JLabel("Shopping Cart");
		lblShoppingCart.setForeground(new Color(255, 255, 255));
		lblShoppingCart.setBounds(106, 0, 194, 44);
		lblShoppingCart.setFont(new Font("Lao Sangam MN", Font.PLAIN, 30));
		panel.add(lblShoppingCart);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(30, 144, 255));
		panel_1.setBounds(0, 458, 400, 64);
		getContentPane().add(panel_1);
		
		JButton btnNewButton = new JButton("Pay");
		btnNewButton.setBounds(278, 6, 116, 56);
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 40));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PaymentScreen().setVisible(true);
			}
		});
		panel_1.setLayout(null);
		panel_1.add(btnNewButton);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setForeground(new Color(255, 255, 255));
		lblTotal.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 30));
		lblTotal.setBounds(6, 6, 96, 52);
		panel_1.add(lblTotal);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//link to total
			}
		});
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		textField.setEditable(false);
		textField.setText("$200.00");
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(30, 144, 255));
		textField.setBounds(102, 6, 175, 52);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setBounds(22, 92, 189, 191);
		getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("src/uggly.jpg"));
	}
}
