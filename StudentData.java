import java.util.Scanner;

class Student {
	double perc;
	String name;

	void takeInput() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name : ");
  		name = in.next();   

        System.out.println("Enter your percentage : ");
        perc = Double.parseDouble(in.next());    	
	}

	void showOutput() {
		System.out.println("===============================================================================");
		System.out.println("you entered : "+name);  	
        System.out.println("You entered percentage :"+perc);	
        System.out.println("===============================================================================");
	}
}


class StudentData {
	public static void main(String[] args) {
     Student student = new Student();


     student.takeInput();
     student.showOutput();  

     
	}
}