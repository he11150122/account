package java0320;

import java.util.Scanner; //Scanner ��� Ŭ������ ������������

public class AccountTest
{
	public static void main(String args[]) //main�޼ҵ��̿��ؾ߸� �ܼ�â�� ��°���(main�޼��尡 java���α׷��� ������ ����)
	{
		Account account1=new CheckingAccount(100.00,50.00,0.01,0.07); //Account ��ü�� ����/class�� �����̸� = new(���θ���ٴ¶�) �����ڸ޼ҵ�� (������ �޼ҵ忡�� �ʿ��Ѻ���)
		Account account2=new CheckingAccount(100.00,50.00,0.01,0.07);  //Account ��ü�� ����
		
		System.out.printf("Account1 balance: $%.2f\n",account1.getBalance()); //account1������ balance�� �����ֱ����� 
		System.out.printf("Account2 balance: $%.2f\n",account2.getBalance());
		
		//Scanner�� �����Ͽ� ��� ������Ʈ�κ��� �Է��� �޴´�.
		Scanner input = new Scanner(System.in); //������ ������� class��� �����̸��� ������ = new �����ڸ޼ҵ�� (�޼ҵ忡�� �ʿ��� ��� ����)
		double debitAmount; //����ڰ� �Է��ϴ� ��ݾ� main�޼ҵ� �ȿ� �����ϴ°Ŷ� �����̸� �����
		double creditAmount;
		
		System.out.print("Enter deposit amount for Account1:");
		creditAmount=input.nextDouble(); //����� �Է��� ��´�
		account1.credit(creditAmount);  //account1�� credit�޼ҵ带 ��� creditamount����
		System.out.println();
		
		
		System.out.printf("account1 balance: $%.2f\n",account1.getBalance()); 
		System.out.printf("account2 balance: $%.2f\n",account2.getBalance());
		System.out.print("Enter withdrawal amount for Account2:");
		debitAmount=input.nextDouble(); //����� �Է��� ��´�
		account2.debit(debitAmount);
		System.out.println();
		
		
		System.out.printf("account1 balance: $%.2f\n",account1.getBalance()); 
		System.out.printf("account2 balance: $%.2f\n",account2.getBalance());
		System.out.println();
		
	
		System.out.println("next month!");
		((CheckingAccount)account1).nextmonth();
		((CheckingAccount)account2).nextmonth();
		System.out.printf("account1 balance: $%.2f\n",account1.getBalance()); 
		System.out.printf("account2 balance: $%.2f\n",account2.getBalance());
		
	}
}

