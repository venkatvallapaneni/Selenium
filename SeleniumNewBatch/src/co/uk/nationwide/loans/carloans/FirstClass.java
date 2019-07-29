package co.uk.nationwide.loans.carloans;

public class FirstClass {
	
	int a=10,b=20,c;
	
	void add()
	{
		c=a+b;
		System.out.println("Addition of A & B is ;" + c);
		
		
	}
	
	void sub() 
	
	{
		c=a-b;
		System.out.println("Sub of A & B is: " + c);
		
	}
	
	

	public static void main(String[] args)
	{
		System.out.println("Hi......");
		
		FirstClass obj=new FirstClass();
		
		obj.add();
		obj.sub();

	}

}
