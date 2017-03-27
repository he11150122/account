package java0327;

public abstract class Account 
{ 
	private double balance; //balance��� �ܾ��� �����ϴ� ���� ���� 
	
	public Account(double initialBalance) //�����ڸ޼ҵ�.Account �޼ҵ� �ȿ��� ����� initialbalnce��� ���� ����
	{
		balance=initialBalance; //Account�޼ҵ忡�� initialBalance�� balance
	} //Account ������ ��

	public void credit(double creditAmount) //���¿� amount�� �Ա�
	{
		balance=balance+creditAmount;
	} //credit�޼��� ��
	
	public void debit(double debitAmount) //���¿� amount�� ���
	{
		if(balance-debitAmount >=0)
			balance=balance-debitAmount;
		else //0���� ���̸� �״�� �����ϰ� balance�� �����ϰ� ��� ���, �������϶� {}���
		{
			balance=balance;
			System.out.println("Debit amount exceeded account balance.");
		}	
	} //debit�޼��� ��
	//���� �ܾ��� ��ȯ
	public double getBalance() //balance�� ���
	{
		return balance; //balance���� ȣ�� �޼��忡 �ѱ��
	} //getBalance�޼��� ��
	
	public abstract double getWithdrawableAccount()
	
	public abstract double passTime(int);
	

}

