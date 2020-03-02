package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class cookies
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public cookies( String i, String n, String d, String p)
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
		cookies cookies = new cookies("#402","Chocolate chip cookies", "Pack of 20 cookies", "$6.00");
		System.out.println(cookies);
		
		
		return cookies.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}