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
		grossSales = sales;
		commissionRate = rate;
		
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

	public Double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(Double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	

}
