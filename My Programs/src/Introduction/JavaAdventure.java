package Introduction;

import java.util.Scanner;

public class JavaAdventure {
	
	static Scanner input = new Scanner(System.in); 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld.print("What would you like to do?");
		HelloWorld.print("You may type in the following command:\n" + 
				"\"G\" - go sleep\n" +
				"\"S\" - go outside");
		String answer = waitForInput();
		
		if(answer.equals("G"))
		{
			HelloWorld.print("cool");
		} else if (answer.equals("S")){
			HelloWorld.print("awesome");
			goOutside();
		} else return;
			

	}
	
	public static String waitForInput(){
		String entry = input.nextLine();
		return entry;
	}
	
	public static void goOutside(){
		HelloWorld.print("It is beautiful outside. Where would you like to go");
	}
	
	public static void goSleep(){
		
	}
	
	

}
