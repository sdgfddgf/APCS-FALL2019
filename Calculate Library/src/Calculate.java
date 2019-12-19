//Zhiwei Zhang
//August 29, 2019
//Library of math functions
public class Calculate {
	//returns the square to input
	public static int square(int number) {
		int answer;
		answer = number*number;
		return answer;
		//return number*number;
	}
	//A call to cube returns the cube of the value passed. Accepts an integer and returns an integer.
	public static int cube(int number) {
		int answer = number*number*number;
		return answer;
	}
	//Accepts two doubles and returns their average.
	public static double average(double number1,double number2) {
		double answer = (number1 + number2)/2 ;
		return answer;
	}
	//Accepts three doubles and returns their average.
	public static double average(double number1,double number2,double number3) {
		double answer = (number1 + number2 + number3)/3;
		return answer;
	}
	//Converts an angle measure in radians into degrees.
	public static double toDegrees(double number) {
		double answer = (number/3.14159)*180;
		return answer;
	}
	//Converts an angle measure in degrees into radians.
	public static double toRadians(double number) {
		double answer = (number/180)*3.14159;
		return answer;
	}
	//Returns the discriminant of a quadratic equation using standard form(a,b,c).
	public static double discriminant(double number1,double number2,double number3) {
		double answer = (number2*number2)-(4*number1*number3);
		return answer;
	}
	//return Improper Fraction(String) when input three mixed numbers
	public static String toImproperFrac(int wholenumber,int numerator,int denominator) {
		int fraction = denominator * wholenumber + numerator;
		return fraction + "/" + denominator;
	}
	//return mixed number(String) when input numerator and denominator
	public static String toMixedNum(int numerator, int denominator) {
		int wholeNum = numerator / denominator;
		int newNumber = numerator % denominator;
		return wholeNum + "_" + newNumber + "/" + denominator;
	}
	//returns the quadratic equation of the form ax^2+bx+c.
	public static String foil(int a, int b, int c, int d, String x) {
		int f = a * c;
		int o = a * d;
		int i = b * c;
		int l = b * d;
		int oi = o + i;
		return f + x + "^2" + "+" + oi + x + "+" + l;
	}

	
// Part 2
	//returns a boolean that determines whether or not one integer is evenly divisible by another.
	//Pre: number2 != o
	//Post: returns boolean that states whether or not one integer is evenly divisible by another
	public static boolean isDivisibleBy(int number1,int number2) {
		if (number2 == 0) {

			throw new IllegalArgumentException("denominator can't be 0");

			
		}
		int d = number1 % number2;
		if (d == 0 ) {
			return true;
		}
		else {
			return false;
		}	
	}
	//returns the absolute value of the number.
	public static double absValue(double number) {
		if (number>=0) {
			double answer = number;
			return answer;
		}
		else {
			double answer = number-2*number;
			return answer;
		}
	}
	//returns the largest values of three doubles .
	public static double max(double number1,double number2,double number3) {
		if (number1>=number2 && number1>=number3) {
			return number1;
		}
		else if (number2>number1 && number2>number3) {
			return number2;
		}
		else {
			return number3;
		}
	}
	//returns the larger value of two doubles.
	public static double max(double number1, double number2) {
		if (number1>number2) {
			return number1;
		}
		else {
			return number2;
		}
	}
	//returns the smaller value of two integers.
	public static int min(int a ,int b) {
		if (a>=b) {
			return b;
		}
		else {
			return a;
		}
	}
	//returns the result of rounding a double to 2 decimal places.
	public static double round2(double a) {
		double b = 100*a;
		a= (int) b;
		double c= b-a;
		if (c>=0.5) {
			return (a+1)/100.0;
		}
		else if(c<=0.5){
			return (a-1)/100.0;
		}
		else {
			return a/100.0;
		}
		}
	

//part 3
//returns the value to a positive integer power. 
	public static double exponent(double a, int b) {
		if (b<0 ) {
			throw new IllegalArgumentException ("The exponent can't be negative.");
		}
		double result = 1;
		if (b==0) {
			return result;
		}
		else{
			for (int c=1;c<=b;c++ ) {
			result = result*a;
		}
		return result;
		}
	}
//returns the factorial of the value passed
	public static int factorial(int a) {
		if (a<0) {
			throw new IllegalArgumentException ("The operand can't be negative.");
		}
		int result = a;
		for (int b=1;b<a;b++) {
			result = result*b;
		}
		return result;
	}
//returns a boolean that determines whether or not an integer is prime.
	public static boolean isPrime(int a) {
		
		for (int b=2;b<a;b++) {
			boolean c= isDivisibleBy(a,b);
		    if (c == true) {
				return false;
			}	
		}
		return true;
	}

//returns an integer that is the greatest common factor of two integers.
	public static int gcf(int a,int b) {
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
//returns the square root of a double.
	public static double sqrt(double number) {
		if (number<0) {
			throw new IllegalArgumentException ("The operand can't be negative.");
		}
		double result= 1;
		
		while (number-result*result>=0.0000005 || result*result-number>=0.0000005 ) {
		
	    result = 0.5*(number/result+result);
	    
	    }
		result= round2 (result);
		return result;
	}
	    	//part 4
	    	//uses the quadratic formula to approximate the real roots.
	public static String quadForm(double a, double b, double c) {
		double discriminant1 = discriminant(a,b,c);
		if (discriminant1 < 0) {
			 return "no real roots.";
		}
		double discriminant2 = sqrt(discriminant1);
		double result1 = (discriminant2-b)/(2.0*a);
		double result2 = (-discriminant2-b)/(2.0*a);
		
		if (discriminant1 == 0) {
			return result1 + "";
		}
		else {
			return result1 + " and " + result2;
		}
	}
}
 