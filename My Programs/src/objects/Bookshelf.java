package objects;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JFrame;

public class Bookshelf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person author1 = new Person("Noah", "Webster");
		Person author2 = new Person("Anthony", "Burgess");
		Person author3 = new Person("Philip", "K", "Dick");
		Book book1 = new Book ("Dictionary", author1, 476);
		Book book2 = new Book("A Clockwork Orange", author2, 1002);
		Book book3 = new Book("Do Androids Dream of Electric Sheeps",author3, 956);
		

		ArrayList<Book> books = new ArrayList<Book>();

		books.add(book1);
		books.add(book2);
		books.add(book3);
		
		
		ArrayList libraryCardHolders = new ArrayList<Person>();
		libraryCardHolders.add(new Person("John", "Smith"));
		libraryCardHolders.add(new Person("James", "Harrison"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Library lib = new Library(books, libraryCardHolders);
		
		lib.setSize(new Dimension(500,500));

		lib.setVisible(true);

		lib.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
		
		public static void sortByAuthor(final boolean ascending, ArrayList<Book> list){
		
			Collections.sort(list, new Comparator<Book>() {
			    public int compare(Book a, Book b) {

			       String aLast = a.getAuthor().getLastName();
			       String bLast = b.getAuthor().getLastName();
			       return aLast.compareTo(bLast);
			    }

			}
			);
			
			
}
		public static void sortByPageNumber(boolean ascending, ArrayList<Book> list){
			Collections.sort(list, new Comparator<Book>() {
			    public int compare(Book a, Book b) {

			       int aLast = a.getNumberOfPages();
			       int bLast = b.getNumberOfPages();
			       return (aLast - bLast);
			    }

			}
			);
		}
		
		public static void sortByHeight(boolean ascending, ArrayList<Book> list){
			Collections.sort(list, new Comparator<Book>() {
			    public int compare(Book a, Book b) {

			       int aLast = a.getHeight();
			       int bLast = b.getHeight();
			       return (aLast - bLast);
			    }

			}
			);
		}
		
		public static void sortByTitle(boolean ascending, ArrayList<Book> list){
			Collections.sort(list, new Comparator<Book>() {
			    public int compare(Book a, Book b) {

			       String aLast = a.getTitle();
			       String bLast = b.getTitle();
			       return aLast.compareTo(bLast);
			    }

			}
			);
		}
}