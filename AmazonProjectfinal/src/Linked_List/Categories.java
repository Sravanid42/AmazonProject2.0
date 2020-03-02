package Linked_List;
import UI.*;
import java.util.ArrayList;
import java.util.LinkedList;

import Linked_List.CircleQueue;


public class Categories
{
	private CircleQueue BTS_albums;
	private CircleQueue Apparel;
	private CircleQueue Music;
	private CircleQueue Snacks;
	private CircleQueue Electronics;
	private CircleQueue Other;
	private int size = 5;	
    
	public ArrayList<CircleQueue> GetData(){
	  ArrayList<CircleQueue> array = new ArrayList<CircleQueue>();
	  array.add(BTS_albums);
	  array.add(Apparel);
	  array.add(Music);
	  array.add(Snacks);
	  array.add(Electronics);
	  array.add(Other);
		return array;
	}	
	
	public Categories()
	{
		  BTS_albums = new CircleQueue();
		  Apparel = new CircleQueue();
		  Music = new CircleQueue();
		  Snacks = new CircleQueue();
		  Electronics = new CircleQueue();
		  Other = new CircleQueue();
	}

	public void addBTS()
	  {
		//add BTS Albums
		BTS_Albums MapSoul7 = new BTS_Albums("#101","Map of the Soul: 7", 
				"4 versions, photobook, lyric book, minibook, postcard, sticker, poster", "$25.00");
		BTS_Albums MapSoulPersona = new BTS_Albums("#102","Map of the Soul: Persona", 
				"4 versions, photobook, sticker, minibook", "$18.00");
		BTS_Albums Wings = new BTS_Albums("#103","BTS 2nd Album[Wings]", 
				"1 CD, photobook, photocard, poster", "$21.00");
		BTS_Albums Answer = new BTS_Albums("#104","Love Yourself: Answer", 
				"2 CDs, photobook, photocard, poster", "$21.00");
		BTS_Albums Tear = new BTS_Albums("#105","Love Yourself: Tear", 
				"1CD, photobook, dual member photocard, poster", "$23.00");
		BTS_Albums DarkWild = new BTS_Albums("#106","BTS 1st Album [Dark & Wild]", 
				"1 CD, 2 animation pictures, 2 photocards", "$18.00");
		BTS_Albums NeverWalk = new BTS_Albums("#107","You Never Walk Alone", 
				"1 CD, photobook, photocard, poster", "$23.00");

	  }
	
	public void addApparel()
	{
		Apparel Tshirt = new Apparel("001","10 pack white T-shirts", 
				"10 count, white 100% cotton T-shirts, size: L", "$15.00");
		Apparel ParachutePants = new Apparel("002","Parachute pants", 
				"Gold, parachute pants with elastic wasteband, fits most tetens and adults", "$18.00");
		Apparel Nike = new Apparel("003","Nike Air Zoom Pegasus", 
				"cooling perforations, breathability across high-heat areas, reduce bulk without compromising comfort, Color: thunder gray", 
				"$120.00");
		Apparel Crocs = new Apparel("004","Balenciaga Platform Crocs", 
				"maximum shock absorbance, odor and water resistant, 15 cm platform, made in Wuhan", "$850.00");
		Apparel Hoodie = new Apparel("005","Under Armour Hoodie", 
				"maximum comfort, air-jet yarn, 50% cotton 50% polyester", "$34.00");
		Apparel Uggs = new Apparel("006","Thigh-high Uggs", 
				"fashionable, wedge heel, 22'' shaft height, 2' heel height, water repellant", "$300.00");
		Apparel Jeans = new Apparel("007","Advanced Stretch Skinny Jeans", 
				"64% cotton 21% Modal 14% Lyocell 1% Elastane, dark wash denim, fading contrast stitching", "$25.00");
	}
	
	public void addElectronics()
	{
    	//add Music
		Electronics dell = new Electronics("#201","Dell-Inspiron 15.6''", "Touchscreen, Intel Core i5, 8GB Memory, color: black", "$500.00");
		Electronics macbook = new Electronics("#202","13-inch Macbook Pro", "1.4GHz Quad-Core Processor, touchbar, touch ID, 256 GB", "$1499.00");
		Electronics iPhonePro = new Electronics("#203","iPhone 11 Pro Max", "Triple-camera system, 256 GB, Color: Space Gray", "$1249.00");
		Electronics iPad = new Electronics("#204","12.9 inch iPad Pro", 
				"Liquid retina display, 12-megapixel camera, true tone display, 256 GB, color: silver", "$1149.00");
		Electronics TV = new Electronics("#205","50-inch Samsung Smart 4K Ultra HD TV", "2 HDMI ports, Pur Color, connect & share", "$300.00");
		Electronics watch = new Electronics("#206","Apple Watch Series 5", 
				"Always-On retina display, Ultra-low power LTPO display, all-day battery life", "$400.00");

	}
	
	public void addMusic()
	{
    	//add Music
		Music Circles = new Music("#301","\"Circles\" by Post Malone", "Time: 3:35", "$1.29");
		Music Chills = new Music("#302","\"Chills\" by Why Don't We", "Time: 2:45", "$1.29");
		Music Partyover = new Music("#303","\"When the Party's Over\" by Billie Eilish", "Time: 3:16", "$1.29");
		Music Beautiful = new Music("#304","\"What Makes You Beautiful\" by One Direction", "Time: 3:19", "$1.29");
		Music Lovestory = new Music("#305","\"Love Story\" by Taylor Swift", "Time: 3:55", "$1.29");
		Music Thankyounext = new Music("#306","\"Thank you, next\" by Ariana Grande", "Time: 3:27", "$1.29");
		Music Memories = new Music("#307","\"Memories\" by Maroon 5", "Time: 3:09", "$1.29");

	}
	
	public void addSnacks()
	{
    	//add Music
		Snacks chips = new Snacks("#401","Catherine's chips", "Bestest chips ever, sponsored by Sravani", "$5.00");
		Snacks cookies = new Snacks("#402","Chocolate chip cookies", "Pack of 20 cookies", "$6.00");
		Snacks hotcheetos = new Snacks("#403","Flamin' Hot Cheetos", "Made with real cheese", "$3.00");
		Snacks popcorn = new Snacks("#404","Orville Redenbacher's Ultra Butter Microwave Popcorn", "6 packs of 3.96 oz. popcorn", "$20.88");
		Snacks gummybears = new Snacks("#405","Haribo Gummy Bears", "5 lb, approximately 985 pieces, America's #1 selling gummy bear", "$12.79");
		Snacks goldfish = new Snacks("#406","Pepperidge Farm Xtra Cheddar Goldfish", 
				"Playful cheese crackers baked with a smile, no artificial colors or preservatives", "3.64");
		Snacks bar = new Snacks("#407","Nature Valley Granola Bars", "total 36 bars, made with real ingredients, wholesome snack bar", "17.52");

	}
	
	
	public void addOther()
	{
    	//add Music
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
	}
	
	public void removeproducts()
	  {
		  	// popping data off stack with console output
		  	for (int i = size; i >= 0; i--)
		  	{
				 System.out.println("Delete:" + BTS_albums.delete() + " " + BTS_albums);						
		  	}
	  }

	  /**
	   *  Display the top element of the list and full stack
	   */
	  public void displayQueue()
	  {
	    System.out.println("First Element: " + BTS_albums.getFirstObject() );
	    System.out.println("Last Element: " + BTS_albums.getLastObject() );
	    System.out.println("Complete Queue: " + BTS_albums);
	  }
	
	
}
