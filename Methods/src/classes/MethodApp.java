package classes;

public class MethodApp {

	public static void main(String[] args) {
		sayHello();

		int fortyTwoo = math();

		System.out.println(fortyTwoo);
		printing("Hello Thres");
		
		addition(31, 12);

	}

	// FUNCTIONS accsesModifier retrunType name(){}
	public static void sayHello() {
		System.out.println("Hello World");
//		System.out.println("Hello World");
//		System.out.println("Hello World");
//		System.out.println("Hello World");
//		System.out.println("Hello World");
//		System.out.println("Hello World");
	}

	public static int math() {
		return 42;
	}

	public static void printing(String output) {
		System.out.println(output);
	}

	public static void addition(int number1, int number2) {
		System.out.println(number1+number2);
	}

}
