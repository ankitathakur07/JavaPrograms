class Add{
	public static void main(String[] args) {
		 int a,b;
		 String operation = args[2];
		 a=Integer.parseInt(args[0]);
		 b=Integer.parseInt(args[1]);
		 System.out.println(operation);
		 
		 switch(operation)
		 {
			 case "+":System.out.println("\n Addition :" + (a+b));
			 			break;

			 case "-":System.out.println("\n Subtraction :" +(a-b));
			 			break;

			 case "*":System.out.println("\n Multiplication :" +(a*b));
			 			break;

			 case "/":System.out.println("\n Division :" +(a/b));
			 			break;

			 default : System.out.println("\n invalid operation");
		}
	
}