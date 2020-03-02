package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class NeverWalk
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public NeverWalk( String i, String n, String d, String p)
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
		NeverWalk NeverWalk = new NeverWalk("#107","You Never Walk Alone", 
				"1 CD, photobook, photocard, poster", "$23.00");
		System.out.println(NeverWalk);
		
		
		return NeverWalk.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}