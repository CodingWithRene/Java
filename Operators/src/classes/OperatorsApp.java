package classes;

public class OperatorsApp {

	public static void main(String[] args) {
			
		//basic operators (+, -, *, /)
		System.out.println("12 + 4 = "+(12 + 4));
		System.out.println("12 - 4 = "+(12 - 4));
		System.out.println("12 * 4 = "+(12 * 4));
		System.out.println("12 / 4 = "+(12 / 4));
		
		//Parenthesis
		System.out.println("(12-3) * 4 = "+ ((12 - 3) * 4));
		System.out.println("12*(-3 * 4) = "+ (12 * (-3 * 4)));
		
		//modulus
		System.out.println("10 % 3 = " +(10 % 3));
		
		//increment & decrement
		int numberOne = 10;
		System.out.println("NUmber One: " + numberOne);
		numberOne--;
		numberOne = numberOne - 1;
		System.out.println("NUmber One decemented: " + numberOne);
		numberOne++;
		
		//reassignment
		numberOne = numberOne+1;
		System.out.println("NUmber One: " + numberOne);
		numberOne += 10;
		System.out.println("NUmber One: " + numberOne);
		numberOne += numberOne;
		System.out.println("NUmber One: " + numberOne);
		numberOne -= 2;
		System.out.println("NUmber One: " + numberOne);
		numberOne *= 2;
		System.out.println("NUmber One: " + numberOne);
		numberOne /= 2;
		System.out.println("NUmber One: " + numberOne);
		numberOne %= 3;
		System.out.println("NUmber One: " + numberOne);
		
		
	}

}
