package javapractice;

import java.util.Scanner;

public class SomOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] array=new int[10];
		System.out.println("Enter the number of elements:");
		int n=sc.nextInt();
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		int d=0;
		System.out.println("The distinct triplets are:");
		for(int i=0;i<n-2;i++)
			for(int j=i+1;j<n-1;j++)
				for(int k=j+1;k<n;k++)
				{
					if(array[i]+array[j]+array[k]==0)
					{
						d++;
						System.out.println("("+array[i]+","+array[j]+","+array[k]+")");
					}
				}
		System.out.println("Number of distinct triplets is "+d);
	}

}
