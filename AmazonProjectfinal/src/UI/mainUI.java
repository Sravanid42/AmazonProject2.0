package UI;
import individualItems.*;
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
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
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
		setBounds(100, 100, 800, 645);
		setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 638, 100);
		panel.setBackground(new Color(30, 144, 255));
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
		txtpnYop.setBounds(115, 232, -46, 65);
		txtpnYop.setText("yop");
		getContentPane().add(txtpnYop);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(280, 100, 358, 487);
		getContentPane().add(scrollPane);
		
		
				
		
		JTextPane MainTextBox = new JTextPane();
		scrollPane.setViewportView(MainTextBox);
		MainTextBox.setBackground(Color.WHITE);
		MainTextBox.setEditable(false);
		MainTextBox.setFont(new Font("Georgia", Font.PLAIN, 20));
		MainTextBox.setText("Welcome to C.A.S. Inspired! ");
		
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String search = textField.getText();
				
				MainTextBox.setText("Yeet");
				
			}
		});
		btnSearch.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		btnSearch.setBackground(Color.YELLOW);
		btnSearch.setBounds(465, 61, 111, 33);
		panel.add(btnSearch);
		
		//
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(635, 0, 153, 587);
		panel_1.setBackground(Color.YELLOW);
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
		btnCheckout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ShoppingCartUI().setVisible(true);
			}
		});
		
		
		JButton addToCart = new JButton("Add to Cart");
		addToCart.setBounds(10, 170, 135, 15);
		panel_1.add(addToCart);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 100, 282, 487);
		getContentPane().add(scrollPane_2);
		
		JPanel ImagePanel = new JPanel();
		ImagePanel.setBackground(Color.WHITE);
		scrollPane_2.setViewportView(ImagePanel);
		ImagePanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel image1 = new JLabel("");
	    image1.setBackground(Color.WHITE);
		ImagePanel.add(image1);
		
		JTextPane tp1 = new JTextPane();
		tp1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ImagePanel.add(tp1);
		
		
		JLabel image2 = new JLabel("");
		image2.setBackground(Color.WHITE);
		ImagePanel.add(image2);
		
		JTextPane tp2 = new JTextPane();
		tp2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ImagePanel.add(tp2);
		//Thuggs.setIcon(new ImageIcon("src/uggly.jpg"));
	
		JLabel image3 = new JLabel("");
		image3.setBackground(Color.WHITE);
		ImagePanel.add(image3);
		
		JTextPane tp3 = new JTextPane();
		tp3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ImagePanel.add(tp3);
		
		JLabel image4 = new JLabel("");
		image4.setBackground(Color.WHITE);
		ImagePanel.add(image4);
		
		JTextPane tp4 = new JTextPane();
		tp4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ImagePanel.add(tp4);
		
		JLabel image5 = new JLabel("");
		image5.setBackground(Color.WHITE);
		ImagePanel.add(image5);
		
		JTextPane tp5 = new JTextPane();
		tp5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ImagePanel.add(tp5);
		
		JLabel image6 = new JLabel("");
		image6.setBackground(Color.WHITE);
		ImagePanel.add(image6);
		
		JTextPane tp6 = new JTextPane();
		tp6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ImagePanel.add(tp6);
		
		JLabel image7 = new JLabel("");
		image7.setBackground(Color.WHITE);
		ImagePanel.add(image7);
		
		JTextPane tp7 = new JTextPane();
		tp7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ImagePanel.add(tp7);
		
		JLabel image8 = new JLabel("");
		image8.setBackground(Color.WHITE);
		ImagePanel.add(image8);
		
		JTextPane tp8 = new JTextPane();
		tp8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ImagePanel.add(tp8);
		
		JLabel image9 = new JLabel("");
		image9.setBackground(Color.WHITE);
		ImagePanel.add(image9);
		
		JTextPane tp9 = new JTextPane();
		tp9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ImagePanel.add(tp9);
		
		JLabel image10 = new JLabel("");
		image10.setBackground(Color.WHITE);
		ImagePanel.add(image10);
		
		JTextPane tp10 = new JTextPane();
		tp10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ImagePanel.add(tp10);
	

		
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
				
						image1.setIcon(new ImageIcon("src/tshirt.jpg"));
						tp1.setText(Tshirt.main(null));
						image2.setIcon(new ImageIcon("src/Parachute.jpg"));
						tp2.setText(ParachutePants.main(null));
						image3.setIcon(new ImageIcon("src/Nike.jpg"));
						tp3.setText(Nike.main(null));
						image4.setIcon(new ImageIcon("src/TallCrocs.jpg"));
						tp4.setText(Crocs.main(null));
						image5.setIcon(new ImageIcon("src/Hoodie.jpg"));
						tp5.setText(Hoodie.main(null));
						image6.setIcon(new ImageIcon("src/uggly.jpg"));
						tp6.setText(Uggs.main(null));
						image7.setIcon(new ImageIcon("src/Jeans.jpg"));
						tp7.setText(Jeans.main(null));
						image8.setIcon(new ImageIcon(""));
						tp8.setText("");
						image9.setIcon(new ImageIcon(""));
						tp9.setText("");
						image10.setIcon(new ImageIcon(""));
						tp10.setText("");
						
						}
				});
				menuBar_1.add(mntmApparel);
				
		//BTS album button
		JMenuItem mntmBts = new JMenuItem("BTS");
		mntmBts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainTextBox.setText(BTS_Albums.main(null));
				
				image1.setIcon(new ImageIcon("src/MapOfSoul7.jpg"));
				tp1.setText(MapSoul7.main(null));
				image2.setIcon(new ImageIcon("src/Wings.jpg"));
				tp2.setText(Wings.main(null));
				image3.setIcon(new ImageIcon("src/Answer.jpg"));
				tp3.setText(Answer.main(null));
				image4.setIcon(new ImageIcon("src/Tear.jpg"));
				tp4.setText(Tear.main(null));
				image5.setIcon(new ImageIcon("src/DarkWild.jpg"));
				tp5.setText(DarkWild.main(null));
				image6.setIcon(new ImageIcon("src/NeverWalk.jpg"));
				tp6.setText(NeverWalk.main(null));

			}
		});
		menuBar_1.add(mntmBts);
		
		//Electronic button
				JMenuItem mntmElectronics = new JMenuItem("Electronics");
				mntmElectronics.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						MainTextBox.setText(Electronics.main(null));
						
						image1.setIcon(new ImageIcon("src/dell.jpg"));
						tp1.setText(dell.main(null));
						image2.setIcon(new ImageIcon("src/macbook.jpg"));
						tp2.setText(macbook.main(null));
						image3.setIcon(new ImageIcon("src/iPhone.jpg"));
						tp3.setText(iPhonePro.main(null));
						image4.setIcon(new ImageIcon("src/ipadpro.jpg"));
						tp4.setText(iPad.main(null));
						image5.setIcon(new ImageIcon("src/TV.jpg"));
						tp5.setText(TV.main(null));
						image6.setIcon(new ImageIcon("src/AppleWatch.jpg"));
						tp6.setText(watch.main(null));
					
					}
				});
				menuBar_1.add(mntmElectronics);
				
		//Music button
		JMenuItem mntmMusic = new JMenuItem("Music");
		mntmMusic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainTextBox.setText(Music.main(null));
				
				image1.setIcon(new ImageIcon("src/Circles.jpg"));
				tp1.setText(Circles.main(null));
				image2.setIcon(new ImageIcon("src/Chills.jpg"));
				tp2.setText(Chills.main(null));
				image3.setIcon(new ImageIcon("src/PartyOver.jpg"));
				tp3.setText(PartyOver.main(null));
				image4.setIcon(new ImageIcon("src/WhatMakesYouBeautiful.jpg"));
				tp4.setText(Beautiful.main(null));
				image5.setIcon(new ImageIcon("src/LoveStory.jpg"));
				tp5.setText(Lovestory.main(null));
				image6.setIcon(new ImageIcon("src/ThankYouNext.jpg"));
				tp6.setText(Thankyounext.main(null));
				image7.setIcon(new ImageIcon("src/Memories.jpg"));
				tp7.setText(Memories.main(null));

			}
		});
		menuBar_1.add(mntmMusic);
		
		
		//Snacks button
		JMenuItem mntmSnacks = new JMenuItem("Snacks");
		mntmSnacks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainTextBox.setText(Snacks.main(null));
				
				image1.setIcon(new ImageIcon("src/chips.jpg"));
				tp1.setText(chips.main(null));
				image2.setIcon(new ImageIcon("src/cookies.jpg"));
				tp2.setText(cookies.main(null));
				image3.setIcon(new ImageIcon("src/hotcheetos.jpg"));
				tp3.setText(hotcheetos.main(null));
				image4.setIcon(new ImageIcon("src/popcorn.jpg"));
				tp4.setText(popcorn.main(null));
				image5.setIcon(new ImageIcon("src/gummybears.jpg"));
				tp5.setText(gummybears.main(null));
				image6.setIcon(new ImageIcon("src/goldfish.jpg"));
				tp6.setText(goldfish.main(null));
				image7.setIcon(new ImageIcon("src/CronchBars.jpg"));
				tp7.setText(bar.main(null));
			}
		});
		menuBar_1.add(mntmSnacks);
		
		//Other button
		JMenuItem mntmOther = new JMenuItem("Other");
		mntmOther.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainTextBox.setText(Other.main(null));
				
				image1.setIcon(new ImageIcon("src/Popsocket.jpg"));
				tp1.setText(popsocket.main(null));
				image2.setIcon(new ImageIcon("src/iPhoneCase.jpg"));
				tp2.setText(iPhoneCase.main(null));
				image3.setIcon(new ImageIcon("src/tennisballs.jpg"));
				tp3.setText(tennisballs.main(null));
				image4.setIcon(new ImageIcon("src/pencils.jpg"));
				tp4.setText(pencil.main(null));
				image5.setIcon(new ImageIcon("src/VERYexpensiveRing.jpg"));
				tp5.setText(DiamondRing.main(null));

			}
		});
		menuBar_1.add(mntmOther);
		
	
	
	}
	
	//
	public mainUI() {
		//createLayout();
		
	}
}
