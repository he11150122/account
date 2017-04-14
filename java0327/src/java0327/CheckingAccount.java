package java0327;

public class CheckingAccount extends Account
{
	private double creditLimit;
	private double interest;
	private double loanInterest;
	public CheckingAccount(double balance, double limit, double interest, double loanInterest)  //������ �ȿ� �����ϴ� �����̰� ���� �������� class�� �����ϴ� ����, balance�� account�� �ִ°Ŷ� �ٸ�
	{
		super(balance);  //�θ�Ŭ������ �����ڸ� ȣ��
		this.creditLimit=limit;
		this.interest=interest;  //this�� checkingaccount���� ������ �ǹ� �׳ɱݸ�
		this.loanInterest=loanInterest;  //����ݸ�
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
			System.out.println("�����Դϴ�.");
	
		}
	}	
	
	public double getWithdrawableAccount()
	{
		if(getBalance()>=-1*creditLimit) // creditlimit�� ��� �ѵ��� -
		{
			return getBalance()+creditLimit;
		}
		else
		{
			return 0;
		}
	}
	public void passTime(int date)
	{
	 //������(����ݸ��� �׳ɱݸ���)
		if (getBalance()>=0)
		{
			setBalance(getBalance()*(1+interest*date)); //�ܾ��� 0�̻��̹Ƿ� �Ϲݱݸ�
		}
		else
		{
			setBalance(getBalance()*(1+loanInterest*date));
  		}
		 //�ܾװ��� �ܸ����� 
	}
	public boolean isBankrupted()
	{
		if (getBalance()>=-1*creditLimit)
		{
			return false;
		}
		else 
		{
			return true;
		}
	}
}
