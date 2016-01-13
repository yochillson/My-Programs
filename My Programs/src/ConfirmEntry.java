import java.util.Scanner;

public class ConfirmEntry {

	static Scanner input = new Scanner(System.in);
	static String name;
	static String color;
	static String confirmColor;
	static String book;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		askName();
		askColor();

	}

	public static void askName() {
		print("What is your name?");
		name = waitForResponse();

	}

	public static String waitForResponse() {
		String entry = input.nextLine();
		return entry;
	}

	public static void print(String string) {

		System.out.println(string);
	}

	public static void askColor() {
		print("Hi " + name + ", what is your favorite color?");
		color = waitForResponse();
		print("Oh so your favorite color is " + color
				+ ", is that correct? (Type Y for yes and N for no)");

		boolean confirmed = doubleCheck();
		if (confirmed)
			askBook();
		else
			askColor();

	}

	public static String waitForConfirmation() {
		String entry = input.nextLine();
		return entry;

	}

	public static void askBook() {
		print("So what is your favorite book?");
		book = waitForResponse();
		print("Oh so your favorite book is " + book
				+ ", is that correct? (Type Y for yes and N for no)");

		boolean confirmed = doubleCheck();
		if (confirmed)
			print("That is awesome! I also like " + book + "!");
		else
			askBook();

	}

	public static boolean doubleCheck() {
		confirmColor = waitForConfirmation();
		while (true) {
			if (confirmColor.equals("Y") || confirmColor.equals("y")) {
				return true;
			} else if (confirmColor.equals("N") || confirmColor.equals("n")) {
				return false;
			} else {
				print("That is not a valid entry. Please try again.");
			}
		}

	}

}
