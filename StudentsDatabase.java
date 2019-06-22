import java.util.Scanner;

class Student {
	double perc[]=new double[50];
	String name[]=new String[50];


	int n;

	void takeInput() {

		Scanner in = new Scanner(System.in);
		System.out.println("\n Enter no of students :");
		n= in.nextInt();

		for(int i=0;i<n;i++)
		{
			System.out.println("Enter your name : ");
  			name[i] = in.next();   

        	System.out.println("Enter your percentage : ");
        	perc[i] = Double.parseDouble(in.next());    	
        }
	}

	void showOutput() {
		for(int i=0;i<n;i++)
		{

			System.out.println("===============================================================================");
			System.out.println("you entered : "+name[i]);  	
        	System.out.println("You entered percentage :"+perc[i]);	
        	System.out.println("===============================================================================");
		}	
	}
}


class StudentsDatabase {
	public static void main(String[] args) {
     Student student = new Student();


     student.takeInput();
     student.showOutput();  

     
	}
}