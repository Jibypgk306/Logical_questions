package questions;
import java.util.*;
public class Fibgiven {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println(" enter a  number.");
		int n=s.nextInt();
	    int a=0, b=1 ,c=0; 
	     while(c<n) 
	          {
	              c = a + b; 
	              a = b;
	              b = c;
	          }
	           if(c==n)
	              System.out.println("Number is Fibonacci ");
	           else
	              System.out.println("Not fibinoci ");
}
}