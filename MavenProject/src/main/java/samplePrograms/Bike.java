package samplePrograms;

public class Bike extends Vehicle 
{
	String color;
	
	Bike()
	{
	
		System.out.println("Inside Bike class constructor");
		super.display();
	}
	public void display()
	{
		System.out.println("Inside Bike Class Display Method");
		System.out.println(super.type);
	}

	public static void main(String[] args) 
	{
		//Vehicle v = new Vehicle();
		//v.display();
		Bike b = new Bike();
		b.display();
	}

}
