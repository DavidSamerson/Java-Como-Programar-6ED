package hierarquia.Herança;

public class CommissionEmployee3 {

	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private Double grossSales;
	private double commissionRate;

	public CommissionEmployee3(String first, String last, String ssn, double sales, double rate) {

		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
		setGrossSales(sales);
		setCommissionRate(rate);

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(Double grossSales) {
		this.grossSales = (grossSales < 0.0) ? 0.0 : grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = (commissionRate > 0.0 && commissionRate < 1.0) ? commissionRate : 0.0;
	}
	
	public double earnings(){
		
		return getCommissionRate()*getGrossSales();
	}
	
	public String toString(){
		
		return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
				"First e Last Name",getFirstName(),getLastName(),
				"Social Security Number",getSocialSecurityNumber(),
				"Gross Sales",getGrossSales(),
				"Commission Rate",getCommissionRate());
	}

}
