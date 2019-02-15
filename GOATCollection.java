import java.util.ArrayList;
import java.util.List;

public class GOATCollection extends Mall {
	private List<Store> stores;
	private Security GOATSecure;
	private String name;
	public GOATCollection() {
		name = "GOAT Mall";
		GOATSecure = new Security(10000, 50);
		stores = new ArrayList<Store>();
		Store GREAT_Grill = new Store("GREAT Grill");
		Store GORMET_Garnishes = new Store("GORMET Garnishes");
		Store GROSS_Geese = new Store("GROSS Geese");
		stores.add(GREAT_Grill);
		stores.add(GORMET_Garnishes);
		stores.add(GROSS_Geese);
		GREAT_Grill.addItem("barger", 2, 1);
		GORMET_Garnishes.addItem("fish stick", 10, 20);
		GORMET_Garnishes.addItem("shimp stick", 70, 3);
		GROSS_Geese.addItem("termite", 5, 0.01);
		GROSS_Geese.addItem("wine", 10000000, 1000000);
		GROSS_Geese.addItem("bob", 0.50, 99999999);
		GROSS_Geese.addItem("gummy", 42, 0.420);
		GROSS_Geese.addItem("necklace", 2, 5);
	}
	
	public List<Store> availableStores() {
		return stores;
	}
	public double security() {
		return GOATSecure.security();
	}
	public String getName() {
		return name;
	}

}
