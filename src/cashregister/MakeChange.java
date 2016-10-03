package cashregister;

public class MakeChange {
	public static void main(String[] args) {

		changeRemaining();

	}

	public static void changeRemaining() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Please state the price of your item.");
		float price = scanner.nextFloat();
		System.out.println("How much will be tendered?");
		float tendered = scanner.nextFloat();

		float changefloat = tendered - price;
		int change = (int) ((tendered - price) * 100);
		if (tendered > price){
		System.out.printf(
				"You gave me $" + tendered + " for $" + price + ", so I will return you $%.2f" + " total change. ",
				changefloat);
		}
		int pennies = (int) (change * 100);
		int nickels = (int) (pennies / 5);
		int dimes = (int) (pennies / 10);
		int quarters = (int) (pennies / 25);
		int dollars = (int) (pennies / 100);

		if ((change / 2000) == 1) {
			System.out.println((int) (change / 2000) + " twenty dollar bill, ");
			change = change - 2000 * (int) (change / 2000);
		} else if ((change / 2000) > 1) {
			System.out.println((int) (change / 2000) + " twenty dollar bills, ");
			change = change - 2000 * (int) (change / 2000);
		}
		if ((change / 1000 == 1)) {
			System.out.println((int) (change / 1000) + " ten dollar bill, ");
			change = change - 1000 * (int) (change / 1000);
		} else if ((change / 1000 > 1)) {
			System.out.println((int) (change / 1000) + " ten dollar bills, ");
			change = change - 1000 * (int) (change / 1000);
		}
		if ((change / 500 == 1)) {
			System.out.println((int) (change / 500) + " five dollar bill, ");
			change = change - 500 * (int) (change / 500);
		} else if ((change / 500 > 1)) {
			System.out.println((int) (change / 500) + " five dollar bills, ");
			change = change - 500 * (int) (change / 500);
		}
		if ((change / 100 == 1)) {
			System.out.println((int) (change / 100) + " one dollar bill,");
			change = change - 100 * (int) (change / 100);
		} else if ((change / 100 > 1)) {
			System.out.println((int) (change / 100) + " one dollar bills,");
			change = change - 100 * (int) (change / 100);
		}
		if ((change / 25 == 1)) {
			System.out.println((int) (change / (25)) + " quarter, ");
			change = change - 25 * (int) (change / 25);
		} else if ((change / 25 > 1)) {
			System.out.println((int) (change / (25)) + " quarters, ");
			change = change - 25 * (int) (change / 25);
		}
		if ((change / 10 == 1)) {
			System.out.println((int) (change / (10)) + " dime, ");
			change = change - 10 * (int) (change / (10));
		} else if ((change / 10 > 1)) {
			System.out.println((int) (change / (10)) + " dimes, ");
			change = change - 10 * (int) (change / (10));
		}
		if ((change / 5 == 1)) {
			System.out.println((int) (change / (5)) + " nickel, ");
			change = change - 5 * (int) (change / (5));
		} else if ((change / 5 > 1)) {
			System.out.println((int) (change / (5)) + " nickels, ");
			change = change - 5 * (int) (change / (5));
		}
		if ((change / 1 == 1)) {
			System.out.println((int) (change / (1)) + " penny. ");
			change = change - 1 * (int) (change / (1));
		} else if ((change / 1 > 1)) {
			System.out.println((int) (change / (1)) + " pennies. ");
			change = change - 1 * (int) (change / (1));
		}
		if (price == tendered) {
			System.out.println("Perfect change! Thanks and have a great day!");
		} else if (price > tendered) {
			System.out.println("This is not enough to cover your purchase!");
			changeRemaining();
		}
	}
}
