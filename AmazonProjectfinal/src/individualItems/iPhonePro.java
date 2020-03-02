package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class iPhonePro
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public iPhonePro( String i, String n, String d, String p)
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
		iPhonePro iPhonePro = new iPhonePro("#203","iPhone 11 Pro Max", "Triple-camera system, 256 GB, Color: Space Gray", "$1249.00");
		System.out.println(iPhonePro);
		
		
		return iPhonePro.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}