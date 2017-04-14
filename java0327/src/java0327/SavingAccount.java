
package java0327;

public class SavingAccount extends Account
{
	private double interest,allDate;  //alldate:계좌를 만들고 얼마나 지났는지
	private boolean contractState=false; //12달이 지났는지 안지났는지 판단, 처음만들어젺을땐 12달이 안지나서 false
	public SavingAccount(double inputBalance,double inputInterest)
	{
		super(inputBalance);
		this.interest=inputInterest;
		allDate = 0;
	}
	public void debit(double money)
	{
		if (contractState) //이 자체로 true인지 false인지 의미
		{
			setBalance(getBalance()-money);						
		}
		else
		{
			System.out.println("아직 출금할 수 없습니다.");
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
			setBalance(getBalance()*Math.pow(1+interest, 12));  //추가이자가 없으므로 12			
			contractState=true;
		}
				
	}
}
