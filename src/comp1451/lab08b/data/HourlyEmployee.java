package comp1451.lab08b.data;

public class HourlyEmployee extends Employee{

	private int hoursWorked;
	private double hourlyWage;
	
	public HourlyEmployee() {
		super(); 
	}
	
	public HourlyEmployee(String firstName, String lastName, int hoursWorked) {
		super(firstName, lastName);
		this.hoursWorked = hoursWorked;
	}
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	@Override
	public String toString() {
		return "HourlyEmployee [hoursWorked=" + hoursWorked + ", HOURLY_WAGE=" + HOURLY_WAGE + "]";
	}
	
	public double calculateMonthlyEarnings(){
		return hoursWorked*HOURLY_WAGE;
	}
}
