package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class goldfish
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public goldfish( String i, String n, String d, String p)
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
		goldfish goldfish = new goldfish("#406","Pepperidge Farm Xtra Cheddar Goldfish", 
				"Playful cheese crackers baked with a smile, no artificial colors or preservatives", "3.64");
		System.out.println(goldfish);
		
		
		return goldfish.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}