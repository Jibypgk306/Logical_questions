package questions;
import java.util.*;
public class Areaofcircle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius");
		int r=s.nextInt();
		int area=(int) ((3.14)*r*r);
		System.out.println("Area is:"+area);
	}
}
