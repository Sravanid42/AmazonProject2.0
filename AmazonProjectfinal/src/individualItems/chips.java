package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class chips
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public chips( String i, String n, String d, String p)
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
		chips chips = new chips("#401","Catherine's chips", "Bestest chips ever, sponsored by Sravani", "$5.00");
		System.out.println(chips);
		
		
		return chips.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}