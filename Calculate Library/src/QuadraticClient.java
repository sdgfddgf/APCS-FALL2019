//This class contains methods that interact with the user and describe a quadratic function.
//@author JasonJi
//version 10/5/2018
import java.util.*;

public class QuadraticClient {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Quadratic Describer");
		String confirmation;
		boolean keepGoing = true;
		do {
			System.out.println("Provide values for coefficients a, b, and c");
			System.out.print("a:");
			Scanner console = new Scanner(System.in);
			double a = console.nextDouble();
			System.out.print("b:");
			double b = console.nextDouble();
			System.out.print("c:");
			double c = console.nextDouble();
			System.out.println(" ");
			System.out.println("Description of the graph of:");
			System.out.println("y = " + a + "x^2" + "+" + b + "x" + "+" + c);
			System.out.println(" ");
			System.out.println(Quadratic.quadrDescriber(a,b,c) );
			System.out.println(" ");
			System.out.println("Do you want to keep going?(Type \"quit\" to end)");
			confirmation = console.next();
			keepGoing = !confirmation.equals ("quit");
		}while (keepGoing == true);
	
		
	

	}

}
