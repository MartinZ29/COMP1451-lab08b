/**
 * Lab 08b for COMP 1451 @BCIT
 * 
 * @author Martin
 * @version Nov 12, 2018
 */

package comp1451.lab08b.data;

public class SalariedEmployee extends Employee{
	
	private double yearlySalary;
	private int exceptedWeeksWorkPerYear;
	
	public SalariedEmployee() {
		super();
	}
	
	public SalariedEmployee(String firstName, String lastName, double yearlySalary, int exceptedWeeksWorkPerYear) {
		super(firstName, lastName);
		this.yearlySalary = yearlySalary;
		this.exceptedWeeksWorkPerYear = exceptedWeeksWorkPerYear;
	}

	public double getYearlySalary() {
		return yearlySalary;
	}

	public void setYearlySalary(double yearlySalary) {
		this.yearlySalary = yearlySalary;
	}

	public int getExceptedWeeksWorkPerYear() {
		return exceptedWeeksWorkPerYear;
	}

	public void setExceptedWeeksWorkPerYear(int exceptedWeeksWorkPerYear) {
		this.exceptedWeeksWorkPerYear = exceptedWeeksWorkPerYear;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [yearlySalary=" + yearlySalary + ", exceptedWeeksWorkPerYear="
				+ exceptedWeeksWorkPerYear + "]";
	}
	
	public double calculateMonthlyEarnings() {
		return yearlySalary/exceptedWeeksWorkPerYear;
	}
}
