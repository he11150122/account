package java0313;
import java.util.Scanner; //�Է±���� ����
public class Accounttest 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); //�Է±�� �ҷ���
		double num1,num2;
		double i;
		System.out.print("account1 balance: "); //��ȣ���� ���� ���
		num1=input.nextDouble();
		System.out.print("account2 balance: ");
		num2=input.nextDouble();
		
		Account balance1=new Account(num1); //acc1�� �̿� accountŬ������ �޼ҵ� �̿�
		Account balance2=new Account(num2); //acc2�� �̿��ؼ� accountŬ������ �޼ҵ� �̿�
		
		System.out.println("Enter credit amount for account1: ");
		i=input.nextDouble(); //�Է±�� ���
		System.out.printf("adding %.2 from account1 balance\n",i);
		balance1.credit(i);
		System.out.printf("account1 balance: $%.2f\n", balance1.balance());
		System.out.printf("account2 balance: $%.2f\n", balance2.balance());
		
		System.out.println("Enter withdrawl amount for account2: ");
		i=input.nextDouble();
		System.out.printf("subtracting %.2f from account1 balance\n", i);
		balance2.debit(i);
		System.out.printf("account1 balance: $%.2f\n",balance1.balance());
		System.out.printf("account2 balance: $%.2f\n",balance2.balance());
		
		System.out.printf("account1 balance: $%.2f\n",balance1.balance());
		System.out.printf("account2 balance: $%.2f\n",balance2.balance());
		
		
		
	}

}
