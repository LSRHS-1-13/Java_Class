
public class Security {
	int guards;
	double watchfullness;
	public Security(int guards, double watchfullness) {
		this.guards = guards;
		this.watchfullness = watchfullness;
	}
	public double security() {
		return guards * watchfullness;
	}
}
