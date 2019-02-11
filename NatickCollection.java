import java.util.ArrayList;
import java.util.List;

public class NatickCollection extends Mall {
	static List<Store> stores;
	static Security NatickSecure;
	public NatickCollection() {
		
	NatickSecure = new Security(5, 15);
	stores = new ArrayList<Store>();
	Store Bills_Barbecue = new Store("Bills_Barbecue");
	Store Bobs_Barnacles = new Store("Bobs_Barnacles");
	stores.add(Bills_Barbecue);
	stores.add(Bobs_Barnacles);
	Bills_Barbecue.addItem("jam", 50, 30);
	Bobs_Barnacles.addItem("toast", 10, 30);
	Bobs_Barnacles.addItem("Fishy Fish", 20, 3);
	
	}
	public static List<Store> availableStores() {
		return stores;
	}
	public static double security() {
		return NatickSecure.security();
	}

}
