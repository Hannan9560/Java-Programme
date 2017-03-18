package OneToOne;

import java.util.ArrayList;

public class OneToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department department = new Department();
		
		department.setDepName("Computer Science");
		department.setDepLocation("CSE Building");
		
		Course course1 = new Course();
		
		course1.setCourseName("Problem Solving");
		course1.setCourseCode("CSE121");
		course1.setCourseCredit(3.0);
		
		Course course2 = new Course();
		
		course2.setCourseName("Object Oriented Programming");
		course2.setCourseCode("CSE321");
		course2.setCourseCredit(3.0);
		
		ArrayList<Course> courseList = new ArrayList<Course>();
		
		department.setCourseList(courseList);
		
		courseList.add(course1);
		courseList.add(course2);
		
		System.out.println(department.getDepName());
		System.out.println(department.getDepLocation());
		
		for(Course course : courseList)
		{
			System.out.println(course.getCourseName());
			System.out.println(course.getCourseCode());
			System.out.println(course.getCourseCredit());
		}
		
		
	}

}
