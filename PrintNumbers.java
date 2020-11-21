//print number from 3 to 30 except 24.
public class PrintNumbers
{
	public static void main(String []args)
	{
		int i=2;
		while(i<30)
		{
			i++;
			if(i==24)
			continue;
			System.out.println(i);
			
		}
			
	}	
}