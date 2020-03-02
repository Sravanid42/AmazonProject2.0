package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class bar
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public bar( String i, String n, String d, String p)
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
		bar bar = new bar("#407","Nature Valley Granola Bars", "total 36 bars, made with real ingredients, wholesome snack bar", "17.52");

		System.out.println(bar);
		
		
		return bar.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}