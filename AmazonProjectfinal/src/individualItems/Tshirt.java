package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class Tshirt
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public Tshirt( String i, String n, String d, String p)
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
		Tshirt Tshirt = new Tshirt( "#001","10 pack white T-shirts", 	
				"10 count, white 100% cotton T-shirts, size: L", "$15.00");
		
		System.out.println(Tshirt);
		
		
		return Tshirt.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}