package javapractice;
import java.util.*;
import java.io.PrintWriter;


		
public class Array2D {

	public static Scanner sc=new Scanner(System.in);  //declaration of variables
	public static int[][] array=new int[10][10];
	public static int m,n;
	
	public static void input()			//@function to get nput from the user
	{
		System.out.println("Enter the row size and column size:");
		 m=sc.nextInt();
		 n=sc.nextInt();
		System.out.println("Enter the array elements:");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				array[i][j]=sc.nextInt();
	}
	
	public static void output()					//@function to store the output in file output.txt using printwriter function
	{
		System.out.println("Array elements are written into output.txt file:");
		try {
      			PrintWriter output = new PrintWriter("output.txt");
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
					output.print(array[i][j]+" ");
				output.print("\n");
			}

      		
      			output.close();
    		}
    		catch(Exception e) {
      			e.getStackTrace();
			}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();
		output();
		
		
	}
}