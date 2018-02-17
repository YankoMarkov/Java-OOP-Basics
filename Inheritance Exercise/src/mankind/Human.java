package mankind;

public class Human {
	private String firstName;
	private String lastName;
	
	public Human(String firstName, String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	private void setFirstName(String firstName) {
		if (firstName.charAt(0) < 65 || firstName.charAt(0) > 90) {
			throw new IllegalArgumentException("Expected upper case letter!Argument: firstName");
		}
		if (firstName.length() < 4) {
			throw new IllegalArgumentException("Expected length at least 4 symbols!Argument: firstName");
		}
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	protected void setLastName(String lastName) {
		if (lastName.charAt(0) < 65 || lastName.charAt(0) > 90) {
			throw new IllegalArgumentException("Expected upper case letter!Argument: lastName");
		}
		if (lastName.length() < 3) {
			throw new IllegalArgumentException("Expected length at least 3 symbols!Argument: lastName");
		}
		this.lastName = lastName;
	}
}
