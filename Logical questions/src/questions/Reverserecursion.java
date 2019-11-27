package questions;
import java.util.*;
public class Reverserecursion {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string:");
        String str =s.nextLine();
        String reversed = reverseString(str);
        System.out.println("The reversed string is: " + reversed);
    }

    public static String reverseString(String str)
    {
        //Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
