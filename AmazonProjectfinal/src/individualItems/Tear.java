package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class Tear
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public Tear( String i, String n, String d, String p)
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
		Tear Tear = new Tear("#105","Love Yourself: Tear", 
				"1CD, photobook, dual member photocard, poster", "$23.00");
		System.out.println(Tear);
		
		
		return Tear.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}