package quest3;

public class Quest3 {
	
	public static void main(String[]args) {
		int number = 5;
		System.out.println("The factorial of " + number +"is: ");
		System.out.println(factorial(number));
		
	}
	
	public static int factorial(int value) {
		int factorial - value;
		while(value>1 ) {
			factorial = factorial *(value-1);
			value--;
		}
		
		return factorial;
	}

}
