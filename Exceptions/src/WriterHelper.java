import java.util.ArrayList;
import java.util.List;
public class WriterHelper
{
	public void writeList()
	{
		try
		{
			List<Integer>list = new ArrayList<>(10);
			list.add(10);
			System.out.println("Entering" + " try statement");
			Integer a = list.get(0);
			System.out.println("Accessing the first element : " + a);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("caught IndexOutOfBoundsException : " + e.getMessage());
		}
		finally
		{
			System.out.println("This will be ruled");
		}
	}
}
