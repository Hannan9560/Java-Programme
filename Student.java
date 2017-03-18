package OneToOne;

public class Student {
	private String firstName;
	private String middleName;
	private String lastName;
	private StudentAddress address;
	private Department studentDepartment;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public StudentAddress getAddress() {
		return address;
	}
	public void setAddress(StudentAddress address) {
		this.address = address;
	}
	public Department getStudentDepartment() {
		return studentDepartment;
	}
	public void setStudentDepartment(Department studentDepartment) {
		this.studentDepartment = studentDepartment;
	}
	
	
}
