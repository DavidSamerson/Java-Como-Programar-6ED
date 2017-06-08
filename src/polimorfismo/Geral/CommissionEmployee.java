package polimorfismo.Geral;

public class CommissionEmployee extends Employee {
	
	private double grossSales;
	private double commissionRate;

	public CommissionEmployee(String first, String last, String ssn, double sales, double rate) {
		// TODO Auto-generated constructor stub
		super(first,last,ssn);
		setGrossSales(sales);
		setCommissionRate(rate);
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	
}
