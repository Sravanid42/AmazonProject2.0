package UI;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import Linked_List.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.DefaultListModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import Search.*;
import Linked_List.*;


import java.util.Scanner;

import java.io.*;
//Creates Main UI
public class mainUI extends JFrame{
	
	public String User;
	public static JTextField Usernames = new JTextField();
	
	public int main;
	private JTextField txtCasInspired;
	private JTextField textField;
	private JTextField ItemCode;
	private JTextField Quantity;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainUI frame = new mainUI();
					frame.createLayout();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void createLayout() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 647);
		setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(0, 0, 638, 100);
		getContentPane().add(panel);
		panel.setLayout(null);
		
	
		
		
		txtCasInspired = new JTextField();
		txtCasInspired.setEditable(false);
		txtCasInspired.setFont(new Font("Courier", Font.BOLD | Font.ITALIC, 32));
		txtCasInspired.setForeground(new Color(255, 255, 0));
		txtCasInspired.setText("C.A.S. Inspired");
		txtCasInspired.setBackground(new Color(30, 144, 255));
		txtCasInspired.setBounds(0, 0, 321, 63);
		panel.add(txtCasInspired);
		txtCasInspired.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(10, 61, 469, 33);
		panel.add(textField);
		textField.setColumns(10);
		
		//
		
		Usernames.setText("Guest");
		Usernames.setBounds(510, 11, 120, 20);
		Usernames.setEditable(false);
		panel.add(Usernames);
		Usernames.setColumns(10);
		
		
		
		
		JTextPane txtpnYop = new JTextPane();
		txtpnYop.setText("yop");
		txtpnYop.setBounds(115, 232, -46, 65);
		getContentPane().add(txtpnYop);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 100, 638, 487);
		getContentPane().add(scrollPane);
		
		
				
		
		JTextPane MainTextBox = new JTextPane();
		MainTextBox.setEditable(false);
		scrollPane.setViewportView(MainTextBox);
		MainTextBox.setFont(new Font("Georgia", Font.PLAIN, 20));
		MainTextBox.setText("Welcome to C.A.S. Inspired! ");
		//
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String search = textField.getText();
				
				MainTextBox.setText("Yeet");
				ArrayList<String> methods = methodsearch.getMethods(textField.getText());
				MainTextBox.setText("");
				for (String method: methods) {
					MainTextBox.addElement(method);
				}
				
			}
		});
		btnSearch.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		btnSearch.setBackground(Color.YELLOW);
		btnSearch.setBounds(465, 61, 111, 33);
		panel.add(btnSearch);
		
		//
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(635, 0, 153, 587);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnCheckout = new JButton("Checkout");
		btnCheckout.setBounds(10, 523, 133, 23);
		panel_1.add(btnCheckout);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 215, 133, 297);
		panel_1.add(scrollPane_1);
		
		JTextPane CartList = new JTextPane();
		CartList.setText("Your Cart is Empty");
		CartList.setEditable(false);
		scrollPane_1.setViewportView(CartList);
		
		ItemCode = new JTextField();
		ItemCode.setBounds(10, 95, 96, 20);
		panel_1.add(ItemCode);
		ItemCode.setColumns(10);
		
		Quantity = new JTextField();
		Quantity.setColumns(10);
		Quantity.setBounds(10, 148, 96, 20);
		panel_1.add(Quantity);
		
		JButton btnLogin = new JButton("Login ");
		btnLogin.setBounds(54, 0, 89, 20);
		panel_1.add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("Item #");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 70, 96, 20);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Quantity");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 116, 77, 30);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cart");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(10, 190, 63, 23);
		panel_1.add(lblNewLabel_2);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new loginUI().setVisible(true);
		
				
			}
		});
		//
		//Button Checkout gets text from the text boxes and sets text to nothing. 
		//Needs a method to add text to the cart 
		//CartList.setText(class/Method output);
		btnCheckout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ShoppingCartUI().setVisible(true);
				Quantity.getText();
				ItemCode.getText();
				CartList.setText("");
			}
		});
		
		
		JButton addToCart = new JButton("Add to Cart");
		addToCart.setBounds(10, 170, 135, 15);
		panel_1.add(addToCart);
	    addToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				
			}
		});
		
		
		JMenuBar menuBar_1 = new JMenuBar();
		setJMenuBar(menuBar_1);
		
		//Apparel button
				JMenuItem mntmApparel = new JMenuItem("Apparel");
				mntmApparel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						MainTextBox.setText(Apparel.main(null));
					}
				});
				menuBar_1.add(mntmApparel);
				
		//BTS album button
		JMenuItem mntmBts = new JMenuItem("BTS");
		mntmBts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainTextBox.setText(BTS_Albums.main(null));
			}
		});
		menuBar_1.add(mntmBts);
		
		//Electronic button
				JMenuItem mntmElectronics = new JMenuItem("Electronics");
				mntmElectronics.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						MainTextBox.setText(Electronics.main(null));
					}
				});
				menuBar_1.add(mntmElectronics);
				
		//Music button
		JMenuItem mntmMusic = new JMenuItem("Music");
		mntmMusic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainTextBox.setText(Music.main(null));
			}
		});
		menuBar_1.add(mntmMusic);
		
		
		
		
		
		//Snacks button
		JMenuItem mntmSnacks = new JMenuItem("Snacks");
		mntmSnacks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainTextBox.setText(Snacks.main(null));
			}
		});
		menuBar_1.add(mntmSnacks);
		
		//Other button
		JMenuItem mntmOther = new JMenuItem("Other");
		mntmOther.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainTextBox.setText(Other.main(null));
			}
		});
		menuBar_1.add(mntmOther);
		
	
	
	}
	
	//
	public mainUI() {
		//In Order to create work in Window Builder you need to have the constructor 
		//If you want to run get rid of Constructor
		//make sure all the code is in the Create Layout Method 
		
		createLayout();
		
	}

	

}
