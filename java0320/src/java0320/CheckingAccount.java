package java0320;

public class CheckingAccount extends Account
{
	private double creditLimit;
	private double interest;
	private double loanInterest;
	public CheckingAccount(double balance, double limit, double interest, double loanInterest)  //������ �ȿ� �����ϴ� �����̰� ���� �������� class�� �����ϴ� ����, balance�� account�� �ִ°Ŷ� �ٸ�
	{
		super(balance);  //�θ�Ŭ������ �����ڸ� ȣ��
		this.creditLimit=limit;
		this.interest=interest;  //this�� checkingaccount���� ������ �ǹ�
		this.loanInterest=loanInterest;
	}
	public void nextmonth()
	{
		if (getBalance()>=0)
		{
			setBalance(getBalance()*(1+interest));  //�Լ��� �Ķ���͸� ������ ()��� =�ƴϰ�
		}
		else
		{
			setBalance(getBalance()*(1+loanInterest));
		}
	}
	@Override //�θ�Ŭ������ �ִ� �Լ��� ������ �ϰڴ�
	public void debit(double money)
	{
		if (getBalance()-money>=-1*creditLimit)
		{
			setBalance(getBalance()-money);
		}
		else
		{
			System.out.println("����� �� �����ϴ�.");
	
		}
	}	
	

}
