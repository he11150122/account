package java0508;

public class CheckingAccount extends Account implements Valuable
{
	private double creditLimit;
	private double interest;
	private double loanInterest;
	public CheckingAccount(double balance, double limit, double interest, double loanInterest)  //생성자 안에 존재하는 변수이고 위에 변수들은 class에 존재하는 변수, balance느 account에 있는거랑 다름
	{
		super(balance);  //부모클래스의 생성자를 호출
		this.creditLimit=limit;
		this.interest=interest;  //this는 checkingaccount안의 변수를 의미 그냥금리
		this.loanInterest=loanInterest;  //대출금리
	}
	public void nextmonth()
	{
		if (getBalance()>=0)
		{
			setBalance(getBalance()*(1+interest));  //함수는 파라미터르 받을때 ()사용 =아니고
		}
		else
		{
			setBalance(getBalance()*(1+loanInterest));
		}
	}
	@Override //부모클래스에 있는 함수를 재정의 하겠다
	public void debit(double amount) throws Exception
	{
		if (getBalance()-amount<-1*creditLimit)
			throw new Exception("오류입니다.");
		else if (amount<0)		
			throw new Exception("음수입력!");		
		else
			setBalance(getBalance()-amount);
	}	
	
	public double getWithdrawableAccount()
	{
		if(getBalance()>=-1*creditLimit) // creditlimit이 양수 한도는 -
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
		double realInterest; 
		if (getBalance()>=0)
		{
			realInterest=interest; 
		}
		else
		{
			realInterest=loanInterest; 
  		}
		setBalance(getBalance()*(1+realInterest*date)); 
	}
	public void passTime()
	{
		double realInterest; 
		if (getBalance()>=0)
		{
			realInterest=interest; 
		}
		else
		{
			realInterest=loanInterest; 
  		}
		setBalance(getBalance()*(1+realInterest*1)); 
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
	public double EstimateValue()
	{
		setBalance(getBalance()*(1+interest*1));
		return getBalance();
	}
	
	public String toString(){
		return String.format("CheckingAccount_Balance:%.2f",getBalance());
	}
	
}




