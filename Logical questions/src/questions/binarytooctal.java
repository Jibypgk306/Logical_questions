package questions;
import java.util.Scanner;
public class binarytooctal {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String n=sc.nextLine();
int num=Integer.parseInt(n,2);
String ostr=Integer.toOctalString(num);
System.out.println("octal value:"+ostr);
}
}