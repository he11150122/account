package java0410;

import java0410.Account;

public class CheckingAccount extends Account implements Valuable
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
	public void debit(double amount) throws Exception
	{
		if (getBalance()-amount<-1*creditLimit)
			throw new Exception("�����Դϴ�.");
		else if (amount<0)
		{
			throw new Exception("�����Է�!");
		}
		else
		{
			setBalance(getBalance()-amount);
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
		double realInterest; //������(����ݸ��� �׳ɱݸ���)
		if (getBalance()>=0)
		{
			realInterest=interest; //�ܾ��� 0�̻��̹Ƿ� �Ϲݱݸ�
		}
		else
		{
			realInterest=loanInterest; //����ݸ�
  		}
		setBalance(getBalance()*(1+realInterest*date)); //�ܾװ��� �ܸ����� 
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
	public double EstimateValue(int month){
		setBalance(getBalance()*(1+interest*month));
		return getBalance();
	}
	public String toString(){
		return String.format("CheckingAccount_Balance:%.2f",getBalance());
	}
	
}



