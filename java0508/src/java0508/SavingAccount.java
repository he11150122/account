package java0508;

public class SavingAccount extends Account implements Valuable
{
	private double interest,allDate;  
	private boolean contractState=false; 
	public SavingAccount(double inputBalance,double inputInterest)
	{
		super(inputBalance);
		interest=inputInterest;
		allDate = 0;
	}
	public void debit(double amount) throws Exception
	{
		if (contractState) 
			setBalance(getBalance()-amount);
		else if(amount<0)
			throw new Exception("음수입력!");
		else
			throw new Exception("아직 출금할 수 없습니다.");
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
			setBalance(getBalance()*Math.pow(1+interest, 12));  			
		}
				
	}
	public void passTime()
	{
		allDate=allDate+1;
		if (allDate >= 12 && !contractState)
		{
			contractState=true;
			setBalance(getBalance()*Math.pow(1+interest, 12));  			
		}
	}
	public double EstimateValue(int month){
		return getBalance()*Math.pow(1+interest,month);
	}
	public double EstimateValue(){
		return getBalance()*Math.pow(1+interest,1);
	}
	public String toString(){
		return String.format("SavingAccount_Balance:%.2f",getBalance());
	}
	
}
