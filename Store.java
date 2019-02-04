import java.util.ArrayList;
import java.util.List;

public class Store {
	
	private String name;
		ArrayList<Item> items;
	
	
	public Store(String storeName) {
			//, ArrayList<String>[] items, ArrayList<String>[] acceptedPayments) 
		name = storeName;
		items = new ArrayList<Item>();
		
		
	}
	public String returnName() {
		return name;
	}
	
	public void addItem(String itemName, double price, double stealability) {
		Item item = new Item(itemName, price, stealability);
		items.add(item);
	}
	
	public List<Item> inventory() {
		return items;
		
	}

}
