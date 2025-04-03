package samplePrograms;

public class ChildInterface implements InterfaceSample, Interface2 {

	
	public static void main(String[] args) 
	{
		//InterfaceSample insamp = new ChildInterface();
		Interface2 samp = new ChildInterface();
		samp.display();
	}

	@Override
	public void display() {
		System.out.println("inside child display method");
		
	}

}
