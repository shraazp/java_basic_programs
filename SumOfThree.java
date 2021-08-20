package javapractice;

import java.util.Scanner;

public class SomOfThree {

	public static Scanner sc=new Scanner(System.in);
	public static int[] array=new int[10];
	public static int n;
	public static int distinctTriplets()
	{
		int d=0;
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
		return d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number of elements:");
		n=sc.nextInt();
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		int d=0;
		System.out.println("The distinct triplets are:");
		d=distinctTriplets();
		System.out.println("Number of distinct triplets is "+d);
	}

}
