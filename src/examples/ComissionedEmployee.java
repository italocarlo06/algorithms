package examples;

public class ComissionedEmployee extends Employee {

	private double comissions;
	private int units;
	
	public ComissionedEmployee(String firstName, String lastName, double wage, double comissions) {
		super(firstName, lastName, wage);
		this.comissions = comissions;
	}
	
	public void addSales(int units) {
		this.units = this.units + units;
	}
	
	public double calculatePay() {
		return getWage() + (this.comissions * this.units);
	}

	public double getComissions() {
		return comissions;
	}
	public void setComissions(double comissions) {
		this.comissions = comissions;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}	
}
