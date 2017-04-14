package java0410;

import java0410.Account;
import java0410.Valuable;

public class SavingAccount extends Account implements Valuable
{
	private double interest,allDate;  //alldate:계좌를 만들고 얼마나 지났는지
	private boolean contractState=false; //12달이 지났는지 안지났는지 판단, 처음만들어젺을땐 12달이 안지나서 false
	public SavingAccount(double inputBalance,double inputInterest)
	{
		super(inputBalance);
		interest=inputInterest;
		allDate = 0;
	}
	public void debit(double amount) throws Exception
	{
		if (contractState) //이 자체로 true인지 false인지 의미
			setBalance(getBalance()-amount);
		else if(amount<0)
			throw new Exception();
		else
		{
			throw new Exception("아직 출금할 수 없습니다.");
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
			setBalance(getBalance()*Math.pow(1+interest, 12));  //추가이자가 없으므로 12			
		}
				
	}
	public double EstimateValue(int month){
		return getBalance()*Math.pow(1+interest,month);
	}
	public String toString(){
		return String.format("SavingAccount_Balance:%.2f",getBalance());
	}
	
}
