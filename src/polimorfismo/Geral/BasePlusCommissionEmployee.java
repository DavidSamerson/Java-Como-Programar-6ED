package polimorfismo.Geral;

public class BasePlusCommissionEmployee extends CommissionEmployee {

	private double baseSalary;

	public BasePlusCommissionEmployee(String first, String last, String ssn, double sales, double rate, double salary) {
		// TODO Auto-generated constructor stub
		super(first, last, ssn, sales, rate);
		setBaseSalary(salary);
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = (baseSalary < 0.0) ? 0.0 : baseSalary;
	}

	public double earnings() {
		return getBaseSalary() + super.earnings();
	}
	
	public String toString(){
		return String.format("%s %s; %s: $%,.2f","Base-salaried",super.toString(),
				"Base Salary",getBaseSalary());
	}

}
