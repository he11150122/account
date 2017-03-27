package java0327;

public abstract class Account 
{ 
	private double balance; //balance라는 잔액을 저장하는 변수 선언 
	
	public Account(double initialBalance) //생성자메소드.Account 메소드 안에서 사용할 initialbalnce라는 변수 선언
	{
		balance=initialBalance; //Account메소드에서 initialBalance는 balance
	} //Account 생성자 끝

	public void credit(double creditAmount) //계좌에 amount를 입금
	{
		balance=balance+creditAmount;
	} //credit메서드 끝
	
	public void debit(double debitAmount) //계좌에 amount를 출금
	{
		if(balance-debitAmount >=0)
			balance=balance-debitAmount;
		else //0밑의 값이면 그대로 계산안하고 balance값 츌력하고 경고문 출력, 여러줄일땐 {}사용
		{
			balance=balance;
			System.out.println("Debit amount exceeded account balance.");
		}	
	} //debit메서드 끝
	//계좌 잔액을 반환
	public double getBalance() //balance값 출력
	{
		return balance; //balance값을 호출 메서드에 넘긴다
	} //getBalance메서드 끝
	
	public abstract double getWithdrawableAccount()
	
	public abstract double passTime(int);
	

}

