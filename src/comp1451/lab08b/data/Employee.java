/**
 * Lab 08b for COMP 1451 @BCIT
 * 
 * @author Martin
 * @version Nov 12, 2018
 */

package comp1451.lab08b.data;

public abstract class Employee {

	private String firstName;
	private String lastName;
	
	/**
	 * Default constructor
	 */
	public Employee() {
	}
	
	/**
	 * Overload constructor with two parameters pass through
	 * @param firstName
	 * 				- is the first name of the employee
	 * @param lastName
	 * 				- is the last name of the employee
	 */
	public Employee(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
	}
	
	/**
	 * return first name of the employee
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Mutator of firstName
	 * @param firstName
	 * 				- is the first name of employee
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Accessor of lastName
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Mutator of lastName
	 * @param lastName
	 * 				- is the last name of the employee
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	/**
	 * toString method to check variables
	 */
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	/**
	 * abstract method 
	 */
	public abstract double calculateMonthlyEarnings();
}
