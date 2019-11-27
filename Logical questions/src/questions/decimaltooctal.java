package questions;
import java.util.Scanner;
public class decimaltooctal {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] octalNum = new int[n];
int i = 0;
while (n != 0)  
{
           octalNum[i] = n % 8;
           n = n / 8;
           i++;
       }  
       for (int j = i - 1; j >= 0; j--)
           System.out.print(octalNum[j]);
   }
}