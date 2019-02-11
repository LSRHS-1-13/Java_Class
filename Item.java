
public class Item {
	
	private String name;
	private double price;
	private double stealability;
	public Item(String itemName, double price, double stealability) {
		name = itemName;
		this.price = price;
		this.stealability = stealability;
	}
	public String returnName() {
		return name;
	}
	public double returnPrice() {
		return price;
	}
	public double returnSteal() {
		return stealability;
	}
	

}
