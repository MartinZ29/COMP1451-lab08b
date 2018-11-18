/**
 * Lab 08b for COMP 1451 @BCIT
 * 
 * @author Martin
 * @version Nov 12, 2018
 */

package comp1451.lab08b.data;

public class CommissionEmployee extends Employee{

	private double commissionRate;
	private double monthlySalesTotal;
	
	/**
	 * Default constructor to inherit from abstract class
	 */
	public CommissionEmployee() {
		super();
	}

	/**
	 * Overload constructor which has four parameters to the class
	 */
	public CommissionEmployee(String firstName, String lastName, double commissionRate, double monthlySalesTotal) {
		super(firstName, lastName);
		this.commissionRate = commissionRate;
		this.monthlySalesTotal = monthlySalesTotal;
	}

	/**
	 * Accessor
	 */
	public double getCommissionRate() {
		return commissionRate;
	}

	/**
	 * Mutator
	 */
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	/**
	 * Accessor
	 */
	public double getMonthlySalesTotal() {
		return monthlySalesTotal;
	}

	/**
	 * Mutator
	 */
	public void setMonthlySalesTotal(double monthlySalesTotal) {
		this.monthlySalesTotal = monthlySalesTotal;
	}

	@Override
	public String toString() {
		return "CommissionEmployee [commissionRate=" + commissionRate + ", monthlySalesTotal=" + monthlySalesTotal
				+ "]";
	};
	
	/**
	 * method inherits from abstract class to calculate monthly earnings for SalariedEmployee
	 */
	public double calculateMonthlyEarnings(){
		return monthlySalesTotal*commissionRate;
	}
}
