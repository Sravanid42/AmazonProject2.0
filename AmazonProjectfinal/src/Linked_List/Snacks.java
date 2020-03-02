package Linked_List;
import UI.*;
public class Snacks 
{
	//make objects
	String item;
	String name;
	String description;
	String price;
	
	public Snacks(String i, String n, String d, String p)
	{
		this.item =i;
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
		//add snacks
		Snacks chips = new Snacks("#401","Catherine's chips", "Bestest chips ever, sponsored by Sravani", "$5.00");
		Snacks cookies = new Snacks("#402","Chocolate chip cookies", "Pack of 20 cookies", "$6.00");
		Snacks hotcheetos = new Snacks("#403","Flamin' Hot Cheetos", "Made with real cheese", "$3.00");
		Snacks popcorn = new Snacks("#404","Orville Redenbacher's Ultra Butter Microwave Popcorn", "6 packs of 3.96 oz. popcorn", "$20.88");
		Snacks gummybears = new Snacks("#405","Haribo Gummy Bears", "5 lb, approximately 985 pieces, America's #1 selling gummy bear", "$12.79");
		Snacks goldfish = new Snacks("#406","Pepperidge Farm Xtra Cheddar Goldfish", 
				"Playful cheese crackers baked with a smile, no artificial colors or preservatives", "3.64");
		Snacks bar = new Snacks("#407","Nature Valley Granola Bars", "total 36 bars, made with real ingredients, wholesome snack bar", "17.52");

		System.out.println(chips);
		System.out.println(cookies);
		System.out.println(hotcheetos);
		System.out.println(popcorn);
		System.out.println(gummybears);
		System.out.println(goldfish);
		System.out.println(bar);
		
		return chips.toString() +"\n\n"+ cookies +"\n\n" + hotcheetos +"\n\n" + popcorn +"\n\n" + gummybears +"\n\n" + goldfish +"\n\n" + bar;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}

