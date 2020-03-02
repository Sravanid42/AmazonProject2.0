package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class DarkWild
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public DarkWild( String i, String n, String d, String p)
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
		DarkWild DarkWild = new DarkWild("#106","BTS 1st Album [Dark & Wild]", 
				"1 CD, 2 animation pictures, 2 photocards", "$18.00");
		System.out.println(DarkWild);
		
		
		return DarkWild.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}