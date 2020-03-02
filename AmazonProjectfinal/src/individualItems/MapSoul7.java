package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class MapSoul7
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public MapSoul7( String i, String n, String d, String p)
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
		MapSoul7 MapSoul17 = new MapSoul7("#101","Map of the Soul: 7", 
				"4 versions, photobook, lyric book, minibook, postcard, sticker, poster", "$25.00");
		System.out.println(MapSoul17);
		
		
		return MapSoul17.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}