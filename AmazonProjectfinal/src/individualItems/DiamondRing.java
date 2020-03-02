package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class DiamondRing
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public DiamondRing( String i, String n, String d, String p)
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
		DiamondRing DiamondRing = new DiamondRing("#506","Diamond Ring", "Antique platinum ring set with an 8.88 carat diamond center & 0.70 carats surronding the diamonds", "$68,500");

		System.out.println(DiamondRing);
		
		
		return DiamondRing.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}