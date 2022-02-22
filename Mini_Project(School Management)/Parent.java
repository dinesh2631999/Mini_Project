package miniProject;

import java.util.Scanner;

public class Parent {
	
	public static int parent_menu(int temp3)
	{
		int choice3=0;
		if(temp3==1)
		   {
			   System.out.println(" Welcome Parent ");	  
			   System.out.println();

			   System.out.println("********************************************************");
			   System.out.println(" Choose the operation you want to do :  ");
			   System.out.println(" 1) view Student Marks \n 2) View Timetable \n 3) Exit"); 
			   Scanner scan=new Scanner(System.in);
;			   choice3=scan.nextInt();

		   }else {
			   	System.err.println("The Entered User_Id or Password is wrong  ");
		   }

		   System.out.println("********************************************************");
		   return choice3;
	}

}
