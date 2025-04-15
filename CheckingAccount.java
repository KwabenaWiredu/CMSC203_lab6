package p4;

public class CheckingAccount extends BankAccount {
	private static final double FEE=0.15;
	
	/**
	 * this constructor initializes the owner, the starting balance and adds -10 to the accountNumber
	 * @param name
	 * @param amount
	 */
	public CheckingAccount(String name,double amount) {
		super(name,amount);
		super.setAccountNumber(super.getAccountNumber()+"-10");
	}
	
	@Override
	/**
	 * This method overrides the withdraw method
	 * @param amount
	 */
	public boolean withdraw(double amount) {
		
		amount+=FEE;
		if(super.withdraw(amount)) {
		return true;
	}
		else
			return false;
	
}
}