package java0320;

import java.util.Scanner; //Scanner 라는 클래스를 가져오기위함

public class AccountTest
{
	public static void main(String args[]) //main메소도이용해야만 콘솔창에 출력가능(main메서드가 java프로그램의 실행을 시작)
	{
		Account account1=new CheckingAccount(100.00,50.00,0.01,0.07); //Account 객체를 생성/class명 변수이름 = new(새로만든다는뜻) 생성자메소드명 (생성자 메소드에서 필요한변수)
		Account account2=new CheckingAccount(100.00,50.00,0.01,0.07);  //Account 객체를 생성
		
		System.out.printf("Account1 balance: $%.2f\n",account1.getBalance()); //account1변수의 balance를 보여주기위해 
		System.out.printf("Account2 balance: $%.2f\n",account2.getBalance());
		
		//Scanner를 생성하여 명령 프롬프트로부터 입력을 받는다.
		Scanner input = new Scanner(System.in); //변수를 만들려면 class명과 변수이름은 무작위 = new 생성자메소드명 (메소드에서 필요한 기능 변수)
		double debitAmount; //사용자가 입력하는 출금액 main메소드 안에 존재하는거라 변수이름 맘대로
		double creditAmount;
		
		System.out.print("Enter deposit amount for Account1:");
		creditAmount=input.nextDouble(); //사용자 입력을 얻는다
		account1.credit(creditAmount);  //account1에 credit메소드를 사용 creditamount전달
		System.out.println();
		
		
		System.out.printf("account1 balance: $%.2f\n",account1.getBalance()); 
		System.out.printf("account2 balance: $%.2f\n",account2.getBalance());
		System.out.print("Enter withdrawal amount for Account2:");
		debitAmount=input.nextDouble(); //사용자 입력을 얻는다
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

