package org.college;



public class Student extends Department {
	
		public void studentName() {
			System.out.println("Shalini");	
		}
		public void studentDept() {
			System.out.println("cse");
			
		}
		public void studentId() {
			System.out.println("14");
			
		}
		public static void main(String[] args) {
			Student stu = new Student();
			stu.studentName();
			stu.studentDept();
			stu.studentId();
			stu.collegCode();
			stu.collegeName();
			stu.collegeRank();
			stu.deptName();
		}

	}



