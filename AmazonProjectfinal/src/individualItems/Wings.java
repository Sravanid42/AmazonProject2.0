package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class Wings
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public Wings( String i, String n, String d, String p)
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
		Wings Wing = new Wings("#103","BTS 2nd Album[Wings]", 
				"1 CD, photobook, photocard, poster", "$21.00");
		System.out.println(Wing);
		
		
		return Wing.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}