package java0313;
public class account
{
	double acc;
 	public account(double account1) //��������� ���ÿ� ������ �������
	{
		acc=account1;
	}
	public void credit(double account2) 
	{
		acc=acc+account2;
	}
	public void debit(double account2)
	{
		if(account2>acc) System.out.println("Debit amount exceeded account balance.");
		else acc=acc-account2;
	}
	public double balance()
	{
		return acc;
	}
}
