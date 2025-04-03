package samplePrograms;

public class Employee 
{
	
	int ID;
	String name;
	Address address;//aggregation
	
	public Employee(int iD, String name, Address address) 
	{
		super();
		ID = iD;
		this.name = name;
		this.address = address;
		System.out.println("Inside Employee Constructor");
	}
	public void display()
	{
		System.out.println("ID: "+ID+"\nName: "+name+"\nCity: "+address.city);
		
	}

	public static void main(String[] args) 
	{
		Address ad= new Address("Kochi","Kerala","India",123);
		Employee emp= new Employee(12,"Hanna",ad);
		emp.display();
	}

}
