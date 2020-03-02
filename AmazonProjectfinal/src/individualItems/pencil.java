package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class pencil
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public pencil( String i, String n, String d, String p)
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
		pencil pencil = new pencil("#504","Papermate Clearpoint Mechanical Pencils", 
				"0.05 mm, convenient click, twist eraser, comfort grip", "$5.00");
		System.out.println(pencil);
		
		
		return pencil.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}