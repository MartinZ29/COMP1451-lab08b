/**
 * Lab 08b for COMP 1451 @BCIT
 * 
 * @author Martin
 * @version Nov 12, 2018
 */

package comp1451.lab08b.driver;

import comp1451.lab08b.collection.Company;
import comp1451.lab08b.data.*;

public class CompanyDriver {
	

	public static void main(String[] args) {
		
		Company employees = new Company();
		
		//test empty company error msg;
		employees.displayAllEmployee();
		
		//add three types of employees to company;
		HourlyEmployee employeeOne = new HourlyEmployee("abc","def",40,50);
		CommissionEmployee employeeTwo = new CommissionEmployee("ghi","hjk",0.5,8000);
		SalariedEmployee employeeThree = new SalariedEmployee("lmn","opq",50000,11);
		employees.addEmployee(employeeOne);
		employees.addEmployee(employeeTwo);
		employees.addEmployee(employeeThree);
		employees.displayAllEmployee();
		
		//remove one employee from company
		employees.removeEmpolyee(employeeThree);
		employees.displayAllEmployee();
	}

}
