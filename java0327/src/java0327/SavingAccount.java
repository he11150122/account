
package java0327;

public class SavingAccount extends Account
{
	private double interest,allDate;  //alldate:���¸� ����� �󸶳� ��������
	private boolean contractState=false; //12���� �������� ���������� �Ǵ�, ó���������� 12���� �������� false
	public SavingAccount(double inputBalance,double inputInterest)
	{
		super(inputBalance);
		this.interest=inputInterest;
		allDate = 0;
	}
	public void debit(double money)
	{
		if (contractState) //�� ��ü�� true���� false���� �ǹ�
		{
			setBalance(getBalance()-money);						
		}
		else
		{
			System.out.println("���� ����� �� �����ϴ�.");
		}
	}
	public double getWithdrawableAccount()
	{
		if(contractState)
		{
			return getBalance();
		}
		else
		{
			return 0;
		}
	}
	public void passTime(int date)
	{
		allDate=allDate+date;
		if (allDate >= 12 && (contractState==false))
		{
			setBalance(getBalance()*Math.pow(1+interest, 12));  //�߰����ڰ� �����Ƿ� 12			
			contractState=true;
		}
				
	}
}
