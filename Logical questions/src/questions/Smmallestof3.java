package questions;
import java.util.*;
public class Smmallestof3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int temp;
		int size=s.nextInt();
		int array[]=new int[size];
		int i;
		for(i=0;i<size;i++)
		{
	      array[i]=s.nextInt();
		}
	      for( i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){
	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println("Smallest element of the array is:: "+array[0]);
	   }
	}