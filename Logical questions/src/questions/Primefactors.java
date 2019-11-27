package questions;
import java.util.*;
public class Primefactors {

	public static void main(String[] args) {
		 {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");   //
		int number=sc.nextInt();
		System.out.print("Prime Factors are : " );
		        for (int i = 2; i <= number; i++) {
		            while (number % i == 0) 
		            {
		                System.out.print(i + " ");
		                number = number / i;
		            }
		        }
	}
	}
}
