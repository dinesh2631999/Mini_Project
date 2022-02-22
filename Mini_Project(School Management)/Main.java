package miniProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 //Teacher.view_Mark();
		Scanner scan=new Scanner(System.in);
		HashMap<String,Integer> login_list=new HashMap<>();
		LinkedList<String> student_list=new LinkedList<>();
		
		File file = new File("E:\\java\\kumar\\src\\table.properties");
		FileReader fr;
		
		   //loading .properties file into prop for timetable purpose
			fr = new FileReader(file);
			Properties prop=new Properties();
			prop.load(fr);
		
		
		
		 //transferring student name list from school class 
	 	School scl=new School();
        student_list=scl.getStudentlist();
        
      char continuation;
      char repeat;
      do
      {
		System.out.println(" Choose who you are?");
		System.out.println(" 1) Admin \n 2) Teacher  \n 3) Student \n 4) Parent  ");
		int option=scan.nextInt();
		
		 switch(option)
		 {
		 case 1 :
			 	 // int temp=0;
			      
			 	  School school=new School();
			 	  login_list=  school.Admin_Login();
			 	   int temp=Admin.verification(login_list);
			 	   do
			 	   {   
			 	  int choice=Admin.admin_menu(temp);
			 	
			      switch(choice)
			      {
			      
			      case 1 : 
			               System.out.println("How many Student you want to add : ");
			               int add_count=scan.nextInt();
			               
			               for(int i=0;i<add_count;i++)
			               {
			            	   System.out.println("Enter the Student name you want to add : ");
			            	   String stud_name=scan.next();
			            	   student_list.add(stud_name);
			               }
			               System.out.println(student_list);
			      break;
			      
			      case 2 : int temp1=0;
			       		   System.out.println("Enter the Student name you want to remove : ");
			       		   String del_name=scan.next();
			       		   
			       		   for(String names : student_list)
			       		   {
			       			   if(names.equals(del_name))
			       			   {
			       				student_list.remove(del_name);
			       				temp1=1;
			       				break;
			       			   }
			       		   }
			       		   
			       		   if(temp1==1)
			       		   {
			       			   System.out.println(" The requested name is Deleted.");
			       		   }else
			       		   {
			       			System.err.println(" The requested name is not found.");
			       		   }
			      break;
			      
			      case 3 : int i=1;
			               for(String names : student_list)
			               {
			            	   System.out.println(i +")  "+names);
			            	   ++i;
			               }
			      break;
			      case 4 : Teacher.table(prop);
			      break;
			      case 5 :Teacher.edit_Table(prop);
			      break;
			      case 6 : 
			      break;
			      case 7 : System.exit(0);
			      break;
			      default : System.out.println(" Pls enter the valid option .");
			      }
			      
			      System.out.println("if you want to continue press y");
			       continuation=scan.next().charAt(0);
			      }while(continuation=='y');
		 break;	 	 
		 case 2 : 
			 	  HashMap<String,Integer> teacher_login=new HashMap<>();
		 		  School school1=new School();
		 		  teacher_login=school1.Teacher_Login();
		 		   int temp1=Admin.verification(teacher_login);
		 		  do
			 	  {
		 		      int choice1=Teacher.teacher_menu(temp1);
			      switch(choice1)
			      {
			      
			      case 1 : int i=1;
	               		   for(String names : student_list)
	               		   {
	               			   System.out.println(i +")  "+names);
	               			   ++i;
	               		   }
	              break;
			      case 2 : Teacher.table(prop);
			      break;
			      
			      case 3 : Teacher.edit_Table(prop);
			      break;
			      
			      case 4 : Teacher.view_Mark();
			      break;
			      
			      case 5 : System.exit(0);
			      break;
			      
			      default : System.out.println(" Pls enter the valid option .");
			      
		 }
 
			      
			      System.out.println("if you want to continue press y");
			       continuation=scan.next().charAt(0);
			      }while(continuation=='y');
		 break;		  
		 case 3:  
		 		  HashMap<String,Integer> student_login=new HashMap<>();
		 		  School school2=new School();
		 		 student_login=school2.Student_Login();
		 		  int temp2=Admin.verification(student_login);
		 		  do
		 		  {
		 			 int choice2=Student.student_menu(temp2);
		 			  switch(choice2)
		 			  {
	      
		 			  case 1 : Teacher.view_Mark();
		 			  break;
		 			  
		 			  case 2 : Teacher.table(prop);
		 			  break;
		 			  
		 			  case 3 : System.exit(0);
		 			  break;
		 			  
		 			 default : System.out.println(" Pls enter the valid option .");
		 			 }
				      
				      System.out.println("if you want to continue press y");
				       continuation=scan.next().charAt(0);
				      }while(continuation=='y');
		 break;
		 case 4 :  
		  		   HashMap<String,Integer> parent_login=new HashMap<>();
		  		   School school3=new School();
		  		   parent_login=school3.Parent_Login();
		  		   int temp3=Admin.verification(parent_login);
		  		   do
		  		   {
		  			 int choice3=Parent.parent_menu(temp3);
		  			   switch(choice3)
		  			   {
 
		  			   case 1 : Teacher.view_Mark();
		  			   break;
			  
		  			   case 2 : Teacher.table(prop);
		  			   break;
			  
		  			   case 3 : System.exit(0);
		  			   break;
			  
		  			   default : System.out.println(" Pls enter the valid option .");
		  			   }
		      
		  			   System.out.println("if you want to continue press y");
		  			   continuation=scan.next().charAt(0);
		  		   }while(continuation=='y');
		break;
		default : System.out.println(" Pls enter the valid option .");		 
		     }
           System.out.println(" if you want to continue from main menu ,then press k .");
           repeat=scan.next().charAt(0);
      }while(repeat=='k');

	}
}

