package comp1451.lab08b.data;

public class SalariedEmployee extends Employee{
	
	private double yearlySalary;
	private int exceptedWeeksWorkPerYear;
	
	public SalariedEmployee() {
		super();
	}
	
	public SalariedEmployee(double yearlySalary, int exceptedWeeksWorkPerYear) {
		super();
		this.yearlySalary = yearlySalary;
		this.exceptedWeeksWorkPerYear = exceptedWeeksWorkPerYear;
	}

	public double getYearlySalary() {
		return yearlySalary;
	}

	public void setYearlySalary(double yearlySalary) {
		this.yearlySalary = yearlySalary;
	}

	public int getExceptedWeeksWorkPerYear() {
		return exceptedWeeksWorkPerYear;
	}

	public void setExceptedWeeksWorkPerYear(int exceptedWeeksWorkPerYear) {
		this.exceptedWeeksWorkPerYear = exceptedWeeksWorkPerYear;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [yearlySalary=" + yearlySalary + ", exceptedWeeksWorkPerYear="
				+ exceptedWeeksWorkPerYear + "]";
	}
	
	
}
