package Introduction;

import java.util.Scanner;

public class HelloWorld {
	
	static int numberOfMessages = 0;
	static Scanner input = new Scanner(System.in); 
	static String userName;
	static boolean running;  
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		/**
//		 * comments
//		 */
//		print("Hello World");
//		print("1/2");
//		
//		String message = "This is a message assigned to a variable ";
//		print(message);
//		
//		int number1 = 1;
//		int number2 = 2;
//		print(number1);
//		print(number2);
//		
//		print("The numbers are" + number1 + " and " + number2 + ". Their sum is " + (number1 + number2));
//		
//		int i;
//		for (i = 0; i <= 60; i++)
//		{
//			print("stuff" + i);
//		}
		
		/**
		print("What is your name?");
		Scanner in = new Scanner(System.in);
		String s;
		s = in.nextLine();
		print("Your name is " + s);
		in.close();
		*/
		
		promptName();
//		print("What is your favorite animal?");
//		String favoriteAnimal = waitForInput();
//		print("Woah that is awesome " + userName + ". I also love " + favoriteAnimal + "." );
		endlessConversation();

}
	
	public static void endlessConversation(){
		running = true; 
		while(running){
			print("What school do you go to?");
			String school = waitForInputProvideChoices(); 
			if (school.equals("S")){
				endlessConversation();
				running = false;
			}else if (school.equals("Q"))
			{
				running = false;
			}
		}
	}
	
	public static String waitForInputProvideChoices(){
		print("You may type in the following command:\n" + 
				"\"Q\" - to quit\n" +
				"\"S\" - to start over\n");  
		String entry = input.nextLine();
		return entry;
		
	
	}
	
	public static void talkAboutBread(){
		print("I like bread");
	
	}
	
	public static void print(String string){
		numberOfMessages++;
		
//		if (numberOfMessages == 1){
//			System.out.println(numberOfMessages + "st message: " + string);
//		} else
//		
//			if (numberOfMessages == 2){
//				System.out.println(numberOfMessages + "nd message: " + string);
//			} else	
//			
//				if (numberOfMessages == 3){
//					System.out.println(numberOfMessages + "rd message: " + string);
//				} else
//		
		System.out.println(numberOfMessages + "th message: " + string);
	}
	
	public static void print(int n){
		System.out.println(n);
	}
	
	public static String waitForInput(){
		String entry = input.nextLine();
		return entry;
	}
	
	public static void promptName(){
		print("Please enter your name.");
		userName = waitForInput();
		print("OKay I will call you " + userName);
	}
	
	
	

}
