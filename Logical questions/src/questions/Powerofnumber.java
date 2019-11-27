package questions;

import java.util.Scanner;

public class Powerofnumber {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
		int power;
		System.out.println("ENTER THE NUMBER");
		int base=s.nextInt();
		int exp=s.nextInt();
		power=(int) Math.pow(base,exp);
		System.out.println(power);
	}

}
