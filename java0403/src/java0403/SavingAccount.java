package java0403;

import java0403.Account;

public class SavingAccount extends Account implements Valuable
{
	private double interest,allDate;  //alldate:���¸� ����� �󸶳� ��������
	private boolean contractState=false; //12���� �������� ���������� �Ǵ�, ó���������� 12���� �������� false
	public SavingAccount(double inputBalance,double inputInterest)
	{
		super(inputBalance);
		interest=inputInterest;
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
		if (allDate >= 12 && !contractState)
		{
			contractState=true;
			setBalance(getBalance()*Math.pow(1+interest, 12));  //�߰����ڰ� �����Ƿ� 12			
		}
				
	}
	public double EstimateValue(int month){
		return getBalance()*Math.pow(1+interest,month);
	}
	public String toString(){
		return String.format("SavingAccount_Balance:%.2f",getBalance());
	}
	
}