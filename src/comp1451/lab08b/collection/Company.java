/**
 * Lab 08b for COMP 1451 @BCIT
 * 
 * @author Martin
 * @version Nov 12, 2018
 */

package comp1451.lab08b.collection;

import java.util.ArrayList;

import comp1451.lab08b.data.Employee;

public class Company {

	private ArrayList<Employee> employees;
	
	/**
	 * Default constructor to initialize ArrayList
	 */
	public Company() {
		employees = new ArrayList<Employee>();
	}
	
	/**
	 * Add employees to the Company
	 * @param employee
	 * 				- is the employee Object to add to ArrayList
	 */
	public void addEmployee(Employee employee) {
		if(employee != null) {
			employees.add(employee);
		}else {
			System.out.println();
		}
	}
	
	/**
	 * Remove employee Object from the Company
	 * @param employee
	 * 				- is the employee Obj
	 */
	public void removeEmpolyee(Employee employee) {
		if(employee != null) {
			employees.remove(employee);
		}else {
			System.out.println();
		}
	}
	
	/**
	 * Display all employee information of names and monthly earnings
	 */
	public void displayAllEmployee() {
		if(employees != null && employees.size()>0) {
			for(Employee e : employees) {
				System.out.println("Employee [firstName = " + e.getFirstName() + ", lastName= " + e.getLastName() + " , monthlyEarnings = " + e.calculateMonthlyEarnings() + "]");
			}
		}else {
			System.out.println("The company has no employee.");
		}
	}
	
}
