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
	
	public Company() {
		employees = new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee employee) {
		if(employee != null) {
			employees.add(employee);
		}else {
			System.out.println();
		}
	}
}
