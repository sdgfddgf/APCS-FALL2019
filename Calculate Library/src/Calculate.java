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
}
