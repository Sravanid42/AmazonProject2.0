package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class iPad
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public iPad( String i, String n, String d, String p)
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
		iPad iPad = new iPad("#204","12.9 inch iPad Pro", 
				"Liquid retina display, 12-megapixel camera, true tone display, 256 GB, color: silver", "$1149.00");
		System.out.println(iPad);
		
		
		return iPad.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}