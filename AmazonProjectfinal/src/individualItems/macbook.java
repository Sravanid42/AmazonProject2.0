package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class macbook
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public macbook( String i, String n, String d, String p)
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
		macbook macbook = new macbook("#202","13-inch Macbook Pro", "1.4GHz Quad-Core Processor, touchbar, touch ID, 256 GB", "$1499.00");
		System.out.println(macbook);
		
		
		return macbook.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}