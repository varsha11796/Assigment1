//Using if…….else if….  Else,  display whether result is  fail, pass, second class , first class, Distinction etc.  
public class PassFail
{
	public static void main(String []args)
	{
		int result =-3 ; //result = 28,35,45,60,65,75,89
		if(result<0)
		System.out.println("Enter Valid Entry");
		
		else
		{
			if(result>=35)
			{
			System.out.println("Pass with");

			if(result<60)
			System.out.println("Second Class");

			else if(result<75)
			System.out.println("First Class");

			else if(result>=75&&result<=100)
			System.out.println("Distinction");
			}
			else
			System.out.println("Fail");
		}
		
	}	
}