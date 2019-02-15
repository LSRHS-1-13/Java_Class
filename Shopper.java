import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Shopper {
	Scanner scan = new Scanner(System.in);
	private double money;
	private double sneakiness;
	private boolean breakiness;
	private Map<Item, Integer> cart;
	private Map<Item, Integer> boughtItems;
	public Shopper(String shopperName, double balance, /*ArrayList<String>[] methodsOfPayment,*/ double sneakiness) {
		money = balance;
		this.sneakiness = sneakiness;
		cart = new HashMap<Item, Integer>();
		boughtItems = new HashMap<Item, Integer>();
	}
	private boolean repeat1 = true;
	private boolean repeat2 = true;
	private boolean repeat3 = true;
	private boolean error1 = true;
	private boolean error2 = true;
	private boolean error3 = true;
	
	public Mall choose() {
		breakiness = false;
		boolean maybe = true;
		Mall theMall = new NatickCollection();
		Mall theMall1 = new GOATCollection();
		System.out.println("Welcome Shopper! What mall would you like to go to?");
		System.out.println("1. Natick Mall");
		System.out.println("2. GOAT Mall");
		while (maybe == true) {
		String input5 = scan.next();
		if (checkInput(input5)) {
			if (breakiness) {
				System.exit(0);
			}
			System.out.println("Welcome Shopper! What mall would you like to go to?");
			System.out.println("1. Natick Mall");
			System.out.println("2. GOAT Mall");
			
			input5 = scan.next();
		}
		if (input5.equals("1")) {
			maybe = false;
			return theMall;
			
		} else if (input5.equals("2")) {
			maybe = false;
			return theMall1;
		
		} else {
			System.out.println("Just be a good fat dog");
			
		}
		}
		return null;
	}
	
	public void visit(Mall mallname) {
		System.out.println("Welcome to the " + mallname.getName() + "!");
		System.out.println("Throughout your time here, feel free to use i to check what you've bought so far as "
							+ "well as to check your current balance.");
		System.out.println("And you can press e in order to exit the mall. Enjoy your shopping!");
		while(repeat1 == true) {
			repeat1 = false;
			repeat2 = true;
			repeat3 = true;
			error1 = true;
			error2 = true;
			error3 = true;
		System.out.println("Which store would you like to visit?");
		for (int i = 0; i < mallname.availableStores().size(); i++) {
			try {
		System.out.println((i + 1) + ". " + mallname.availableStores().get(i).returnName());
			}
			catch(Exception e) {
				
			}
		
		}
		String input = scan.next();
		if (checkInput(input)) {
			if (breakiness) {
				System.exit(0);
			}
			System.out.println("Which store would you like to visit?");
			for (int i = 0; i < mallname.availableStores().size(); i++) {
			System.out.println((i + 1) + ". " + mallname.availableStores().get(i).returnName());
			
			}
			
			input = scan.next();
		}
		
	//	int numItems = Store.inventory().size();
		while(repeat2 == true) {
			
			breakiness = false;
			repeat2 = false;
			repeat3 = true;
			error3 = true;
			error1 = true;

		Item item = null;
		while (error1) {
			breakiness = false;
			error1 = false;
			error2 = true;
			repeat3 = true;
			error3 = true;
		try {
			mallname.availableStores().get(Integer.parseInt(input)-1).inventory().size();
			System.out.println("Which item would you like to get?");
		for (int i = 0; i < mallname.availableStores().get(Integer.parseInt(input)-1).inventory().size(); i++) {
			item = mallname.availableStores().get(Integer.parseInt(input)-1).inventory().get(i);
			System.out.println((i + 1) + ". " + item.returnName() + " $" + item.returnPrice());
			
		}
		}
		catch(Exception e) {
			System.out.println("Please enter a valid input u nerd");
			repeat1 = true;
			break;
		}
		String input1 = scan.next();
		if (checkInput(input1)) {
			if (breakiness) {
				repeat1 = true;
				breakiness = false;
				break;
			}
			System.out.println("Which item would you like to get?");
			try {
			for (int i = 0; i < mallname.availableStores().get(Integer.parseInt(input)-1).inventory().size(); i++) {
				item = mallname.availableStores().get(Integer.parseInt(input)-1).inventory().get(i);
				System.out.println((i + 1) + ". " + item.returnName() + " $" + item.returnPrice());
			}
			}
			catch(Exception e) {
				System.out.println("Please enter a valid input u nerd");
			}
			
			input1 = scan.next();
		
		}
		while (error2) {
			if (breakiness) {
				error1 = true;
				break;
			}
			breakiness = false;
		error2 = false;
		error3 = true;
		try {
		item = mallname.availableStores().get(Integer.parseInt(input)-1).inventory().get(Integer.parseInt(input1)-1);
		}
		catch(Exception e) {
			System.out.println("Please enter a valid input u nerd");
			error1 = true;
			break;
		}
		while (error3) {
			breakiness = false;
			error3 = false;
			repeat3 = true;
		System.out.println("How much would you like of the " + item.returnName() + "?");
		
		String input2 = scan.next();
		if (checkInput(input2)) {
			if (breakiness) {
				error1 = true;
				break;
			}
			System.out.println("How much would you like of the " + item.returnName() + "?");
			
			input2 = scan.next();
		}
		if (cart.containsKey(item)) {
			int value = cart.get(item);
			cart.remove(item);
			cart.put(item, value + Integer.parseInt(input2));
		}
		else {
		try {
			int value = Integer.parseInt(input2);
			if (value > 0) {
			cart.put(item, value);
			}
			else {
				System.out.println("Please enter a valid input u nerd");
				throw new Exception("Bad");
			}
		}
		catch(Exception e) {
			error2 = true;
			break;
		}
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
			if (breakiness) {
				error3 = true;
				break;
			}
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
			  Item element = iterator.next();
			  Integer element2 = iterator1.next();
			  System.out.println(element.returnName());
	
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
			cart.clear();
		}else if (input3.equals("4")) {
			System.out.println("Theif u r");
			repeat1 = true;
			Iterator<Item> iterator =  cart.keySet().iterator();
			Iterator<Integer> iterator1 =  cart.values().iterator();
			double stealability = 0;
			while(iterator1.hasNext()){
			  Item element = (Item) iterator.next();
			  Integer element2 = (Integer) iterator1.next();
			  Double element3 = (Double) element.returnSteal();
			  stealability = stealability + (element3 * element2);
			  if (stealability * mallname.security() < sneakiness) {
				  boughtItems.put(element, element2);
	
			  }else {
				  System.out.println("Lol now ur a sacrifice for Fat Dog");
				  repeat1 = false;
				  
			  }
			  
			 cart.clear();
			}
		}else if (input3.equals("5")) {
			System.out.println("Your Balance Is: $" + money);
			repeat3 = true;
		}
		else {
			System.out.println("Please enter a valid input");
			repeat3 = true;
		}
		}
		}
		}
		}
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
			breakiness = true;
			
			
			return true;
		}
		else {
			return false;
		}
	}
}
