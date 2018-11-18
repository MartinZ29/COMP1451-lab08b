/**
 * Lab 08b for COMP 1451 @BCIT
 * 
 * @author Martin
 * @version Nov 12, 2018
 */

package comp1451.lab08b.data;

public class SalariedEmployee extends Employee{
	
	private double yearlySalary;
	private int expectedWeeksWorkPerYear;
	
	/**
	 * Default constructor to inherit from abstract class
	 */
	public SalariedEmployee() {
		super();
	}
	
	/**
	 * Overload constructor which has four parameters to the class
	 * @param firstName
	 * 				- is the first name of the employee
	 * @param lastName
	 * 				- is the last name of the employee
	 * @param yearlySalary
	 * 				- is the yearly salary of the employee
	 * @param expectedWeeksWorkPerYear
	 * 				- is the expected weeks worked per year for the employee
	 */
	public SalariedEmployee(String firstName, String lastName, double yearlySalary, int expectedWeeksWorkPerYear) {
		super(firstName, lastName);
		setYearlySalary(yearlySalary);
		setExpectedWeeksWorkPerYear(expectedWeeksWorkPerYear);
	}
	
	/**
	 * Accessor of yearlySalary
	 * @return yearlySalary
	 */
	public double getYearlySalary() {
		return yearlySalary;
	}

	/**
	 * Mutator of yearlySalary
	 * @param yearlySalary
	 * 				- - is the yearly salary of the employee
	 */
	public void setYearlySalary(double yearlySalary) {
		this.yearlySalary = yearlySalary;
	}

	/**
	 * Accessor of expectedWeeksWorkPerYear
	 * @return expectedWeekWorkPerYear
	 */
	public int getExpectedWeeksWorkPerYear() {
		return expectedWeeksWorkPerYear;
	}

	/**
	 * Mutator of expectedWeeksWorkPerYear
	 * @param expectedWeeksWorkPerYear
	 * 								- is the expected weeks worked per year for the employee
	 */
	public void setExpectedWeeksWorkPerYear(int expectedWeeksWorkPerYear) {
		this.expectedWeeksWorkPerYear = expectedWeeksWorkPerYear;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [yearlySalary=" + yearlySalary + ", expectedWeeksWorkPerYear="
				+ expectedWeeksWorkPerYear + "]";
	}
	
	/**
	 * method inherits from abstract class to calculate monthly earnings for SalariedEmployee
	 */
	public double calculateMonthlyEarnings() {
		return yearlySalary/expectedWeeksWorkPerYear*(52/12);
	}
}
