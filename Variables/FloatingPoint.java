package Variables;

public class FloatingPoint {
	
	public static void main (String[] args) {
		double wage;
		wage = 1250.70;
		System.out.println("Wage: "+ wage);
		
		// int value = 12.5;             //error
		// System.out.println(value);

		// int value2 = 0.0;             //error
		// System.out.println(value2);

		double test = 125.50;            
		System.out.println("Value: "+ test);

		// int value3 = teste;           //error
		// System.out.println(value3);
		
		int division = 5 / 2;
		System.out.println("Division: " + division);   //int with int operations will return a int as result.
		
		double division2 = 5.0 / 2;
		System.out.println("Division: " + division2); 

		
		int age = 37;
		int sonsAge = age + 10;
		System.out.println("Sons age: " + sonsAge);	//int with double operations will return a double as result

	}

}
