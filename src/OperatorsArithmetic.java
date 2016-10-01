
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

	}
	
	public static double celsius2Fahrenheit(double celsius) {
		
		double fahrenheit =9.0/5 * celsius +32;
		return fahrenheit; 
		
	}

}
