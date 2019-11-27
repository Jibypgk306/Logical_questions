package questions;
import java.util.*;
public class Hypotenuse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter side 1:");
		int side1=s.nextInt();
		System.out.println("Enter side 2:");
		int side2=s.nextInt();
		System.out.println("Hypotenuse is...\n");
		double h =Math.sqrt((side1 * side1) + (side2 * side2)); 
		System.out.println(h);
	}
}
