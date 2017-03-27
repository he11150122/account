package java0320;

import java.util.Scanner; //Scanner ��� Ŭ������ ������������

public class AccountTest
{
	public static void main(String args[]) //main�޼ҵ��̿��ؾ߸� �ܼ�â�� ��°���(main�޼��尡 java���α׷��� ������ ����)
	{
		Account account1=new Account(100.00); //Account ��ü�� ����/class�� �����̸� = new(���θ���ٴ¶�) �����ڸ޼ҵ�� (������ �޼ҵ忡�� �ʿ��Ѻ���)
		Account account2=new Account(100.00);  //Account ��ü�� ����
		
		System.out.printf("Account1 balance: $%.2f\n",account1.getBalance()); //account1������ balance�� �����ֱ����� 
		System.out.printf("Account2 balance: $%.2f\n",account2.getBalance());
		
		//Scanner�� �����Ͽ� ��� ������Ʈ�κ��� �Է��� �޴´�.
		Scanner input = new Scanner(System.in); //������ ������� class��� �����̸��� ������ = new �����ڸ޼ҵ�� (�޼ҵ忡�� �ʿ��� ��� ����)
		double debitAmount; //����ڰ� �Է��ϴ� ��ݾ�
		double creditAmount; //����ڰ� �Է��ϴ� �Աݾ�
		
		//debit1
		System.out.print("Enter deposit amount for Account1:");
		debitAmount=input.nextDouble(); //����� �Է��� ��´�
		System.out.println();
		
		System.out.printf("account1 balance: $%.2f\n",account1.getBalance()); 
		System.out.printf("account2 balance: $%.2f\n",account2.getBalance());
		System.out.print("Enter withdrawal amount for Account2:");
		debitAmount=input.nextDouble(); //����� �Է��� ��´�
		System.out.println();
		
		System.out.printf("subtracting %.2f from account2 balance\n",debitAmount);
		account2.debit(debitAmount); //account2���¿��� �Է¹��� ��ݾ��� ����
		System.out.printf("account1 balance: $%.2f\n",account1.getBalance()); 
		System.out.printf("account2 balance: $%.2f\n",account2.getBalance());
		System.out.println();
		
		//credit1
		
		System.out.print("Enter credit amount for account1:");
		creditAmount=input.nextDouble();
		System.out.println();
		
		System.out.printf("adding %.2f from account1 balance\n",creditAmount);
		account1.credit(creditAmount);
		System.out.printf("account1 balance: $%.2f\n",account1.getBalance()); 
		System.out.printf("account2 balance: $%.2f\n",account2.getBalance());
		System.out.println();
		
		//credit2
		System.out.print("Enter credit amount for account2:");
		creditAmount=input.nextDouble();
		System.out.println();
		
		System.out.printf("adding %.2f from account2 balance\n",creditAmount);
		account2.credit(creditAmount); //account1���� creditbalance��ŭ�� ����
		System.out.printf("account1 balance: $%.2f\n",account1.getBalance()); 
		System.out.printf("account2 balance: $%.2f\n",account2.getBalance());
		System.out.println();
		
		
	}
}

