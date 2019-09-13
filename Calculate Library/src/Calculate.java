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
	public static String foil (int a, int b, int c, int d, char n) {
		return ((a*c)+"n^2+"+(a*d+b*c)+"n+"+(c*d));
	}
	public static int isDivisibleBy (int a, int b) {
		return a/b;
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
			if (a>b && a>c) {
				return (a);
			}
			else if (b>a && b>c) {
				return (b);
			}
			else {
				return (c);
			}
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
		return (a-(a%0.01));
		}
	public static double exponent (double b, int x) {
		double result = 1.000;
        while(x > 0){
            result *= b;
            x--;
        }
        return result;
	}
}