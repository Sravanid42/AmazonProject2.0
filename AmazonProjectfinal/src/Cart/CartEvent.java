package Cart;

public class CartEvent {
	// Define the kinds of changes that can take place
		public static final int ADDED_ITEM = 1;
		public static final int REMOVED_ITEM = 2;
		public static final int CHANGED_ITEM = 3;

	// item is the item that is affected
		public Cart item;

	// eventType is the kind of change that has taken
	// place (add/remove/change)
		public int eventType;

		public CartEvent()
		{
		}

		public CartEvent(Cart item,
			int eventType)
		{
			this.item = item;
			this.eventType = eventType;
		}

}
