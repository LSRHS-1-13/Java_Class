import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Shopper {
	Scanner scan = new Scanner(System.in);
	Map<Item, Integer> cart = new HashMap<Item, Integer>();
	public Shopper(String shopperName, double balance, /*ArrayList<String>[] methodsOfPayment,*/ double sneakiness) {

	}
	public void visit(Mall mallname) {
		System.out.println("Which store would you like to visit?");
		for (int i = 0; i < NatickCollection.availableStores().size(); i++) {
		System.out.println((i + 1) + ". " + NatickCollection.availableStores().get(i).returnName());
		
		}
		String input = scan.next();
	//	int numItems = Store.inventory().size();
		System.out.println("Which item would you like to get?");
		Item item = null;
		for (int i = 0; i < NatickCollection.availableStores().get(Integer.parseInt(input)-1).inventory().size(); i++) {
			item = NatickCollection.availableStores().get(Integer.parseInt(input)-1).inventory().get(i);
			System.out.println((i + 1) + ". " + item.returnName() + " $" + item.returnPrice());
		}
		String input1 = scan.next();
		item = NatickCollection.availableStores().get(Integer.parseInt(input1)-1).inventory().get(Integer.parseInt(input1)-1);
	//fix above
		System.out.println("How much would you like of the " + item.returnName() + "?");
		String input2 = scan.next();
		cart.put(item, Integer.parseInt(input2));
//		for (int i = 0; i < Integer.parseInt(input1); i++) {
//			
//			
//		}
		
	}
	
}
