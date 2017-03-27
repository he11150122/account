package java0320;

public class CheckingAccount extends Account
{
	private double creditLimit;
	private double interest;
	private double loanInterest;
	CheckingAccount(double balance, double limit, double interest, double loanInterest)
	{
		super(balance);
		creditLimit=-limit;
		this.interest=interest;
		this.loanInterest=loanInterest;
	}
	public void nextmonth()
	{
		if (balance>=0)
		{
			balance=balance*(interest);
		}
		else
		{
			balance=balance*(loanInterest);
		}
	}
	@Override
	public void debit(double money)
	{
		if (balance-money>=creditLimit)
		{
			balance=balance-money;
		}
		else
		{
			System.out.println("오류입니다.");
	
		}
	}	
	

}
