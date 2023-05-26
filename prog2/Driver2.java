package prog2;
import java.util.Collections;

import java.util.LinkedList;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver2 {
	private static ArrayList<Book> ar=new ArrayList<Book>();
	static Scanner sc=new Scanner(System.in);
	static
	{
	 Book ob1 = new Book("t1", "a1", "p1", 780);
    Book ob2 = new Book("t2", "a2", "p2", 500);
    Book ob3 = new Book("Oops with java", "a3", "p3", 800);
    Book ob4 = new Book("t4", "a4", "p4", 300);
    Book ob5 = new Book("Oops with c++", "a4", "p5", 200);
    
    ar.add(ob1);
    ar.add(ob2);
    ar.add(ob3);
    ar.add(ob4);
    ar.add(ob5);
}
public static void main(String[] args) {
    sortByPrice();
    createHashMap();
    detailsByAuthorName();
    printingBasedonPrice();
    searchByPublisher();
    searchByTitle();
    searchByTitleandReplacePublisher();
}
//use sc.next() if nextLine() skips an input for all
private static void searchByTitleandReplacePublisher()
{
	System.out.println("Enter title");
	String tname=sc.next();
	for(Book ob: ar)
	{
		if(tname.equals(ob.title))
		{
			System.out.println(ob);
			System.out.println("\nEnter publisher name");
			ob.publisher=sc.next();
			System.out.println(ob);
		}
	}
}

private static void searchByTitle()
{
	System.out.println("Enter area of interest");
	String y=sc.next();
	int flag=0;
	for(Book ob: ar)
	{
		if(ob.title.contains(y))
		{
			flag=1;
			System.out.println(ob);
		}
	}
	if(flag==0)
	{
		System.out.println("not found");
	}
}
private static void searchByPublisher() {
    System.out.println("\n\n--------------Search publisher-------");
    System.out.println("Enter Book publisher name: ");
    String pname = sc.next();
    for (Book ob : ar) 
        if (pname.equals(ob.publisher)) 
            System.out.println(ob);
}
private static void printingBasedonPrice() {
    System.out.println("\n\n--------------Create new list <price more then user specified price>-------");
    LinkedList<Book> temp = new LinkedList<Book>();
    System.out.println("Enter Book price: ");
    double rate = sc.nextDouble();
    for (Book ob : ar) {
        if (ob.price > rate) {
            temp.add(ob);
            System.out.println(ob);

        }
    }
}
private static void detailsByAuthorName() {
    System.out.println("\n\n====================Getting details by Aurthor name=============");
    System.out.println("Enter author name: ");
    String name = sc.nextLine();
    for (Book ob : ar) 
    {
        if (name.equals(ob.author)) 
            System.out.println(ob);
    }
}

private static void createHashMap()
{
	HashMap<Integer,Book> hm=new HashMap<Integer,Book>();
	Integer id=101;
	for (Book b : ar)
	{
		hm.put(id, b);
		id++;
	}
	System.out.println("Created HashMap");
	for(Integer keyid: hm.keySet())
	{
		System.out.println("BId: "+keyid);
		System.out.println("Book: "+hm.get(keyid));
	}
}

private static void sortByPrice()
{
	System.out.println("Books");
	for (Book ob : ar)
	{
		System.out.println();
		System.out.println(ob);
	}
	System.out.println("sorted");
	Collections.sort(ar,new BookComparer());
	 System.out.println("\n\n================Book list after sort=============");
     for (Book ob : ar) {
         System.out.println();
         System.out.println(ob);
     }
}

}
