package java0320;

public class Account //�ν��Ͻ� ���� balance�� �ʱ�ȭ�ϴ� �����ڸ� ������ Account Ŭ����
{ 
	
	protected double balance;
	
	public Account(double initialBalance) //�����ڸ޼ҵ�.Account �޼ҵ� �ȿ��� ����� initialbalnce��� ���� ����
	{
		balance=initialBalance; //Account�޼ҵ忡�� initialBalance�� balance
	} //Account ������ ��
	
	public void credit(double money) //���¿� amount�� �Ա�
	{
		balance=balance+money-100;
	} //credit�޼��� ��
	
	public void debit(double money) //���¿� amount�� ���
	{
		if(balance>money)
			balance=balance-money;
		else //0���� ���̸� �״�� �����ϰ� balance�� �����ϰ� ��� ���, �������϶� {}���
		{
			System.out.println("Debit amount exceeded account balance.");
		}	
	} //debit�޼��� ��
	//���� �ܾ��� ��ȯ
	public double getBalance() //balance�� ���
	{
		return balance; //balance���� ȣ�� �޼��忡 �ѱ��
	} //getBalance�޼��� ��
	
}
