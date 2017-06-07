package polimorfismo.Geral;

public class HourlyEmployee extends Employee {

	private double ware;
	private double hours;

	public HourlyEmployee(String first, String last, String ssn, double hourlyWage, double hoursWorked) {
		// TODO Auto-generated constructor stub
		super(first, last, ssn);
		setWare(hourlyWage);
		setHours(hoursWorked);
	}

	public double getWare() {
		return ware;
	}

	public void setWare(double ware) {
		this.ware = (ware < 0.0) ? 0.0 : ware;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

}
