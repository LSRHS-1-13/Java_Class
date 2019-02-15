import java.util.List;

public abstract class Mall {
	private String name;
	private List<Store> stores;
	private Security NatickSecure;
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
