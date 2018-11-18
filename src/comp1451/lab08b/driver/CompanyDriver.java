/**
 * Lab 08b for COMP 1451 @BCIT
 * 
 * @author Martin
 * @version Nov 12, 2018
 */

package comp1451.lab08b.driver;

import java.util.ArrayList;
import comp1451.lab08b.collection.Company;
import comp1451.lab08b.data.*;

public class CompanyDriver {
	

	public static void main(String[] args) {
		
		Company employees = new Company();
		employees.displayAllEmployee();
		employees.addEmployee(new HourlyEmployee("abc","def",40,50));
		employees.addEmployee(new CommissionEmployee("ghi","hjk",0.5,8000));
		employees.addEmployee(new SalariedEmployee("lmn","opq",50000,11));
		employees.displayAllEmployee();
	}

}
