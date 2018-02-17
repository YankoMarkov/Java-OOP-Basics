package mankind;

public class Student extends Human {
	private String facultyNumber;
	
	public Student(String firstName, String lastName, String facultyNumber) {
		super(firstName, lastName);
		this.setFacultyNumber(facultyNumber);
	}
	
	public String getFacultyNumber() {
		return this.facultyNumber;
	}
	
	private void setFacultyNumber(String facultyNumber) {
		if (facultyNumber.length() < 5 || facultyNumber.length() > 10) {
			throw new IllegalArgumentException("Invalid faculty number!");
		}
		this.facultyNumber = facultyNumber;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("First Name: ").append(this.getFirstName()).append("\n");
		result.append("Last Name: ").append(this.getLastName()).append("\n");
		result.append("Faculty number: ").append(this.getFacultyNumber());
		return result.toString();
	}
}
