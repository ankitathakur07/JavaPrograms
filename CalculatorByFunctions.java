class Calculator {
	int addNumbers(int a, int b) {
		return a+b;
	}

	int subNumbers(int a, int b) {
		return a-b;
	}

	int mulNumbers(int a,int b) {
		return a*b;
	}

	int divNumbers(int a,int b) {
		return a/b;
	}
}
class CalculatorByFunctions {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		String operation = args[2];
		switch(operation) {
			case "+" : System.out.println("Addition of "+a+" and "+b+" is : "+calculator.addNumbers(a, b)); break;
			case "-" : System.out.println("Subtraction of "+a+" and "+b+ " is " +calculator.subNumbers(a,b));break;
			case "*" : System.out.println("Multiplication of "+a+" and "+b+ " is " +calculator.mulNumbers(a,b)); break;
			case "/" : System.out.println("Division of "+a+" and "+b+ " is " +calculator.divNumbers(a,b)); break;
			default : break;
		}
	}
}