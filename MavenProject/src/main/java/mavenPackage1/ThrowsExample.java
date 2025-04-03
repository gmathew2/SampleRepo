package mavenPackage1;

public class ThrowsExample 
{

	public static void division(int a, int b) throws ArithmeticException //to let the user know the possibility of an exception
	{
		int result =a/b;
		System.out.println("Result is: "+result);
	}
	public static void main(String[] args)
	{
		try
		{
			division(6,0);
		}
		catch(ArithmeticException a)
		{
			System.out.println("Division by zero not possible "+a);
		}
	}

}
