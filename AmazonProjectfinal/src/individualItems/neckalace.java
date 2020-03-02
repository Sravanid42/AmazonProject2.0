package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class neckalace
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public neckalace( String i, String n, String d, String p)
	{	

		this.item = i;
		this.name = n;
		this.description = d;
		this.price = p;
	}

	public String toString() 
	{
		//toString
		return ( "\n" + item + "\n" + name + "\n" + description + "\n" + price);
	}
	
	public static String main(String[] args)
	{
	
	
		
		//add apparel
		neckalace neckalace = new neckalace("#505","Diamond and Blue Sapphire Halo Necklace", 
				"New 28.9 ctw diamond, gold, and sapphire", "$45950");
		System.out.println(neckalace);
		
		
		return neckalace.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}