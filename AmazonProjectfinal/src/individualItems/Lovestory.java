package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class Lovestory
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public Lovestory( String i, String n, String d, String p)
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
		Lovestory Lovestory = new Lovestory("#305","\"Love Story\" by Taylor Swift", "Time: 3:55", "$1.29");
		System.out.println(Lovestory);
		
		
		return Lovestory.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}