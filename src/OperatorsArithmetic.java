
class OperatorsArithmetic {

	public static void main(String[] args) {

//		int a = 10;
//		int b = 5;
//		int result = a + b;
		
//		a = a+1;
//		a++;
//		a += 1; 

//		System.out.println(a + " + " + b + " = " + result);
//		System.out.println(a + " - " + b + " = " + (a - b));
//		System.out.println(a + " * " + b + " = " + (a * b));
//		System.out.println(a + " / " + b + " = " + (a / b));
//		System.out.println(a + " % " + b + " = " + (a % b));
		
		double tempF = celsius2Fahrenheit(26.0);
		
		System.out.println("fahrenheit:" + tempF);
		
		double tempC =fahrenheit2Celsius(tempF);
		System.out.println("fahrenheit: " + tempF +"--> celsius:" + tempC);

	}
	
	public static double celsius2Fahrenheit(double celsius) {
		
		double fahrenheit =9.0/5 * celsius +32;
		return fahrenheit; 
		
	}
	public static double fahrenheit2Celsius(double fahrenheit) {
		double celsius =(fahrenheit -32)/ (9.0/5);
		return celsius; 
	}
	}


