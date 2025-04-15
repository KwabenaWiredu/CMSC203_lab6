package p4;

public class SavingsAccount extends BankAccount {
	private double rate=0.025;;
	private int savingsNumber=0;
	private String accountNumber;
	
	/**
	 * this constructor initializes owner, initial amount and initializes the account umber
	 * @param name
	 * @param amount
	 */
	public SavingsAccount(String name,double amount) {
		super(name,amount);
		this.accountNumber=super.getAccountNumber()+"-"+this.savingsNumber;
		
		super.setAccountNumber(accountNumber);
		
		
	}
	/**
	 * this constructor creates a new SavingsAccount from an existing one.
	 * @param savings
	 * @param amount
	 */
	public SavingsAccount(SavingsAccount savings, double amount) {
		super(savings, amount);
		this.savingsNumber+=1;
		this.accountNumber=super.getAccountNumber();
		super.setAccountNumber(accountNumber);
		
		
		
	}
	/**
	 * this method calculates the interest and deposits it in the account
	 */
	public void postInterest() {
		double interest=super.getBalance()*(rate/12);
		super.deposit(interest);
	}
	
	@Override
	/**
	 * this method returns the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}
	
}
