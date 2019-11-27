package questions;
import java.util.*;
public class Arclength {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius");
		int r=s.nextInt();
		System.out.println("Enter Angle");
		int angle=s.nextInt();
		int arc=(int) (2*(3.14)*r*(angle/360));
		System.out.println("Arc Length is:"+arc);
	}
}
