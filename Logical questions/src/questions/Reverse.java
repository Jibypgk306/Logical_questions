package questions;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		System.out.println("ENTER THE NUMBER");
		int n=s.nextInt();
		int r=0;
		int a;
		do
		{
			a=n%10;
			r=r*10+a;
			n=n/10;
		}
		while(n!=0);
		System.out.println(r);

	}
}
