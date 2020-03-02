package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class Crocs
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public Crocs( String i, String n, String d, String p)
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
		Crocs Crocs = new Crocs("#004","Balenciaga Platform Crocs", 
				"maximum shock absorbance, odor and water resistant, 15 cm platform, made in Wuhan", "$850.00");
		
		System.out.println(Crocs);
		
		
		return Crocs.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}