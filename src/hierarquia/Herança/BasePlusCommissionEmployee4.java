package hierarquia.Herança;

public class BasePlusCommissionEmployee4 extends CommissionEmployee3 {

	private double baseSalary;

	public BasePlusCommissionEmployee4(String first, String last, String ssn, double sales, double rate,
			double salary) {
		// TODO Auto-generated constructor stub
		super(first, last, ssn, sales, rate);
		setBaseSalary(salary);
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double Salary) {
		this.baseSalary = (Salary < 0.0) ? 0.0 : Salary;
	}
	
	public double earnings(){
		return getBaseSalary()*super.earnings();
	}
	
	public String toString(){
		return String.format("%s %s\n%s: %.2f", "Base-Salaried",super.toString(),"Base Salary", getBaseSalary());
	}

}
