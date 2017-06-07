package polimorfismo.Geral;

public class SalariedEmployee extends Employee {
	
	private double salary;

	public SalariedEmployee( String firstName, String lastName, String ssn, double salary ) {
		// TODO Auto-generated constructor stub
		super(firstName, lastName, ssn);
		setSalary(salary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
