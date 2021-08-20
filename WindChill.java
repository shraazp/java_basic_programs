package javapractice;

public class WindChill {

	public static double windChillCompute(double t,double v)  
	{
		double w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16); //@param w gives value of wind chill 
		return w;		//@return double this return the value o;f wind chill
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double t=Double.parseDouble(args[0]);	//@param t is the temperature(in fahrenheit) parameter obtained from command line
		double v=Double.parseDouble(args[1]);	//@param v is the wind speed(in miles per hour) parameter obtained from command line
		System.out.println("The effective temperature is "+windChillCompute(t, v)+"F");	//@function windChillCompute is called and executed 
	}

}
