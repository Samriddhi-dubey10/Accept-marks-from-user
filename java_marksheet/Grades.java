package java_marksheet;
import java.util.Scanner;
public class Grades {

	public static void main(String[] args) {
		
			 
				int marks;
		

		 
				Scanner obj = new Scanner(System.in);
				System.out.println("Enter the value of subject");
				marks = obj.nextInt();
				if(marks>40) {
					System.out.println("Pass");
				}
				else {
					System.out.println("Fail");
				}
			
			

		
		// TODO Auto-generated method stub

	}

}
