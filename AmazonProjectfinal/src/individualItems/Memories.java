package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class Memories
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public Memories( String i, String n, String d, String p)
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

		Memories Memories = new Memories("#307","\"Memories\" by Maroon 5", "Time: 3:09", "$1.29");
		
		System.out.println(Memories);
		
		
		return Memories.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}