package mavenPackage1;

public class ThrowKeyword 
{
	public static void validAge(int age) throws InvalidException
	{
		if(age<18)
		{	
			throw new InvalidException("Invalid age"); //We are not handling the exception here, so no more statements will be executed

		}
	}	
	public static void main(String[] args) 
	{
		int age=15;
		try
		{
		validAge(age);
		}
		catch(InvalidException i)
		{
			System.out.println("Exception handled "+i);
		}
	}

}
