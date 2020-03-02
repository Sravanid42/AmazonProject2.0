package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class PartyOver
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public PartyOver( String i, String n, String d, String p)
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
		PartyOver PartyOver = new PartyOver("#303","\"When the Party's Over\" by Billie Eilish", "Time: 3:16", "$1.29");
		System.out.println(PartyOver);
		
		
		return PartyOver.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}