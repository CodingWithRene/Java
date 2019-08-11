package classes;

public class LogicApp {

	public static void main(String[] args) {
		
		boolean alwaysTrue =  false;
		
		if(alwaysTrue == true) {
			System.out.println("Always true is true");
		} 
		
		if(alwaysTrue != true) {
			System.out.println("Alwways true is false");
		}
		
		
		int age = 18;
		
		// logic operators  (==, !=, >, <, >=, <= )
		
		if(age == 20) {
			System.out.println("You are 20");
			
		} else if(age > 20) {
			System.out.println("You are older than 20");
		} else {
			System.out.println("You are younger than 20");
		}

	}

}
