package mavenPackage1;

public class ExceptionDemo {

	public static void main(String[] args) 
	{
		try
		{
			System.out.println(20/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by Zero is not possible");
		}
	
	}

}
