package java0320;

public class Account //인스턴스 변수 balance를 초기화하는 생성자를 가지는 Account 클래스
{ 
	
	private double balance;
	
	public Account(double initialBalance) //생성자메소드.Account 메소드 안에서 사용할 initialbalnce라는 변수 선언
	{
		balance=initialBalance; //Account메소드에서 initialBalance는 balance
	} //Account 생성자 끝
	
	public void credit(double money) //void는 리턴값이 없을때 사용
	{
		balance=balance+money;
	} //credit메서드 끝
	
	public void debit(double money) //계좌에 amount를 출금
	{
		if(balance>=money)
			balance=balance-money;
		else //0밑의 값이면 그대로 계산안하고 balance값 츌력하고 경고문 출력, 여러줄일땐 {}사용
			System.out.println("Debit amount exceeded account balance.");			
	} 
	
	public double getBalance() //balance값 출력
	{
		return balance; //balance값을 호출 메서드에 넘긴다
	} //getBalance메서드 끝
	void setBalance(double newBalance)
	{
		balance=newBalance;
	}
	
}
