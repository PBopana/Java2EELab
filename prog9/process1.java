package Prog9;
import java.util.*;

public class process1 extends Thread {
	public String word;
	public static String vowel="aeiou";
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter word");
		word=sc.nextLine();
		for(char c1:vowel.toCharArray())
		{
			for(char c2: word.toCharArray())
			{
				if(c1==c2)
				{
					count++;
				}
			}
		}
		System.out.println("No of vowels is ="+count);	
	}
}
