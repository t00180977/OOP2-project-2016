//Book.java
/**/

public class Book {
	//attributes
	
	private String title, ISBN;
	private double price;
	private int pages;
	
	public Book() {
		setTitle("unknown");
		setISBN("unknown");
		setPrice(0.0);
		setPages(0);
	}
	
	//mutator methods
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setISBN(String ISBN){
		this.ISBN = ISBN;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public void setPages(int pages){
		this.pages = pages;
	}
	
	//accessor methods
	public String getTitle(){
		return this.title;
	}
	
	public String getISBN(){
		return this.ISBN;
	}
	
	public double getPrice(){
		return this.price;
	}
	
	public int getPages(){
		return this.pages;
	}
	
	public String toString()
	{
		return "Title: " + getTitle() + "\nISBN: " + getISBN() + "\nPrice: " + 
			getPrice() + "\nPages: " + getPages();
	}
}