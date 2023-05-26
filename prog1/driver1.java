package prog1;

public class driver1 {
	
	public static void main(String[] args) {
		while(true)
		{
			System.out.println("----------Menu----------");
			System.out.println("1.New Contact\n2.New missed Call\n3.Display phBook\n4.Dsiplay missed call\n5.Del contact\n6.EXIT\nEnter your choice:");
			int i=DBcallers.sc.nextInt();
			switch (i) {
			case 1:DBcallers.AddContact();
				break;
			case 2:DBcallers.AddMissedCalls();
				break;
			case 3:DBcallers.DisplayContact();
				break;
			case 4:DBcallers.displayMissed();
				break;
			case 5:DBcallers.deleteContact();
				break;
			case 6:System.exit(0);
			default:System.out.println("Invalid choice");
				break;
			}
		}
	}
}
