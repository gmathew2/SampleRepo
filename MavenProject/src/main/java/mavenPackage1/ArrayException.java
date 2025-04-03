package mavenPackage1;

public class ArrayException {

	public static void main(String[] args) 
	{
		int ar[]= {1,2,3};
		
		try
		{
			//int b=5/0;
			System.out.println(ar[5]);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Array index out of bound "+a);
		}
		catch(Exception e)
		{
			System.out.println("Inside second catch block "+e);
		}
		finally
		{
			System.out.println("Inside Finally block");
		}

	}

}

