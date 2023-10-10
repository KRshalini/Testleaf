package methodoverload;

public class Student {
	public void getStudentInfo(int id) {
		System.out.println("The id is: "+id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("Id: "+id+"name is: "+name);
	}
	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("Email is"+email+"phonenumber: "+phoneNumber);
	}
	public static void main(String[] args) {
		Student details = new Student();
		details.getStudentInfo(14);
		details.getStudentInfo(14,"Shalini");
		details.getStudentInfo("kopula@gmail.com",9988776655l);
		
	}

}
