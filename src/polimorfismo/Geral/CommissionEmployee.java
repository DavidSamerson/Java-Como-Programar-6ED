package polimorfismo.Geral;

public class CommissionEmployee extends Employee {

	private double grossSales;
	private double commissionRate;

	public CommissionEmployee(String first, String last, String ssn, double sales, double rate) {
		// TODO Auto-generated constructor stub
		super(first, last, ssn);
		setGrossSales(sales);
		setCommissionRate(rate);
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = (grossSales < 0.0) ? 0.0 : grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = (commissionRate < 0.0 && commissionRate < 1.0) ? 0.0 : commissionRate;
	}

	public double earnings() {
		return getCommissionRate() * getGrossSales();
	}

	public String toString() {
		return String.format("%s: %s\n%s: $%,.2f; %s: %.2f", 
				"Commission Employee", super.toString(), "Gross Sales",
				getGrossSales(), "Commission Rate", getCommissionRate());
	}

}
