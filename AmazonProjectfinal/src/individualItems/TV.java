package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class TV
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public TV( String i, String n, String d, String p)
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
		TV TV = new TV("#205","50-inch Samsung Smart 4K Ultra HD TV", "2 HDMI ports, Pur Color, connect & share", "$300.00");
		System.out.println(TV);
		
		
		return TV.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}