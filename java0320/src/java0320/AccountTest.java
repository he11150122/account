package java0320;

import java.util.Scanner; //Scanner 라는 클래스를 가져오기위함

public class AccountTest
{
	public static void main(String args[]) //main메소도이용해야만 콘솔창에 출력가능(main메서드가 java프로그램의 실행을 시작)
	{
		Account account1=new Account(100.00); //Account 객체를 생성/class명 변수이름 = new(새로만든다는뜻) 생성자메소드명 (생성자 메소드에서 필요한변수)
		Account account2=new Account(100.00);  //Account 객체를 생성
		
		System.out.printf("Account1 balance: $%.2f\n",account1.getBalance()); //account1변수의 balance를 보여주기위해 
		System.out.printf("Account2 balance: $%.2f\n",account2.getBalance());
		
		//Scanner를 생성하여 명령 프롬프트로부터 입력을 받는다.
		Scanner input = new Scanner(System.in); //변수를 만들려면 class명과 변수이름은 무작위 = new 생성자메소드명 (메소드에서 필요한 기능 변수)
		double debitAmount; //사용자가 입력하는 출금액
		double creditAmount; //사용자가 입력하는 입금액
		
		//debit1
		System.out.print("Enter deposit amount for Account1:");
		debitAmount=input.nextDouble(); //사용자 입력을 얻는다
		System.out.println();
		
		System.out.printf("account1 balance: $%.2f\n",account1.getBalance()); 
		System.out.printf("account2 balance: $%.2f\n",account2.getBalance());
		System.out.print("Enter withdrawal amount for Account2:");
		debitAmount=input.nextDouble(); //사용자 입력을 얻는다
		System.out.println();
		
		System.out.printf("subtracting %.2f from account2 balance\n",debitAmount);
		account2.debit(debitAmount); //account2계좌에서 입력받은 출금액을 뺀다
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
		account2.credit(creditAmount); //account1에서 creditbalance만큼을 더함
		System.out.printf("account1 balance: $%.2f\n",account1.getBalance()); 
		System.out.printf("account2 balance: $%.2f\n",account2.getBalance());
		System.out.println();
		
		
	}
}

