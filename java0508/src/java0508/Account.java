package java0508;

import java.util.ArrayList;

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
	public abstract void passTime();

	public static double sumForAccount(ArrayList<? extends Account> list){
		double sum=0;
		for (Account account: list){
			sum+=account.getBalance();
		}
		return sum;
	}public static void passTimeList(ArrayList<? extends Account> list,int month){
		for (Account account: list){
			account.passTime(month);
	}

	}
	
	
}

