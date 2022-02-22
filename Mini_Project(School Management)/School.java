package miniProject;

import java.util.HashMap;
import java.util.LinkedList;

public class School {
	
	public HashMap<String,Integer> Admin_Login()
	{
		HashMap <String,Integer> admin_login=new HashMap<>();
		admin_login.put("admin@123",1234);
		return admin_login;
		
	}
	
	public HashMap<String,Integer> Teacher_Login()
	{
	HashMap <String,Integer> teacher_login=new HashMap<>();
	teacher_login.put("teacher1@123",123);
	teacher_login.put("teacher2@123",123);
	return teacher_login;
	}

	public HashMap<String,Integer> Student_Login()
	{
	HashMap <String,Integer> student_login=new HashMap<>();
	student_login.put("student1@123",123);
	student_login.put("student2@123",123);
	student_login.put("student3@123",123);
	return student_login;
	}
	
	public HashMap<String,Integer> Parent_Login()
	{
	HashMap <String,Integer> parent_login=new HashMap<>();	
	parent_login.put("parent1@123",123);
	parent_login.put("parent2@123",123);
	parent_login.put("parent3@123",123);
	return parent_login;
	}
	
	// Adding Students name list
	public LinkedList<String> getStudentlist()
	{
		LinkedList<String> student_list=new LinkedList<>();
		student_list.add("Rahul");
		student_list.add("Mahesh");
		student_list.add("Dravid");
		return student_list;
	}
	
	
	}
	
