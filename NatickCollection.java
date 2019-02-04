import java.util.ArrayList;
import java.util.List;

public class NatickCollection extends Mall {
	static List<Store> stores;
	public NatickCollection() {
		
	
	stores = new ArrayList<Store>();
	Store Bills_Barbecue = new Store("Bills_Barbecue");
	Store Bobs_Barnacles = new Store("Bobs_Barnacles");
	stores.add(Bills_Barbecue);
	stores.add(Bobs_Barnacles);
	Bills_Barbecue.addItem("jam", 20, 30);
	Bobs_Barnacles.addItem("toast", 20, 30);
	Bobs_Barnacles.addItem("Fishy Fish", 20, 30);
	
	}
	public static List<Store> availableStores() {
		return stores;
	}

}
