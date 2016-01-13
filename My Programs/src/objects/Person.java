package objects;

import java.util.ArrayList;

public class Person {
	private String firstName;
	private String middleName;
	private String lastName;
	boolean male;
	public static int MAX_ALLOWED_BOOKS = 3;
	ArrayList<Book> checkedOutBooks = new ArrayList<Book>();
	Balance balance;

	public Person(String fN, String lastName){
		this.firstName = fN;
		middleName = "";
		this.lastName = lastName;
		male = true;
		balance = new Balance();
	}

	public Balance getBalance() {
		return balance;
	}

	public void setBalance(Balance balance) {
		this.balance = balance;
	}

	public Person(String firstName, String middleName, String lastName){
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		male = true;
		balance = new Balance();
	}
	
	public String toString(){
		return firstName + " "+middleName + " "+lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public ArrayList<Book> getCheckedOutBooks() {
		return checkedOutBooks;
	}
	
	public boolean isMale() {
		return male;
	}
	
	public void checkOutBook(Book b){
		b.setCheckedOut(true);
		b.setCheckOutDate(System.currentTimeMillis());
		b.setDueDate(System.currentTimeMillis()+30000);
		this.checkedOutBooks.add(b);
		
	}
	
	
	public void returnBook(Book b){
		b.setCheckedOut(false);
		b.updateConditions(System.currentTimeMillis());
		balance.subtractLateFees(System.currentTimeMillis()-b.dueDate);
		b.setCheckOutDate(0);
		b.setDueDate(0);
		this.checkedOutBooks.remove(b);
	}
	
	public void renewBook(Book b){
		b.setDueDate(System.currentTimeMillis()+30000);
	}
	
	public String getGenderPosessivePronoun(){
		return null;
	}
	
	public String getLibraryDescription(){
		return null;
		
	}
}