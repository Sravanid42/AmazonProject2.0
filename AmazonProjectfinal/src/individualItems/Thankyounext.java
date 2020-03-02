package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class Thankyounext
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public Thankyounext( String i, String n, String d, String p)
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

		Thankyounext Thankyounext = new Thankyounext("#306","\"Thank you, next\" by Ariana Grande", "Time: 3:27", "$1.29");
		
		System.out.println(Thankyounext);
		
		
		return Thankyounext.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}