package java0313;
import java.util.Scanner; //입력기능을 갖춤
public class accounttest 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); //입력기능 불러옴
		double num1,num2;
		double i;
		System.out.print("account1 balance: "); //괄호안의 내용 출력
		num1=input.nextDouble();
		System.out.print("account2 balance: ");
		num2=input.nextDouble();
		
		account acc1=new account(num1); //acc1을 이용 account클래스의 메소도 이용
		account acc2=new account(num2); //acc2를 이용해서 account클래스의 메소드 이용
		
		System.out.println("Enter credit amount for account1: ");
		i=input.nextDouble(); //입력기능 사용
		System.out.printf("adding %.2 from account1 balance\n",i);
		acc1.credit(i);
		System.out.printf("account1 balance: $%.2f\n", acc1.balance());
		System.out.printf("account2 balance: $%.2f\n", acc2.balance());
		
		System.out.println("Enter withdrawl amount for account2: ");
		i=input.nextDouble();
		System.out.printf("subtracting %.2f from account1 balance\n", i);
		acc2.debit(i);
		System.out.printf("account1 balance: $%.2f\n",acc1.balance());
		System.out.printf("account2 balance: $%.2f\n",acc2.balance());
		
		
		
		
	}

}
