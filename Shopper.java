import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Shopper {
	Scanner scan = new Scanner(System.in);
	Map<Item, Integer> cart = new HashMap<Item, Integer>();
	public Shopper(String shopperName, double balance, /*ArrayList<String>[] methodsOfPayment,*/ double sneakiness) {

	}
	boolean repeat1 = true;
	boolean repeat2 = true;
	boolean repeat3 = true;
	public void visit(Mall mallname) {
		while(repeat1 == true) {
			repeat1 = false;
		System.out.println("Which store would you like to visit?");
		for (int i = 0; i < NatickCollection.availableStores().size(); i++) {
		System.out.println((i + 1) + ". " + NatickCollection.availableStores().get(i).returnName());
		
		}
		String input = scan.next();
	//	int numItems = Store.inventory().size();
		while(repeat2 == true) {
			repeat2 = false;
		System.out.println("Which item would you like to get?");
		Item item = null;
		for (int i = 0; i < NatickCollection.availableStores().get(Integer.parseInt(input)-1).inventory().size(); i++) {
			item = NatickCollection.availableStores().get(Integer.parseInt(input)-1).inventory().get(i);
			System.out.println((i + 1) + ". " + item.returnName() + " $" + item.returnPrice());
		}
		String input1 = scan.next();
		item = NatickCollection.availableStores().get(Integer.parseInt(input)-1).inventory().get(Integer.parseInt(input1)-1);
	//fix above
		System.out.println("How much would you like of the " + item.returnName() + "?");
		String input2 = scan.next();
		cart.put(item, Integer.parseInt(input2));
		while(repeat3 == true) {
			repeat3 = false;
		System.out.println("What would you like to do now?");
		System.out.println("1. Check Cart");
		System.out.println("2. Buy Something Else");
		System.out.println("3. Checkout");
		System.out.println("4. Attempt Thievery");
		String input3 = scan.next();
		if (input3.equals("1")); {
			Iterator<Item> iterator =  cart.keySet().iterator();
			Iterator<Integer> iterator1 =  cart.values().iterator();
			repeat3 = true;
			while(iterator.hasNext()){
			  Item element = (Item) iterator.next();
			  Integer element2 = (Integer) iterator1.next();
			  String element1 = element.returnName();
				System.out.println(element1 + " " + element2);
			}
		}if(input3.equals("2")) {
			repeat2 = true;
			
		}if (input3.equals("3")) {
			repeat1 = true;
		}if (input3.equals("4")) {
			System.out.println("Theif u r");
			repeat3 = true;
		}
		}
			
		
//		for (int i = 0; i < Integer.parseInt(input1); i++) {
//			
//			
//		}
		}
	}
	}
}
