package Prog9;

public class Driver9 {
	public static void main(String args[]) throws Exception
	{
		process1 ob1=new process1();
		process2 ob2=new process2();
		
		ob1.start();
		Thread.sleep(7000);
		ob2.start();
	}

}
