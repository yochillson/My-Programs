package objects;

import java.awt.Color;



public class Book{



	String title;
	
	Person author;
	
	int numberOfPages;
	
	int thickness;
	
	int height;
	
	Color color;
	
	private boolean checkedOut;
	
	private long checkOutDate;
	
	long dueDate;
	
	String description;
	
	int accumulatedUse;





	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}

	public static int DEFAULT_HEIGHT = 300;


	public Book(String title, Person author, int pages){

	    this.title=title;
	
	    this.author=author;
	
	    this.numberOfPages=pages;
	
	    thickness = numberOfPages/10;
	    color = Color.GRAY;//default color
	
	    height = DEFAULT_HEIGHT+(int)(Math.random()*100);//this may as well be arbirary
	    
	    checkedOut = false;
	    
		setCheckOutDate(0);
		
		dueDate = 0;
		
		description = conditions[0];
		
		accumulatedUse = 0;
	
	}



	public int getAccumulatedUse() {
		return accumulatedUse;
	}



	public void setAccumulatedUse(int accumulatedUse) {
		this.accumulatedUse = accumulatedUse;
	}



	public String getTitle() {
	
	    return title;
	
	}
	
	
	
	public Person getAuthor() {
	
	    return author;
	
	}
	
	
	
	public int getNumberOfPages() {
	
	    return numberOfPages;
	
	}
	
	public int getHeight() {
	
	    return height;
	
	}
	
	
	
	public void setHeight(int height) {
	
	    this.height = height;
	
	}
	
	
	
	public int getThickness() {
	
	    return thickness;
	
	}
	
	
	
	/**
	
	* returns the description of the book in the format: "title", by author, (numberOfPages pages)
	
	*/
	
	@Override
	
	public String toString(){
	
	    return "\""+title+"\", by "+author+", ("+numberOfPages+" pages)";
	
	}
	
	
	
	
	
	
	
	public void setColor(Color color){
	
	    this.color=color;
	
	}
	
	
	
	public Color getColor() {
	
	    return color;
	
	}
	
	public long getCheckOutDate() {
		return checkOutDate;
	}
	
	public long getDueDate() {
		return dueDate;
	}
	
	
	public void setCheckedOut(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}
	
	
	
	public void setDueDate(long dueDate) {
		this.dueDate = dueDate;
	}
	
	
	
	public boolean isCheckedOut() {
		return checkedOut;
	}
	
	public long getSecondsRemaining(){
		long t = (int)((dueDate - System.currentTimeMillis())/1000);
		return t;
	}
	
	
	
	public void setCheckOutDate(long checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	
	static public String conditions[] = {"This book is brand new!", "This book is gently used.", "This book is worn out.", "This book is falling apart!"};
	
	public void updateConditions(long timeOfReturn){
		accumulatedUse = (int) (timeOfReturn - getCheckOutDate());
		
		if(accumulatedUse > 30){
			if(accumulatedUse/30 == 0){
				description = conditions[1];
			}
			if(accumulatedUse/30 == 2){
				description = conditions[2];
			}
			else{
				description = conditions[3];
			}
		}
	}
	

}