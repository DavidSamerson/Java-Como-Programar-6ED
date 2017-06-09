package polimorfismo.Geral;

public abstract class Employee2 implements Payable {
	
	private String firstName;
	private String lastName;
	private String ssn;

	public Employee2(String first, String last, String ssn) {
		// TODO Auto-generated constructor stub
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
	
	public String toString(){
		return String.format("%s %s\nSocial Number: %s", getFirstName(), getLastName(), getSsn());
	}
	

}
