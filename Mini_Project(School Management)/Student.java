package miniProject;

import java.util.Scanner;

public class Student  {
	
	public static int student_menu(int temp2)
	{
		int choice2=0;
		 if(temp2==1)
		  {
			  System.out.println(" Welcome Student ");	  
			  System.out.println();

			  System.out.println("********************************************************");
			  System.out.println(" Choose the operation you want to do :  ");
			  System.out.println(" 1) view Student Marks \n 2) View Timetable \n 3) Exit"); 
			  Scanner scan=new Scanner(System.in);
			  choice2=scan.nextInt();

		  }else {
			  System.err.println("The Entered User_Id or Password is wrong  ");
		  }

		  System.out.println("********************************************************");
		  return choice2;
	}
	
	

}
