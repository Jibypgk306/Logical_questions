package questions;

import java.util.Scanner;

public class Searcharray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int size=s.nextInt();
		int []a1=new int[size];
		int flag = 0,i;
		System.out.println("Enter elements");
		for(i=0;i<size;i++)
		a1[i]=s.nextInt();
		int se=s.nextInt();
		for( i=0;i<size;i++)
		if(a1[i]==se)
		{
			flag = 1;
            break;
        }
        else
        {
            flag = 0;
        }
    if(flag == 1)
    {
        System.out.println("Element found at position:"+(i + 1));
    }
    else
    {
        System.out.println("Element not found");
    }

}
}
