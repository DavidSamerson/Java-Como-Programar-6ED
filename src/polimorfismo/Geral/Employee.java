package polimorfismo.Geral;

public abstract class Employee {
	
	private String firstName;
	private String lastName;
	private String ssn;
	
	public Employee(String first, String last, String ssn){
		
		firstName = first;
		lastName = last;
		this.ssn = ssn;
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

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public abstract String toString();
	
	

}
