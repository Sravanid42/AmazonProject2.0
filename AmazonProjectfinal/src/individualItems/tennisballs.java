package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class tennisballs
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public tennisballs( String i, String n, String d, String p)
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
		tennisballs tennisballs = new tennisballs("#503","Penn Pro Tennis Balls", 
				"longest lasting tennis balls, LongPlay felt", "$80.00");
		System.out.println(tennisballs);
		
		
		return tennisballs.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}