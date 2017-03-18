package OneToOne;

public class OneToOneStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		
		student.setFirstName("Md.");
		student.setMiddleName("Hannan");
		student.setLastName("Talukder");
		
		StudentAddress studentAddress = new StudentAddress();
		
		studentAddress.setHouseNumber(123);
		studentAddress.setHouseRoad(125);
		studentAddress.setThana("Mirpur");
		studentAddress.setZipCode("12345");
		
		student.setAddress(studentAddress);
		System.out.println(student.getFirstName());
		System.out.println(student.getMiddleName());
		System.out.println(student.getLastName());
		System.out.println(student.getAddress().getHouseNumber());
		System.out.println(student.getAddress().getHouseRoad());
		System.out.println(student.getAddress().getThana());
		System.out.println(student.getAddress().getZipCode());
		
		
	}

}
