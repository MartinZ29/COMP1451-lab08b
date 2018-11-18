/**
 * Lab 08b for COMP 1451 @BCIT
 * 
 * @author Martin
 * @version Nov 12, 2018
 */

package comp1451.lab08b.data;

public class HourlyEmployee extends Employee{

	private int hoursWorked;
	private double hourlyWage;
	
	/**
	 * Default constructor to inherit from abstract class
	 */
	public HourlyEmployee() {
		super(); 
	}
	
	/**
	 * Overload constructor which has four parameters to the class
	 */
	public HourlyEmployee(String firstName, String lastName, int hoursWorked, double hourlyWage) {
		super(firstName, lastName);
		this.hoursWorked = hoursWorked;
		this.hourlyWage = hourlyWage;
	}
	
	/**
	 * Accessor
	 */
	public int getHoursWorked() {
		return hoursWorked;
	}
	
	/**
	 * Mutator
	 */
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	/**
	 * Accessor
	 */
	public double getHourlyWage() {
		return hourlyWage;
	}

	/**
	 * Mutator
	 */
	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	@Override
	public String toString() {
		return "HourlyEmployee [hoursWorked=" + hoursWorked + ", hourlyWage=" + hourlyWage + "]";
	}
	
	/**
	 * method inherits from abstract class to calculate monthly earnings for SalariedEmployee
	 */
	public double calculateMonthlyEarnings(){
		return hoursWorked*hourlyWage;
	}
}
