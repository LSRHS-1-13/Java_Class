import java.util.ArrayList;
import java.util.List;

public class NatickCollection extends Mall {
	List<Store> stores;
	Security NatickSecure;
	String name;
	public NatickCollection() {
		name = "Natick Mall";
		NatickSecure = new Security(5, 15);
		stores = new ArrayList<Store>();
		Store Bills_Barbecue = new Store("Bills Barbecue");
		Store Bobs_Barnacles = new Store("Bobs Barnacles");
		Store Beans_Bamboozles = new Store("Beans Bamboozles");
		stores.add(Bills_Barbecue);
		stores.add(Bobs_Barnacles);
		stores.add(Beans_Bamboozles);
		Bills_Barbecue.addItem("jam", 50, 30);
		Bobs_Barnacles.addItem("toast", 10, 30);
		Bobs_Barnacles.addItem("Fishy Fish", 20, 3);
		Beans_Bamboozles.addItem("Lima bean", 5000, 0.01);
		Beans_Bamboozles.addItem("String bean", 0.50, 1000000);
		Beans_Bamboozles.addItem("Fat Dog bean", 999999999, 99999999);
		Beans_Bamboozles.addItem("Ligma bean", 69, 0.420);
		Beans_Bamboozles.addItem("Day Old Bean", 2, 0);
	
	}
	public List<Store> availableStores() {
		return stores;
	}
	public double security() {
		return NatickSecure.security();
	}
	public String getName() {
		return name;
	}

}
