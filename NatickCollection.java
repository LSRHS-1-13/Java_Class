import java.util.ArrayList;
import java.util.List;

public class NatickCollection extends Mall {
	
	public void createStores() {
		
	
	List<String> stores = new ArrayList<String>();
	stores.add("Bob's Barbecue");
	stores.add("Bill");
	stores.add("Barnacle Boy");
	for (int i = 0; i < 10; i++) {
		Store store = new Store(stores.get(i));  //other stuff
	}
	
	}
}
