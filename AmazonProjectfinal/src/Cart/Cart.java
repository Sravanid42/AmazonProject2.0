package Cart;
import UI.*;

public class Cart implements Cloneable {
	
	public String itemName;
	public double itemCost;
	public int quantity;
	public double total = 0;

	
	public void CartItem()
	{
		
	}
	
	public void CartItem(String itemName, double itemCost, int quantity)
	{
		this.itemName = itemName;
		this.itemCost = itemCost;
		this.quantity = quantity;
		
	}
	
	public void add(Cart otheritem)
	{ this.quantity = this.quantity + otheritem.quantity;
	
	}

		public void subtract(Cart otherItem)
		{
			this.quantity = this.quantity - otherItem.quantity;
		}

		
		public boolean equals(Object other)
		{
			if (this == other) return true;

			if (!(other instanceof Cart))
				return false;

			Cart otherItem =
				(Cart) other;

			return (itemName.equals(otherItem.itemName)) &&
				(itemCost == otherItem.itemCost);
		}

	// Create a printable version of this object

		public String toString()
		{
			return itemName+" cost: "+itemCost+" qty: "+quantity;
		}
		
		public double totalcost(double total, double itemcost)
		{
			total = total + itemcost;
			return (total);
		}
		
		
		public static String main(String[] args)
		{
			String total = "total";
			return total;
		}
		
		
	}

