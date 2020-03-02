package Linked_List;
import UI.*;
public class BTS_Albums 
{
	//make objects
	String item;
	String name;
	String description;
	String price;
	
	public BTS_Albums(String i, String n, String d, String p)
	{
		this.item = i;
		this.name = n;
		this.description = d;
		this.price = p;
	}

	public String toString() 
	{
		//toString
		return (item + "\n"+ name + "\n" + description + "\nPrice: " + price);
	}
	
	public static String main(String[] args)
	{
		//add BTS albums
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

		System.out.println(MapSoul7);
		System.out.println(MapSoulPersona);
		System.out.println(Wings);
		System.out.println(Answer);
		System.out.println(Tear);
		System.out.println(DarkWild);
		System.out.println(NeverWalk);
		
		return MapSoul7.toString() +"\n\n"+ MapSoulPersona +"\n\n" + Wings +"\n\n" + Answer +"\n\n" + Tear +"\n\n" + DarkWild +"\n\n" + NeverWalk;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
