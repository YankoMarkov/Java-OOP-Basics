package mankind;

public class Worker extends Human {
	private double weekSalary;
	private double workHoursPerDay;
	
	public Worker(String firstName, String lastName, double weekSalary, double workHoursPerDay) {
		super(firstName, lastName);
		this.setWeekSalary(weekSalary);
		this.setWorkHoursPerDay(workHoursPerDay);
	}
	
	public double getWeekSalary() {
		return weekSalary;
	}
	
	private void setWeekSalary(double weekSalary) {
		if (weekSalary < 10) {
			throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
		}
		this.weekSalary = weekSalary;
	}
	
	public double getWorkHoursPerDay() {
		return workHoursPerDay;
	}
	
	private void setWorkHoursPerDay(double workHoursPerDay) {
		if (workHoursPerDay < 1 || workHoursPerDay > 12) {
			throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
		}
		this.workHoursPerDay = workHoursPerDay;
	}
	
	@Override
	protected void setLastName(String lastName) {
		if (lastName.length() < 3) {
			throw new IllegalArgumentException("Expected length more than 3 symbols!Argument: lastName");
		}
		super.setLastName(lastName);
	}
	
	public double getSalaryPerHours() {
		return (this.getWeekSalary() / 7) / this.getWorkHoursPerDay();
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("First Name: ").append(this.getFirstName()).append("\n");
		result.append("Last Name: ").append(this.getLastName()).append("\n");
		result.append(String.format("Week Salary: %.2f", this.getWeekSalary())).append("\n");
		result.append(String.format("Hours per day: %.2f", this.getWorkHoursPerDay())).append("\n");
		result.append(String.format("Salary per hour: %.2f", this.getSalaryPerHours()));
		return result.toString();
	}
}
