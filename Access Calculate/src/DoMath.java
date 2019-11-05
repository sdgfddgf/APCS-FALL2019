//Zhiwei Zhang
//APCS Period 3
//August 29, 2019
//Call the code from the Calculate class 
//(aka client or runner code)
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(2));
		System.out.println(Calculate.cube(2));
		System.out.println(Calculate.average(4,6));
		System.out.println(Calculate.average(3,1,2));
		System.out.println(Calculate.toDegrees(2));
		System.out.println(Calculate.toRadians(4));
		System.out.println(Calculate.discriminant(4, 10, 2));
		System.out.println(Calculate.toImproperFrac(2,1,3));
		System.out.println(Calculate.toMixedNum(8, 3));
		System.out.println(Calculate.foil(2, 4, 7, 3, "n"));
		System.out.println(Calculate.isDivisibleBy(4, 2));
		System.out.println(Calculate.absValue(2));
		System.out.println(Calculate.max(2, 4));
		System.out.println(Calculate.max(0.00,0.00,-0.1));
		System.out.println(Calculate.min(10,2));
		System.out.println(Calculate.round2(1234.575));
		System.out.println(Calculate.exponent(3,0));
        System.out.println(Calculate.factorial(6));
        System.out.println(Calculate.isPrime(1));
        System.out.println(Calculate.gcf(32,24));
        System.out.println(Calculate.sqrt(9));
        System.out.println(Calculate.quadForm(-5, -4, 20));
	}
}
