package examples;
public class Employee {
	
	private String firstName;
	private String lastName;
	private double wage;
	
	public Employee(String firstName, String lastName, double wage) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.wage = wage;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}	
}