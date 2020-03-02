package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class Uggs
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public Uggs( String i, String n, String d, String p)
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
		Uggs Uggs = new Uggs("#006","Thigh-high Uggs", 
				"fashionable, wedge heel, 22'' shaft height, 2' heel height, water repellant", "$300.00");
		
		System.out.println(Uggs);
		
		
		return Uggs.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}