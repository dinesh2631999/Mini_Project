package miniProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Admin {
	
	public static int admin_menu(int temp)
	{
		int choice=0;
		
	      if(temp==1)
	      {
	       System.out.println(" Welcome Admin ");	  
	       System.out.println();
	       
	 	   System.out.println("********************************************************");
	 	   System.out.println(" Choose the operation you want to do :  ");
	 	   System.out.println("  1) Add Student \n 2) Remove Student \n 3) view Student names \n 4) View Timetable \n 5) Edit Timetable \n 6) About Fees  \n 7) Exit    ");
	 	   Scanner scan=new Scanner(System.in);
	 	    choice=scan.nextInt();
	 	   
	      }else {
	    	  System.err.println("The Entered User_Id or Password is wrong  ");
	      }
	      System.out.println("********************************************************");
	      return choice;
	}
	
	
	public static int verification(HashMap<String,Integer> login_list)
	{
		int temp=0;
	 Set<Map.Entry<String,Integer>> list= login_list .entrySet();
	 Scanner scan=new Scanner(System.in);
 	 
 	 System.out.println(" Enter the User_Id : ");
 	 String u_id=scan.next();
 	 System.out.println(" Enter the Password : ");
 	 int pass=scan.nextInt();
 	// int choice=0;
 	 
 	  for( Map.Entry<String,Integer> list1 : list)
 	  {
 		  if (list1.getKey().equals(u_id) && list1.getValue().equals(pass))
 			  temp=1;
 	  }
 	  return temp;
	}
	
	

}
