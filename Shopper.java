import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Shopper {
	Scanner scan = new Scanner(System.in);
	double money;
	double sneakiness;
	Map<Item, Integer> cart;
	Map<Item, Integer> boughtItems;
	public Shopper(String shopperName, double balance, /*ArrayList<String>[] methodsOfPayment,*/ double sneakiness) {
		money = balance;
		this.sneakiness = sneakiness;
		cart = new HashMap<Item, Integer>();
		boughtItems = new HashMap<Item, Integer>();
	}
	boolean repeat1 = true;
	boolean repeat2 = true;
	boolean repeat3 = true;
	public void visit(Mall mallname) {
		System.out.println("Welcome to the " + mallname.getName() + "!");
		System.out.println("Throughout your time here, feel free to use i to check what you've bought so far as "
							+ "well as to check your current balance.");
		System.out.println("And you can press e in order to exit the mall. Enjoy your shopping!");
		while(repeat1 == true) {
			repeat1 = false;
			repeat2 = true;
			repeat2 = true;
		System.out.println("Which store would you like to visit?");
		for (int i = 0; i < mallname.availableStores().size(); i++) {
		System.out.println((i + 1) + ". " + mallname.availableStores().get(i).returnName());
		
		}
		String input = scan.next();
		if (checkInput(input)) {
			System.out.println("Which store would you like to visit?");
			for (int i = 0; i < mallname.availableStores().size(); i++) {
			System.out.println((i + 1) + ". " + mallname.availableStores().get(i).returnName());
			
			}
			input = scan.next();
		}
		
	//	int numItems = Store.inventory().size();
		while(repeat2 == true) {
			repeat2 = false;
			repeat3 = true;
			System.out.println("Which item would you like to get?");
		Item item = null;
		for (int i = 0; i < mallname.availableStores().get(Integer.parseInt(input)-1).inventory().size(); i++) {
			item = mallname.availableStores().get(Integer.parseInt(input)-1).inventory().get(i);
			System.out.println((i + 1) + ". " + item.returnName() + " $" + item.returnPrice());
		}
		String input1 = scan.next();
		if (checkInput(input1)) {
			System.out.println("Which item would you like to get?");
			for (int i = 0; i < mallname.availableStores().get(Integer.parseInt(input)-1).inventory().size(); i++) {
				item = mallname.availableStores().get(Integer.parseInt(input)-1).inventory().get(i);
				System.out.println((i + 1) + ". " + item.returnName() + " $" + item.returnPrice());
			}
			input1 = scan.next();
		}
		item = mallname.availableStores().get(Integer.parseInt(input)-1).inventory().get(Integer.parseInt(input1)-1);
	//fix above
		System.out.println("How much would you like of the " + item.returnName() + "?");
		
		String input2 = scan.next();
		if (checkInput(input2)) {
			System.out.println("How much would you like of the " + item.returnName() + "?");
			input2 = scan.next();
		}
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
		if (checkInput(input3)) {
			System.out.println("What would you like to do now?");
			System.out.println("1. Check Cart");
			System.out.println("2. Buy Something Else");
			System.out.println("3. Checkout");
			System.out.println("4. Attempt Thievery");
			System.out.println("5. Check Balance");
			input3 = scan.next();
		}
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
			repeat1 = true;
			Iterator<Item> iterator =  cart.keySet().iterator();
			Iterator<Integer> iterator1 =  cart.values().iterator();
			double stealability = 0;
			while(iterator.hasNext()){
			  Item element = (Item) iterator.next();
			  Integer element2 = (Integer) iterator1.next();
			  Double element3 = (Double) element.returnSteal();
			  stealability = stealability + (element3 * element2);
			  if (stealability * mallname.security() < sneakiness) {
				  boughtItems.put(element, element2);
				  cart.remove(element);
			  }else {
				  System.out.println("Lol now ur a sacrifice for Fat Dog");
				  repeat1 = false;
				  
			  }
			  
			 
			}
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
	public boolean checkInput(String input) {
		if (input.equals("i")) {
			Iterator<Item> iterator =  boughtItems.keySet().iterator();
			Iterator<Integer> iterator1 =  boughtItems.values().iterator();
			while(iterator.hasNext()){
			  Item element = (Item) iterator.next();
			  Integer element2 = (Integer) iterator1.next();
			  String element1 = element.returnName();
			  System.out.println(element1 + " " + element2);
			}
			System.out.println("Your Balance Is: $" + money);
			return true;
		} else if(input.equals("e")) {
			System.exit(0);
			return true;
		}
		else {
			return false;
		}
	}
}
