
public class Exam 
{
	String empName;
	static String name="Hanna";
	static int roll_no=125;
	public static void display()
	{
		System.out.println("Name: "+name+"\tRoll No: "+roll_no);
	}
	public void print(float v)
	{
		System.out.println("The floating point value is "+v);
	}
	Exam(String empName)
	{
		this.empName=empName;
		System.out.println("The employee name is "+this.empName);
	}
	public static void main(String[] args) 
	{
		Exam e = new Exam("Muse");
		e.print(5.1f);
		display();
	}
		
		

	}

