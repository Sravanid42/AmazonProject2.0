package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class popcorn
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public popcorn( String i, String n, String d, String p)
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
		popcorn popcorn = new popcorn("#404","Orville Redenbacher's Ultra Butter Microwave Popcorn", "6 packs of 3.96 oz. popcorn", "$20.88");
		System.out.println(popcorn);
		
		
		return popcorn.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}