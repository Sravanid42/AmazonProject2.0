package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class hotcheetos
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public hotcheetos( String i, String n, String d, String p)
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
		hotcheetos hotcheetos = new hotcheetos("#403","Flamin' Hot Cheetos", "Made with real cheese", "$3.00");
		System.out.println(hotcheetos);
		
		
		return hotcheetos.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}