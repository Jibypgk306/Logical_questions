package questions;

import java.util.Scanner;

public class Leapyr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year");
		int yr=s.nextInt();
		if(yr%4==0)
		{
		if(yr%100==0)//check century
		{
		
		if(yr%400==0)
		{
			System.out.println("Leap year");
		}
			else {
			
				System.out.println(" not Leap year");
			}
		}
				else {
						
					System.out.println("Leap year");
				}
		}
		else
		{
				System.out.println(" not Leap year");
		}
		
		
		s.close();

		}
		

}