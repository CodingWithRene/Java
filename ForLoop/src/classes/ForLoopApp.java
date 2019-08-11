package classes;

public class ForLoopApp {
	public static void main(String[] args) {

		System.out.println("While loop");
		int count = 0;
		while (count < 10) {
			System.out.println(count);
			count++;
		}

		System.out.println("For loop");

		for (int counter = 0; counter < 10; counter++) {
			System.out.println(counter);
		}
		System.out.println();
		
		System.out.println("For Each");

		int[] numbers = { 21, 55, 63, 99, 109 };

		for (int number : numbers) {

			System.out.println(number+21);

		}
	}

}
