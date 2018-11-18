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
	
	public CompanyDriver() {
		super();
	}
	
	public static void main(String[] args) {
		
		new CompanyDriver().test();
		
	}
	
	public void test() {
		Company employees = new Company();
		employees.displayAllEmployee();
	}

}
