package Unit_01;


/* Problem Statement: P7_SwitchStatements: 
   Create a switch statement [Manual], In Which:
	 a. When you pass 1 your program would print current year
	 b. When you pass 2 your program would print current month
	 c. When you pass 3 your program would print current day
	 d. When you pass 4 your program would print Not applicable 
 * */

import java.util.Scanner;

public class P7_SwitchStatement {

	public static void main(String[] args) {
		
		SwitchStatements obj = new SwitchStatements();
		obj.switchStatements();

	}

}

class SwitchStatements {
	void switchStatements() {
		
		Scanner sc= new Scanner(System.in);
		int choice;
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("The current year is: 2022");
				break;
			case 2:
				System.out.println("The current month is: april");
				break;
			case 3:
				System.out.println("The current day is: 9");
				break;
			default:
				System.out.println("Not Applicable");
		}
	}
}