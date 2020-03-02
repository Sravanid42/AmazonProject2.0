package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class ParachutePants
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public ParachutePants( String i, String n, String d, String p)
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
		ParachutePants ParachutePants = new ParachutePants("#002","Parachute pants", 
				"Gold, parachute pants with elastic wasteband, fits most tetens and adults", "$18.00");
		
		System.out.println(ParachutePants);
		
		
		return ParachutePants.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}