package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class gummybears
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public gummybears( String i, String n, String d, String p)
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
		gummybears gummybears = new gummybears("#405","Haribo Gummy Bears", "5 lb, approximately 985 pieces, America's #1 selling gummy bear", "$12.79");
		System.out.println(gummybears);
		
		
		return gummybears.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}