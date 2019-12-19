package fracCalc;
import java.util.*;
public class FracCalc {

	//main method that takes the user input, call the produceAnswer method, and check if the user wants to continue.
    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner console = new Scanner(System.in);
    	boolean test = false;
    	System.out.println("Please type the calculation.");
		String input = console.nextLine();
		test = input.equals("quit");
    	while( test == false) {
    		
    		
    		String output = produceAnswer(input);
    		System.out.println(output);
    		System.out.println("Do you want to continue?");
    		input = console.nextLine();
    		test = input.equals("quit");
    	}

    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
   
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
	// This function takes a String 'input' and produces the result
	//
	// input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
	//      e.g. input ==> "1/2 + 3/4"
	//        
	// The function should return the result of the fraction after it has been calculated
	//      e.g. return ==> "1_1/4"
    
    //produceAnswer method that takes in the user input and return the result as a string.
	public static String produceAnswer(String input)
	{ 
	    // TODO: Implement this function to produce the solution to the input
	   
		//split the input into first operand, second operand, and the sign.
		String[] threeParts = input.split(" ");
	    int[] firstOperand = new int [3];
	    int[] secondOperand = new int [3];
	   
	    //split the operand into three integers representing the whole number, the numerator, and the denominator. Store them in an array called firstOperand(secondOperand).
	    secondOperand = checkpoint2(threeParts[2],secondOperand);
	    firstOperand = checkpoint2(threeParts[0],firstOperand);
	   
	    // convert the fraction to improper fraction
	    toImproper(firstOperand);
	    toImproper(secondOperand);  
	    
	    int[] result = new int [3];
	    //calculations
	    if (threeParts[1].equals("+")) {
	    	toCommonDenominator(firstOperand, secondOperand);
	      	result[1] = firstOperand[1] + secondOperand[1];
	    	result[2] = firstOperand[2];
	    }
	    else if(threeParts[1].equals("-")) {
	    	toCommonDenominator(firstOperand, secondOperand);
	    	result[1] = firstOperand[1] - secondOperand[1];
	    	result[2] = firstOperand[2];
	
	    }
	    else if(threeParts[1].equals("*")) {
	    	result[1] = firstOperand[1] * secondOperand[1];
	    	result[2] = firstOperand[2] * secondOperand[2];
	    } 
	    else {
	    	result[1] = firstOperand[1] * secondOperand[2];
	    	result[2] = firstOperand[2] * secondOperand[1];
	    	
	    }
	    
	
	
		// reduce fraction using greatesCommonFactor method
	    if (result[1]<0 &&result[2]<0) {
	    	result[1] = -result[1];
	    	result[2] = -result[2];
	    }
	    int i = 0;
	    while (i != 1) {
	    	i = greatestCommonFactor(result[1], result[2]);
	    	result[1] = result[1]/i;
	    	result[2] = result[2]/i;
	    }
	    
	    result[0] = result[1]/result[2];
	    result[1] = result[1]%result[2];
	    
	    
	    //change the sign of result fraction part if the fraction part has a negative before it.
	    if (result[1] <0) {
	    	if (result[0]<0) {
	        	result[1] = -result[1];
	        	
	        } 
	    	else if (result[0]>0){
	    		result[0] = -result[0];
	    		result[1] = -result[1];
	    	}
	   
	    	}
	    
	    else if(result[2]<0) {
	    	if (result[0]<0) {
	        	result[2] = -result[2];
	        	
	        }
	    	else if (result[0]>0){
	    		result[0] = -result[0];
	    		result[2] = -result[2];
	    	}
	    	else if (result[0]==0 && result[1]>0) {
	    		result[1]=-result[1];
	    		result[2]=-result[2];
	    	}
	    }
	    
	    //return the answer
	    if (result[1] == 0) {
	    	 return (result[0] +"");
	    }
	    else if(result[0]==0) {
	    	return (result[1]+ "/" + result[2]);
	    }
	    else {
	    	return ( result[0] + "_" + result[1] + "/" + result[2]) ;
	    }
	    
		
	}

	//method that takes in two arrays(two operands) and make them have the same denominator.
	public static void toCommonDenominator (int [] operand1, int[] operand2) {
    	
    	int temp = operand1[2] ;
    	operand1[2] = operand1[2] * operand2[2];
    	operand1[1] = operand1[1] * operand2[2];
    	operand2[2] = operand2[2] * temp;
    	operand2[1] = operand2[1] * temp;
    }
    
    
    
    
    //greatestCommonFactor takes in two integers and return their greatest common factor.
    public static int greatestCommonFactor(int a,int b) {
    	double limit = max(absValue(a), absValue(b));
    	int result = 1;
		for (int factor=2; factor<=limit;factor++) {
			boolean c = isDivisibleBy(a,factor);
			boolean d = isDivisibleBy(b,factor);
			if(c==true && d==true) {
				 result = factor;
			}
		}
		
		return result;
    }
    
    //this method is called checkpoint2 because this is basically what checkpoint2 asks us to do: it split the string operand into three integers representing whole number, numerator, and denominator. And I stord them in an array.
    public static int[] checkpoint2 (String input, int [] operand) {
        int indexOf_ = input.indexOf('_');
        int indexOfslash = input.indexOf('/');
        if (indexOf_ == -1 && indexOfslash != -1) {     // 2/5
        	operand[0] = 0;
        	operand[1] = Integer.parseInt(input.substring(0,indexOfslash));
        	operand[2] = Integer.parseInt(input.substring(indexOfslash+1));
        }
        else if(indexOf_ == -1 && indexOfslash == -1) {   //3
        	operand[0] = Integer.parseInt(input);
        	operand[1] = 0;
        	operand[2] = 1;
        }
        else {                      //3_2/5
        	String wholeNumberString2 = input.substring(0,indexOf_);
        	int wholeNumberInt2 = Integer.parseInt(wholeNumberString2);
        	String fractionString = input.substring(indexOf_+1);
        	operand[0] = wholeNumberInt2;
        	indexOfslash = fractionString.indexOf('/');
        	operand[1] = Integer.parseInt(fractionString.substring(0,indexOfslash));
            operand[2] = Integer.parseInt(fractionString.substring(indexOfslash+1));
        }
        return operand;  
    }

    //this method accepts an array and change it's first and second elements so that it becomes an Improper fraction.
    public static void toImproper(int[] fraction) {
    	int wholeNumber = fraction[0];
    	if (wholeNumber < 0) {
    		fraction[1] = -fraction[1] + fraction[2]*fraction[0];
    	}
    	else {
    		fraction[1] = fraction[1] + fraction[2]*fraction[0];
    	}
    	fraction[0] = 0;
    }
    
    //this method accepts two integers and determine whether they are divisible by each other. returns a boolean.
    public static boolean isDivisibleBy(int number1,int number2) {
		if (number2 == 0) {
			throw new IllegalArgumentException ("The denominator can't be negative.");
		}
		int d = number1 % number2;
		if (d == 0 ) {
			return true;
		}
		else {
			return false;
		}	
	}
    //the method accepts a double and returns its absolute value.
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
    
    //this method accepts two doubles and returns the one that has larger value.
    public static double max(double number1, double number2) {
		if (number1>number2) {
			return number1;
		}
		else {
			return number2;
		}
	}
} 

