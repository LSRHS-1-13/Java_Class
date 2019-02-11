import java.util.List;

public abstract class Mall {
	String name;
	List<Store> stores;
	Security NatickSecure;
	public Mall() {

	}
	public String getName() {
		
		return name;
	}
	public List<Store> availableStores() {
		return stores;
	}
	public double security() {
		return NatickSecure.security();
	}

}
