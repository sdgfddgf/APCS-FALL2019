//Zhiwei Zhang
//August 29, 2019
//Library of math functions
public class Calculate {
	public static int square(int number) {
		return number*number;
	}
	public static int cube(int number) {
		return number*number*number;
	}
	public static double average (double number1, double number2) {
		return (number1+number2)/2;
	}
	public static double average (double number1, double number2, double number3) {
		return (number1+number2+number3)/3; 
	}
	public static double toDegrees (double radians) {
		return (radians/3.141596)*180;
	}
	public static double toRadians (double degrees) {
		return (degrees*3.14159)/180;
	}
	public static double discriminant (double a, double b, double c) {
		return (b*b-4*a*c);
	}
	public static String toImproperFrac (int Whole, int Numerator, int Denominator) {
		return (Whole*Denominator) + Numerator + "/" + Denominator;
	}
	public static String toMixedNum (int Numberator, int Denominator) {
		return (Numberator/Denominator) + "_" + (Numberator-(Numberator/Denominator)*Denominator) + "/" + Denominator;
	}
	public static String foil (int a, int b, int c, int d, String n) {
		return ((a*c)+"n^2+"+(a*d+b*c)+"n+"+(b*d));
	}
	public static boolean isDivisibleBy (int a, int b) {
		if(b==0) {
		throw new IllegalArgumentException("Do not accept 0");
		}
		return a%b==0;
	}
	public static double absValue (double number) {
		if (number<0) {
		return (number*-1);
	}
	else { 
		return(number);
		}
	}
	public static double max (double number1, double number2) {
		if (number1<number2) {
		return(number2);
		}
	else {
		return (number1);
		}
	}
	public static double max (double a, double b, double c) {
			double output = 0;
			if (a>b && a>c) {
				return (output=a);
			}
			else if (b>a && b>c) {
				return (output=b);
			}
			else if (c>a && c>b){
				return (output=c);
			}
			return output;
	}
	public static int min (int a, int b) {
		if (a>b) {
			return (b);
	}
		else {
			return (a);
		}
	}
	public static double round2(double a) {
		double b = 100*a;
		a= (int) b;
		double c= b-a;
		if (c>=0.5) {
			return (a+1)/100.0;
		}
		else {
			return a/100.0;
		}
	}
	public static double exponent (double b, int x) {
    	if(x<0)throw new IllegalArgumentException("Do not accept negative numbers");
		if (x==0) {
			return 1;
		}
    	double result = 1.000;
        while(x > 0){
            result *= b;
            x--;
        }
        return result;
	}
	public static int factorial (int n) {
    	if(n<0)throw new IllegalArgumentException("Could not have negative numbers");
		int result=1;
		if(n<0){
		return -1;
		}
		if(n==0){
		return 1;
		}
		for(int i =1;i<=n;i++){
		result*=i;
		}
		return result;		
	}
	public static boolean isPrime (int x) {
		boolean isPrime = true;
        for(int i = 2 ; i < x ; i++){
            if(x % i == 0){
                isPrime = false;
            }
        }
        return isPrime;
	}
	public static int gcf (int a,int b){

		int result = 1;
		for (int factor=2; factor<=a;factor++) {
			boolean c = isDivisibleBy(a,factor);
			boolean d = isDivisibleBy(b,factor);
			if(c==true && d==true) {
				 result = factor;
			}
		}
		return result;
	}
	public static double sqrt (double x) {
		if(x <0)throw new IllegalArgumentException("Could not have a negative square root");
		double result= 1;
		while (x-result*result>=0.005 || result*result-x>=0.005 ) {
	    result = 0.5*(x/result+result);
	    }
		result= round2 (result);
		 if (x==0){
			return 0;
		}
		return result;
    }
	 public static String quadForm(double a, double b, double c){
	    	//part 4
	    	//uses the quadratic formula to approximate the real roots.
	    	if((discriminant(a,b,c)>=0)) {
	    		double posRt = round2((-b + sqrt(discriminant(a,b,c)))/-2/a);
	    		double negRt = round2((-b - sqrt(discriminant(a,b,c)))/-2/a);
	            double rt1st = posRt;
	    		double rt2nd = posRt;
	    		if(posRt != negRt) {
	    		}
	    		if(rt1st == posRt) {
	    			rt2nd = negRt;
	    		}
	    		
	    		if(rt1st > rt2nd) {
	    			return rt2nd + "and" + rt1st;
	    		}
	    		else {
	    			return rt1st + "and" + rt2nd;
	    		}
	    	}
	    	else {
	    		return "no real roots.";
	    	}
	    }
}