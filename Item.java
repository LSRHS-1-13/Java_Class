
public class Item {
	
	private String name;
	private double price;
	public Item(String itemName, double price, double stealability) {
		name = itemName;
		this.price = price;
	}
	public String returnName() {
		return name;
	}
	public double returnPrice() {
		return price;
	}

}
