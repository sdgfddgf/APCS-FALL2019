//This class contains methods that do the calculations to determines the shape of a quadratic function.
//@author Mark Zhang
//version 12/16/2019

public class Quadratic {
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
	public static double discriminant(double number1,double number2,double number3) {
		double answer = (number2*number2)-(4*number1*number3);
		return answer;
	}
	public static String quadrDescriber(double a, double b, double c) {
		String descEquation = "Description of the graph of:\n";
		String equation = a + "x^2 + " + b + "x + " + c + "\n";
		if(a == 0) {
			return "Not a quadratic equation";
		}
		//Describe orientation
		String orientation = "Opens: ";
		if(a > 0) {
			orientation += "Up";
		}else {
			orientation += "Down";
		}
		//Describe Axis of symmetry
		double sym = -b/(2*a);
		
		//Describe Vertex
		double x = -b/(2*a);
		double y = a*(-b/(2*a))*(-b/(2*a)) + b*(-b/(2*a)) + c;
		String vertex = "(" + x + ", " + y + ")";
		//Describe x-intercept
		String roots = quadForm(a,b,c);
		if(roots.equals("no real roots")) {
			roots = "None";
		}
		
		//Describe y-intercept
		double yInt = c;
		/*System.out.print("Opens: ");
		if(a>0) {
			System.out.println("Up");
		}else {//if(a<0)
			System.out.println("Down");
		}*/
		return descEquation + equation + orientation + "\nAxis of Symmetry: " + sym + "\nVertex: " + vertex + "\nx-intercept(s): " + roots + "\ny-intercept: " + yInt;
	}

}