package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class Beautiful
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public Beautiful( String i, String n, String d, String p)
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
	
	//
		
		//add apparel

		Beautiful Beautiful = new Beautiful("#302","\"Beautiful\" by Why Don't We", "Time: 2:45", "$1.29");
		
		System.out.println(Beautiful);
		
		
		return Beautiful.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}