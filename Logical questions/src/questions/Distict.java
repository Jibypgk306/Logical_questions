package questions;
import java.util.*;
public class Distict {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the size");
			int n=s.nextInt();
			int[]a=new int[n];
			int j,i;
			System.out.println("enter  array elmentss");
			for(i=1;i<n;i++)
			{
				a[i]=s.nextInt();
			}
			for (i = 1; i < n; i++) {
		         for (j =1; j < i; j++)
		            if (a[i] == a[j])//check each element in array
		               break;
		            if (i == j)//check index of array
		               System.out.print( a[i] + " ");
					}
				}
			}