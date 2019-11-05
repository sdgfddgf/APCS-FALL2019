package fracCalc;

import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) 
    {
    	// TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner userInput = new Scanner(System.in);
    	String loop;
    	do {
    		System.out.println("Please enter the formula: ");
    		String exp = userInput.next();	
    		System.out.println(produceAnswer(exp));
    		System.out.println("Type \"quit\" to stop. Type another formula to continue.");
    		loop = userInput.next();
    	} while (!loop.equals("quit"));
    	userInput.close();
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
    	//Converts the expression(string) into arrays form(int whole, int numer, int deno)
    	String[] splitExp = input.split(" ");
    	int[] frac1 = processFrac(splitExp[0]);
    	int[] frac2 = processFrac(splitExp[2]);
    	
        // TODO: Implement this function to produce the solution to the input
    	
    	//Put expression into different method based on the operator
    	if (splitExp[1].equals("+") || splitExp[1].equals("-")) {
    		return AddMinus(frac1, frac2, splitExp[1]);
    	} else {
    		return MultiplyDivide(frac1, frac2, splitExp[1]);
    	}
    }    
  public static int simplify ()
    public static int AddMinus (int num1, int num2, int den1, int den2) {
    	if (num2<0){
    		int resultNum = (num1 * den2)-(num2 * den1);
    	}
    	else {
    		int resultNum =(num1 * den2)+(num2 * den1); 
    	}
    	int resultDen =(den1 * den2);
    return simplify;
	}
}