package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class Jeans
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public Jeans( String i, String n, String d, String p)
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
		Jeans Jeans = new Jeans("#007","Advanced Stretch Skinny Jeans", 
				"64% cotton 21% Modal 14% Lyocell 1% Elastane, dark wash denim, fading contrast stitching", "$25.00");

		System.out.println(Jeans);
		
		
		return Jeans.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}