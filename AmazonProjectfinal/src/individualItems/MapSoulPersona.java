package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class MapSoulPersona
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public MapSoulPersona( String i, String n, String d, String p)
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
		MapSoulPersona MapSoulPersona = new MapSoulPersona("#102","Map of the Soul: Persona", 
				"4 versions, photobook, sticker, minibook", "$18.00");
		System.out.println(MapSoulPersona);
		
		
		return MapSoulPersona.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}