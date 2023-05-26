package Prog9;
import java.util.*;

public class process2 extends Thread{
	public static String digits[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
	public String number;
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number greater than 4 digits");
		number=sc.nextLine();
		char b[]=number.toCharArray();
		if(b.length<4)
		{
			System.out.println("Enter 4 or more digits");
			System.exit(0);
		}
		for(char ch: number.toCharArray())
		{
			int i=(int)ch-48;
		System.out.println("  "+digits[i]);
		}		
  }
}
