package questions;
import java.util.*;
public class Farenheat {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter celcius value...");
		float c=s.nextFloat();
		float f = c * (9/ 5) + 32;
		System.out.println("FARENHEAT:"+f);
	}

}
