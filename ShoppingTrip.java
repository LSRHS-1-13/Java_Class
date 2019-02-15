

public class ShoppingTrip {

	public static void main(String[] args) {
		Mall theMall = new NatickCollection();
		Mall theMall1 = new GOATCollection();
		Shopper theShopper = new Shopper("Jeff", 6000, 5000);

		theShopper.visit(theMall1);


	}

}
