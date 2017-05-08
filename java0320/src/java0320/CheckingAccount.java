package java0320;

public class CheckingAccount extends Account
{
	private double creditLimit;
	private double interest;
	private double loanInterest;
	public CheckingAccount(double balance, double limit, double interest, double loanInterest)  //생성자 안에 존재하는 변수이고 위에 변수들은 class에 존재하는 변수, balance느 account에 있는거랑 다름
	{
		super(balance);  //부모클래스의 생성자를 호출
		this.creditLimit=limit;
		this.interest=interest;  //this는 checkingaccount안의 변수를 의미
		this.loanInterest=loanInterest;
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
	public void debit(double money)
	{
		if (getBalance()-money>=-1*creditLimit)
		{
			setBalance(getBalance()-money);
		}
		else
		{
			System.out.println("출금할 수 없습니다.");
	
		}
	}	
	

}
