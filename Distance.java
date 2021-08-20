//Java program to calculate Euclidean distance between a point and origin
package javapractice;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=Integer.parseInt(args[0]);	//@input x obtained from parameters given in command line
		int y=Integer.parseInt(args[1]);	//@input y obtained from parameters given in command line
		double distance=Math.sqrt(Math.pow(x, 2)+Math.pow(y,2));	//@formula to calculate distance
		System.out.println("The eulidean distance of ("+x+","+y+") from origin (0,0) is "+distance);	//@output distance between point and origin
	}

}
