package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class Answer
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public Answer( String i, String n, String d, String p)
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
		Answer Answer = new Answer("#104","Love Yourself: Answer", 
				"2 CDs, photobook, photocard, poster", "$21.00");
		System.out.println(Answer);
		
		
		return Answer.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}