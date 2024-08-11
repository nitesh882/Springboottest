package demo1.main;

import demo1.modal.Student;

public class StudentMain {
	public static void main(String [] args) {
		Student st=new Student(301,"nitesh",21,"12","a","male","09-10-2002");
		
		
//		public int id;
//		public String name;
//		public int age;
//		public String classs;
//		public String section;
//		public String gender;
//		public String dob;
		System.out.println(st);
		
		System.out.println(st.getName());
		
		st.setAge(220);
		System.out.println(st);
		System.out.println("After commit first commit we change ");
		
		
	}

}
