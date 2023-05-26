package prog2;
import java.util.Comparator;

public class BookComparer implements Comparator<Book> { 
	public int compare(Book ob1, Book ob2)
	{
		if(ob1.price> ob2.price)
			return 1;
		else if(ob1.price==ob2.price)
			return 0;
		else
			return -1;
	}

}
