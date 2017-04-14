package java0410;

public abstract class Account  
{ 
	
	private double balance;
	
	public Account(double initialBalance) 
	{
		balance=initialBalance; 
	} 
	
	public void credit(double money) 
	{
		balance=balance+money;
	} 
	
	public void debit(double amount) throws Exception
	{
		
		
		if ( balance >= amount )
		{
			balance -= amount;
			
		}
		else
		{	
			System.out.println("Debit amount exceeded account balance.");
			throw new Exception();
		}
		
	} 
	public double getBalance() 
	{
		return balance; 
	} 
	void setBalance(double newBalance)
	{
		balance=newBalance;
	}
	
	public abstract double getWithdrawableAccount();
	public abstract void passTime(int date);
	

	
	
}
