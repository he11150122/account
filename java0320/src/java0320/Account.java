package java0320;

public class Account //�ν��Ͻ� ���� balance�� �ʱ�ȭ�ϴ� �����ڸ� ������ Account Ŭ����
{ 
	
	private double balance;
	
	public Account(double initialBalance) //�����ڸ޼ҵ�.Account �޼ҵ� �ȿ��� ����� initialbalnce��� ���� ����
	{
		balance=initialBalance; //Account�޼ҵ忡�� initialBalance�� balance
	} //Account ������ ��
	
	public void credit(double money) //void�� ���ϰ��� ������ ���
	{
		balance=balance+money;
	} //credit�޼��� ��
	
	public void debit(double money) //���¿� amount�� ���
	{
		if(balance>=money)
			balance=balance-money;
		else //0���� ���̸� �״�� �����ϰ� balance�� �����ϰ� ��� ���, �������϶� {}���
			System.out.println("Debit amount exceeded account balance.");			
	} 
	
	public double getBalance() //balance�� ���
	{
		return balance; //balance���� ȣ�� �޼��忡 �ѱ��
	} //getBalance�޼��� ��
	void setBalance(double newBalance)
	{
		balance=newBalance;
	}
	
}
