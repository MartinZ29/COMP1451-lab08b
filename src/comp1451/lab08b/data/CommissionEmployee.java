package comp1451.lab08b.data;

public class CommissionEmployee extends Employee{

	private double commissionRate;
	private double monthlySalesTotal;
	
	
	public CommissionEmployee() {
		super();
	}

	public CommissionEmployee(String firstName, String lastName, double commissionRate, double monthlySalesTotal) {
		super(firstName, lastName);
		this.commissionRate = commissionRate;
		this.monthlySalesTotal = monthlySalesTotal;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	public double getMonthlySalesTotal() {
		return monthlySalesTotal;
	}

	public void setMonthlySalesTotal(double monthlySalesTotal) {
		this.monthlySalesTotal = monthlySalesTotal;
	}

	@Override
	public String toString() {
		return "CommissionEmployee [commissionRate=" + commissionRate + ", monthlySalesTotal=" + monthlySalesTotal
				+ "]";
	};
	
	public double calculateMonthlyEarnings(){
		return monthlySalesTotal*commissionRate;
	}
}
