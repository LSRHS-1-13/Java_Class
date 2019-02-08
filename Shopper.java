import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Shopper {
	Scanner scan = new Scanner(System.in);
	double money;
	Map<Item, Integer> cart = new HashMap<Item, Integer>();
	Map<Item, Integer> boughtItems = new HashMap<Item, Integer>();
	public Shopper(String shopperName, double balance, /*ArrayList<String>[] methodsOfPayment,*/ double sneakiness) {
		money = balance;
	}
	boolean repeat1 = true;
	boolean repeat2 = true;
	boolean repeat3 = true;
	public void visit(Mall mallname) {
		while(repeat1 == true) {
			repeat1 = false;
			repeat2 = true;
			repeat2 = true;
		System.out.println("Which store would you like to visit?");
		for (int i = 0; i < NatickCollection.availableStores().size(); i++) {
		System.out.println((i + 1) + ". " + NatickCollection.availableStores().get(i).returnName());
		
		}
		String input = scan.next();
	//	int numItems = Store.inventory().size();
		while(repeat2 == true) {
			repeat2 = false;
			repeat3 = true;
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
		if (cart.containsKey(item)) {
			int value = cart.get(item);
			cart.remove(item);
			cart.put(item, value + Integer.parseInt(input2));
		}
		else {
		cart.put(item, Integer.parseInt(input2));
		}
		while(repeat3 == true) {
			repeat3 = false;
		System.out.println("What would you like to do now?");
		System.out.println("1. Check Cart");
		System.out.println("2. Buy Something Else");
		System.out.println("3. Checkout");
		System.out.println("4. Attempt Thievery");
		System.out.println("5. Check Balance");
		String input3 = scan.next();
		if (input3.equals("1")) {
			Iterator<Item> iterator =  cart.keySet().iterator();
			Iterator<Integer> iterator1 =  cart.values().iterator();
			repeat3 = true;
			double cartCost = 0;
			while(iterator.hasNext()){
			  Item element = (Item) iterator.next();
			  Integer element2 = (Integer) iterator1.next();
			  String element1 = element.returnName();
			  Double element3 = element.returnPrice();
			  cartCost = cartCost + (element2 * element3);
			  System.out.println(element1 + " " + element2);
			}
			System.out.println("Your Cart Costs: $" + cartCost);
		}else if(input3.equals("2")) {
			repeat2 = true;
			
		}else if (input3.equals("3")) {
			repeat1 = true;
			Iterator<Item> iterator =  cart.keySet().iterator();
			Iterator<Integer> iterator1 =  cart.values().iterator();
			double cartCost = 0;
			while(iterator.hasNext()){
			  Item element = (Item) iterator.next();
			  Integer element2 = (Integer) iterator1.next();
			  boughtItems.put(element, element2);
			  cart.remove(element);
			  if (boughtItems.containsKey(element)) {
					int value = boughtItems.get(element);
					boughtItems.remove(element);
					boughtItems.put(element, value + element2);
				}
				else {
					boughtItems.put(element, element2);
				}
			  Double element1 = element.returnPrice();
			  cartCost = cartCost + (element1 * element2);
			}
			money = money - cartCost;
			System.out.println("Your Balance Is: $" + money);
		}else if (input3.equals("4")) {
			System.out.println("Theif u r");
			repeat3 = true;
		}else if (input3.equals("5")) {
			System.out.println("Your Balance Is: $" + money);
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
	//add some more buttons
	public void checkInput(String input) {
		if (input.equals("i")) {
			
		} else if(input.equals("e")) {
			
		}
	}
}
