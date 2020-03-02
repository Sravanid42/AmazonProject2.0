package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class popsocket
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public popsocket( String i, String n, String d, String p)
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
		popsocket popsocket = new popsocket("#501","Pop socket", 
				"multi-colored graphic with glossy finish, offers secure grip on phone", "$8.00");
		System.out.println(popsocket);
		
		
		return popsocket.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}