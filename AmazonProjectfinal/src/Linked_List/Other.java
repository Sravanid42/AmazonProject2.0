package Linked_List;
import UI.*;
public class Other 
{
	//make objects
	String item;
	String name;
	String description;
	String price;
	
	public Other(String i, String n, String d, String p)
	{
		this.item = i;
		this.name = n;
		this.description = d;
		this.price = p;
	}

	public String toString() 
	{
		//toString
		return (item + "\n" + name + "\n" + description + "\nPrice: " + price);
	}
	
	public static String main(String[] args)
	{
		//add miscellaneous objects
		Other popsocket = new Other("#501","Pop socket", 
				"multi-colored graphic with glossy finish, offers secure grip on phone", "$8.00");
		Other iPhoneCase = new Other("#502","Otterbox Symmetry Case", 
				"synthetic rubber, ultra thin, raised bumper", "$45.00");
		Other tennisballs = new Other("#503","Penn Pro Tennis Balls", 
				"longest lasting tennis balls, LongPlay felt", "$80.00");
		Other pencil = new Other("#504","Papermate Clearpoint Mechanical Pencils", 
				"0.05 mm, convenient click, twist eraser, comfort grip", "$5.00");
		Other necklace = new Other("#505","Diamond and Blue Sapphire Halo Necklace", 
				"New 28.9 ctw diamond, gold, and sapphire", "$45950");


		System.out.println(popsocket);
		System.out.println(iPhoneCase);
		System.out.println(tennisballs);
		System.out.println(pencil);
		System.out.println(necklace);
		
		return popsocket.toString() +"\n\n"+ iPhoneCase +"\n\n" + tennisballs +"\n\n" + pencil +"\n\n" + necklace;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}

