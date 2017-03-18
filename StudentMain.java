package OneToOne;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		student.setFirstName("Md.");
		student.setMiddleName("Hannan");
		student.setLastName("Talukder");
		
		Department department = new Department();
		department.setDepName("Computer Science");
		department.setDepLocation("CSE Building");
		
		student.setStudentDepartment(department);
		
		Course course1 = new Course();
		course1.setCourseName("Problem Solving");
		course1.setCourseCode("CSE121");
		course1.setCourseCredit(3.0);
		
		Course course2 = new Course();
		course2.setCourseName("Object Oriented Programming");
		course2.setCourseCode("CSE321");
		course2.setCourseCredit(3.0);
		
		StudentAddress studentAddress = new StudentAddress();
		studentAddress.setHouseNumber(123);
		studentAddress.setHouseRoad(125);
		studentAddress.setThana("Mirpur");
		studentAddress.setZipCode("12345");
		
		student.setAddress(studentAddress);
		
		ArrayList<Course> courseList = new ArrayList<Course>();
		department.setCourseList(courseList);
		
		courseList.add(course1);
		courseList.add(course2);
		
		student.setAddress(studentAddress);
		
		System.out.println(student.getStudentDepartment().getCourseList().get(0).getCourseName());
		System.out.println(student.getStudentDepartment().getDepName());
		System.out.println(student.getAddress().getHouseNumber());
		
		
		
	}

}
