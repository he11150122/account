package java0306;
import java.util.Scanner;
public class addition
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a:");
		int a=input.nextInt();
		
		System.out.print("Enter b:");
		int b=input.nextInt();
		
		int c=a+b;
		System.out.printf("a+b=%d",c);
		
	}
}
