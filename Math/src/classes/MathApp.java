package classes;

public class MathApp {

	public static void main(String[] args) {

		System.out.println("1 + 1 = " + (1 + 1));

		int bigger = 55;
		
		int smaller = 23;

		System.out.println("The biggest of these two numbers is " + Math.max(smaller, bigger));
		System.out.println("The smaller of these two numbers is " + Math.min(smaller, bigger));
		
		System.out.println("The square root of 64 is " + Math.sqrt(64));
		System.out.println("The absolute value of -4 is " + Math.abs(-4));
		System.out.println("Random number between 0 and 1 " + Math.random());
		
		System.out.println("PI " + Math.PI);
		
		

	}

}
