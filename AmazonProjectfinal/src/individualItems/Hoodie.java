package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class Hoodie
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public Hoodie( String i, String n, String d, String p)
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
		Hoodie Hoodie = new Hoodie("#005","Under Armour Hoodie", 
				"maximum comfort, air-jet yarn, 50% cotton 50% polyester", "$34.00");
		
		System.out.println(Hoodie);
		
		
		return Hoodie.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}