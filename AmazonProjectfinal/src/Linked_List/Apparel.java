package Linked_List;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class Apparel 
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public Apparel( String i, String n, String d, String p)
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
	//
	
		
		//add apparel
		Apparel Tshirt = new Apparel( "#001","10 pack white T-shirts", 	
				"10 count, white 100% cotton T-shirts, size: L", "$15.00");
		Apparel ParachutePants = new Apparel("#002","Parachute pants", 
				"Gold, parachute pants with elastic wasteband, fits most tetens and adults", "$18.00");
		Apparel Nike = new Apparel("#003","Nike Air Zoom Pegasus", 
				"cooling perforations, breathability across high-heat areas, reduce bulk without compromising comfort, Color: thunder gray", 
				"$120.00");
		Apparel Crocs = new Apparel("#004","Balenciaga Platform Crocs", 
				"maximum shock absorbance, odor and water resistant, 15 cm platform, made in Wuhan", "$850.00");
		Apparel Hoodie = new Apparel("#005","Under Armour Hoodie", 
				"maximum comfort, air-jet yarn, 50% cotton 50% polyester", "$34.00");
		Apparel Uggs = new Apparel("#006","Thigh-high Uggs", 
				"fashionable, wedge heel, 22'' shaft height, 2' heel height, water repellant", "$300.00");
		Apparel Jeans = new Apparel("#007","Advanced Stretch Skinny Jeans", 
				"64% cotton 21% Modal 14% Lyocell 1% Elastane, dark wash denim, fading contrast stitching", "$25.00");

		System.out.println(Tshirt);
		System.out.println(ParachutePants);
		System.out.println(Nike);
		System.out.println(Crocs);
		System.out.println(Hoodie);
		System.out.println(Uggs);
		System.out.println(Jeans);
		
		
		
		return Tshirt.toString() +"\n\n"+ ParachutePants +"\n\n" + Nike +"\n\n" + Crocs +"\n\n" + Hoodie +"\n\n" + Uggs +"\n\n" + Jeans;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
