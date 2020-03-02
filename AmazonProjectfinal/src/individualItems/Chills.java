package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class Chills
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public Chills( String i, String n, String d, String p)
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

		Chills Chills = new Chills("#302","\"Chills\" by Why Don't We", "Time: 2:45", "$1.29");
		
		System.out.println(Chills);
		
		
		return Chills.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}