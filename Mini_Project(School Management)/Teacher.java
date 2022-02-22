package miniProject;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

public class Teacher {
	
	
	private float TAMIL;
	private float ENGLISH;
	private float MATHS;
	private float SCIENCE;
	private float SOCIAL;
	
	

	public Teacher(float TAMIL, float ENGLISH, float MATHS, float SCIENCE, float SOCIAL) {
		super();
		this.TAMIL = TAMIL;
		this.ENGLISH = ENGLISH;
		this.MATHS = MATHS;
		this.SCIENCE = SCIENCE;
		this.SOCIAL = SOCIAL;
	}
	
	public float getTAMIL() {
		return TAMIL;
	}

	public void setTAMIL(float tAMIL) {
		TAMIL = tAMIL;
	}

	public float getENGLISH() {
		return ENGLISH;
	}

	public void setENGLISH(float eNGLISH) {
		ENGLISH = eNGLISH;
	}

	public float getMATHS() {
		return MATHS;
	}

	public void setMATHS(float mATHS) {
		MATHS = mATHS;
	}

	public float getSCIENCE() {
		return SCIENCE;
	}

	public void setSCIENCE(float sCIENCE) {
		SCIENCE = sCIENCE;
	}

	public float getSOCIAL() {
		return SOCIAL;
	}

	public void setSOCIAL(float sOCIAL) {
		SOCIAL = sOCIAL;
	}

	
	public String toString() {
		return "Marks - [TAMIL=" + TAMIL + ", ENGLISH=" + ENGLISH + ", MATHS=" + MATHS + ", SCIENCE=" + SCIENCE
				+ ", SOCIAL=" + SOCIAL + "]";
	}
	
	
	public static void table(Properties prop)
	{
		
	
	   
	    System.out.println("-------------------------------------------------------------------");
	    System.out.println("        prd1   |prd2   |prd3   |prd4   |prd5   |prd6   |prd7       |");
	    System.out.println("-------------------------------------------------------------------");
	  for(int i=1;i<=5;i++)
	  {
		  System.out.print(" Day-"+i);
		  for(int j=1;j<=7;j++)
		  {
			  
		  System.out.print(" |"+ prop.getProperty(""+i+""+j+"p")+"  " );
		  }
		  System.out.println();
	  }
	  System.out.println("-------------------------------------------------------------------");
	    
		}
	
	public static void edit_Table(Properties prop)
	{
		//Teacher.table();
	    Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the day no. with period no.  [for eg:- to change day 1,period 1 then enter 11]");
		int op=scan.nextInt();
		System.out.println("Enter any of the period from the following : ");
		System.out.println("              TAMIL , ENGLISH , MATHS , SCIENCE , SOCIAL , ART , PET   ");
		String subject=scan.next();
		String temp=""+op+"p";
		
		 prop.setProperty(temp,subject);
		  }
	
	public static void view_Mark()
	{
		Teacher student1=new Teacher(51,84,63,52,66);
		Teacher student2=new Teacher(52,85,64,54,63);
		Teacher student3=new Teacher(53,86,65,56,60);
		
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the Student name for marks : ");
		String sname=scan.next();
		
		if(sname.equals("Rahul"))
		{
			System.out.println(" Marks of Rahul : ");
			System.out.println("         "+ student1);
		}else if(sname.equals("Mahesh"))
		{
			System.out.println(" Marks of Mahesh : ");
			System.out.println("         "+ student2);
		}else if(sname.equals("Dravid"))
		{
			System.out.println(" Marks of Dravid : ");
			System.out.println("         "+ student3);
		}else 
		{
			System.out.println(" invalid name .");
		}
		
	}
	
	public static int teacher_menu(int temp1)
	{
		int choice1=0;
		 if(temp1==1)
	      {
	       System.out.println(" Welcome Teacher ");	  
	       System.out.println();
	       
	 	   System.out.println("********************************************************");
	 	   System.out.println(" Choose the operation you want to do :  ");
	 	   System.out.println(" 1) view Student names \n 2) View Timetable \n 3) Edit Timetable \n 4) View Marks \n 5) Exit"); 
	 	   Scanner scan=new Scanner(System.in);
	 	   choice1=scan.nextInt();
	 	   
	      }else {
	    	  System.err.println("The Entered User_Id or Password is wrong  ");
	      }
	      
	      System.out.println("********************************************************");
	      return choice1;
	}
	
	}
