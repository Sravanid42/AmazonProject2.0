package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class iPhoneCase
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public iPhoneCase( String i, String n, String d, String p)
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
		iPhoneCase iPhoneCase = new iPhoneCase("#502","Otterbox Symmetry Case", 
				"synthetic rubber, ultra thin, raised bumper", "$45.00");
		System.out.println(iPhoneCase);
		
		
		return iPhoneCase.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}