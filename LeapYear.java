package javapractice;
import java.util.Scanner;
public final class LeapYear {
public static  int year;
	public static void leapyear(int year)
	{
			if(((year % 4 == 0) && (year % 100 != 0)) ||(year % 400 == 0))
			{
				System.out.println(year+" is a leap year!!!");
			}
			else
				System.out.println(year+" is not a leap year");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year:");
		year=sc.nextInt();
		
		if(999<year && year <10000)
		{
			leapyear(year);
		}
		else
		{
			System.out.println("Year should have 4 digits!!!");
			System.out.println("Enter the year:");
			year=sc.nextInt();
			leapyear(year);
		}
		sc.close();
	}

}
