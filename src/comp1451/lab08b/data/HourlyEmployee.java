package comp1451.lab08b.data;

public class HourlyEmployee extends Employee{

	private int hoursWorked;
	private double hourlyWage;
	
	public HourlyEmployee() {
		super(); 
	}
	
	public HourlyEmployee(String firstName, String lastName, int hoursWorked, double hourlyWage) {
		super(firstName, lastName);
		this.hoursWorked = hoursWorked;
		this.hourlyWage = hourlyWage;
	}
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	
	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	@Override
	public String toString() {
		return "HourlyEmployee [hoursWorked=" + hoursWorked + ", hourlyWage=" + hourlyWage + "]";
	}
	
	public double calculateMonthlyEarnings(){
		return hoursWorked*hourlyWage;
	}
}
