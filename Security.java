
public class Security {
	private int guards;
	private double watchfullness;
	public Security(int guards, double watchfullness) {
		this.guards = guards;
		this.watchfullness = watchfullness;
	}
	public double security() {
		return guards * watchfullness;
	}
}
