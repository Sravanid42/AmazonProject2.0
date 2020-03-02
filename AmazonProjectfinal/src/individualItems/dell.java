package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class dell
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public dell( String i, String n, String d, String p)
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
		dell dell = new dell("#201","Dell-Inspiron 15.6''", "Touchscreen, Intel Core i5, 8GB Memory, color: black", "$500.00");
		
		System.out.println(dell);
		
		
		return dell.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}