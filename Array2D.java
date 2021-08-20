package javapractice;
import java.util.*;
public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] array=new int[10][10];
		System.out.println("Enter the row size and column size:");
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.println("Enter the array elements:");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				array[i][j]=sc.nextInt();
		System.out.println("Array elements are:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(array[i][j]+" ");
			System.out.println();
		}
		
		
	}

}
