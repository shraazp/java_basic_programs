package javapractice;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		double distance=Math.sqrt(Math.pow(x, 2)+Math.pow(y,2));
		System.out.println("The eulidean distance of ("+x+","+y+") from origin (0,0) is "+distance);
	}

}
