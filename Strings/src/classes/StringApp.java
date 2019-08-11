package classes;

public class StringApp {

	public static void main(String[] args) {
		String name = "Rene";
		System.out.println("The first letter of my name is " + name.charAt(0));
		
		System.out.println("The length of my name is " + name.length( ));
		
		System.out.println("My name in upper case " + name.toUpperCase());
		System.out.println("My name in lower case " + name.toLowerCase());
		
		String fullName = name.concat(" vanderWatt");
		
		System.out.println("My full name is " + fullName);
		System.out.println("I said \" Some quote \" ");
		System.out.println("I said \' Some quote \' ");
		System.out.println("Back slash \\ ");
		System.out.println("This is on a \nnew line");
		System.out.println("This is \ttabbed");
	}

}
