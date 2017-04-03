package java0403;

public abstract class Account implements Valuable 
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
	
	public void debit(double money) 
	{
		if(balance>=money)
			balance=balance-money;
		else 
		{
			System.out.println("Debit amount exceeded account balance.");
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
	
	public double EstimateValue(int month){
		return month;
	}
	
}
