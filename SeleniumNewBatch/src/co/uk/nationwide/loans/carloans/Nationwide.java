package co.uk.nationwide.loans.carloans;

public class Nationwide implements Rbi
{

	public static void main(String[] args) {
		Nationwide N=new Nationwide();
		N.deposit();
		N.withdrawl();

	}

	@Override
	public void withdrawl() {
		System.out.println("I am overriden withdrawl in Nationwide");
	}

	@Override
	public void deposit() {
		System.out.println("I am overriden deposit in Nationwide");
		
	}

}
