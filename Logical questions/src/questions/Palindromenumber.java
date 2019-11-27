package questions;
import java.util.Scanner;

public class Palindromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		System.out.println("ENTER THE NUMBER");
		int n=s.nextInt();
		int t=n;
		int r=0;
		int a;
		do
		{
			a=n%10;
			r=r*10+a;
			n=n/10;
		}
		while(n!=0);
		if(r==t)
		{
		System.out.println("Palindrome number");
	}
		else
		{
			System.out.println("Not Palindrome number");

		}
	}
}
