package co.uk.nationwide.loans.carloans;

public class Icici implements Rbi
{

	public static void main(String[] args) 
	{
	
		Icici I=new Icici();
				I.deposit();
		        I.withdrawl();

	}

	@Override
	public void withdrawl() {
		System.out.println("I am overriden deposit in Icici ");
		
	}

	@Override
	public void deposit() {
		System.out.println("I am overriden withdrawl in Icici");
		
	}

}
