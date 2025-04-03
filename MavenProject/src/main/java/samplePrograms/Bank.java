package samplePrograms;

public class Bank {

	private int pin;
	public Bank()
	{
		
	}
	public void getPin()
	{
		System.out.println(this.pin);
	}
	public static void main(String[] args) {
	
		Bank b= new Bank();
		b.setPin(5678);
		b.getPin();
		

	}
	public void setPin(int pin) {
		this.pin = pin;
		System.out.println("inside setPin");
		
	}

}
