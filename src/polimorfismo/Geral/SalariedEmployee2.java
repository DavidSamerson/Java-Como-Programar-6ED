package polimorfismo.Geral;

public class SalariedEmployee2 extends Employee2{
	
	private double weeklySalary;

	public SalariedEmployee2(String first, String last,String ssn, double salary) {
		// TODO Auto-generated constructor stub
		super(first, last, ssn);
		setWeeklySalary(salary);
	}
	
	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary < 0.0 ? 0.0 : weeklySalary;
	}

	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return getWeeklySalary();
	}
	
	public String toString(){
		return String.format("Salaried Employee: %s\n%s: $%,.2f", super.toString(),"Weekly Salary", getWeeklySalary());
	}

}
