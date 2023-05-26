package prog1;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;
import java.util.Scanner; //don't forget

public class DBcallers {
	private static HashMap<Long,String> phBook=new HashMap<>(); //priv static
	private static LinkedList<MissedCallDetails> miss=new LinkedList<>();
	static Scanner sc=new Scanner(System.in); //don't forget
	static
	{
		phBook.put(6363732925L, "Rita"); //put(key, value): Inserts a new key-value pair into the HashMap or updates the value if the key already exists
		phBook.put(6365678925L, "Nita");
		phBook.put(6765732925L, "Sita");
		phBook.put(66788942125L, "Gita");
	}
	
	public static void AddContact()
	{
		System.out.println("Enter phno");
		long phno=sc.nextLong();
		System.out.println("Enter name");
		String name=sc.nextLine();
		name+=sc.nextLine();
		if(phBook.put(phno, name)!=null)
		{
			System.out.println("updating name");
		}
		else
		{
			System.out.println("added contact");
		}
	}
	
  
	public static void DisplayContact()
	{
		System.out.println("---------PhoneBook--------");
		System.out.printf("|%-15s| %-12s|%n","Name","Phone");
		for(Map.Entry<Long,String> i:phBook.entrySet())
		{
			System.out.printf("|%-15s| %-12s|%n",i.getValue(),i.getKey());
		}
	}
	
	public static void deleteContact()
	{
		System.out.println("Enter phno");
		long phno=sc.nextLong();
		if(phBook.remove(phno)==null)  //remove(key): Removes the key-value pair associated with the specified key from the HashMap.
		{
			System.out.println("doesnt exist");
		}
		else
		{
			System.out.println("Removed");
		}
	}

	public static void AddMissedCalls()
	{
		System.out.println("Enter phone no to add");
		long phno=sc.nextLong();
		Calendar cal=Calendar.getInstance();
		miss.addFirst(new MissedCallDetails(cal,phno));
	}

	public static void displayMissed()
	{
		for(MissedCallDetails i:miss)
		{
			String name=phBook.get(i.phno); //get(key): Retrieves the value associated with a specified key in the HashMap
			if(name==null)
			{
				name="Private Caller";
			}
			System.out.println("\nName: "+name+"\nPhone: "+i.phno+"\nTime: "+i.cal.getTime());
		}
	}
}
		
