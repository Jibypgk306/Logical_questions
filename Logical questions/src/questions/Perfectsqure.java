package questions;
import java.util.*;
public class Perfectsqure {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number?");
		
		int number = sc.nextInt();
		
		int squareOfRoot = (int) Math.pow((Math.sqrt(number)),2);
		
		if(squareOfRoot==number)
		{
			System.out.println(number + " is Perfect Square.");
		}
		else
		{
			System.out.println(number+ "is NOT Perfect Square.");
		}
	}
	}
