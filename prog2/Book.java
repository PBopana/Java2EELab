package prog2;

public class Book {
	String title;
	String publisher;
	String author;
	double price;
	Book(String title,String author, String publisher,double price)
	{
		this.title=title;
		this.publisher=publisher;
		this.author=author;
		this.price=price;
	}
	
	public String toString()
	{
		return "Book title: "+title+"\tBook publisher: "+publisher+"\tBook Author: "+author+"\tprice: "+price;
	}

}
