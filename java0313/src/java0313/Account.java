package java0313;
public class Account
{
	double balance;
 	public Account(double getBalance) //��������� ���ÿ� ������ �������
	{
		balance=getBalance;
	}
	public void credit(double m) 
	{
		balance=balance+m;
	}
	public void debit(double m)
	{
		if(m>balance) System.out.println("Debit amount exceeded account balance.");
		else balance=balance-m;
	}
	public double balance()
	{
		return balance;
	}
}
