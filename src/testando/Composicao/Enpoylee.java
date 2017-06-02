package testando.Composicao;

public class Enpoylee {
	
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Date hireDate;
	
	public Enpoylee (String first, String last, Date dateOfBirth, Date dateOfHide )
	{
		firstName = first;
		lastName = last;
		birthDate = dateOfBirth;
		hireDate = dateOfHide;
	}
	
	public String toString()
	{
		return String.format("%s, %s hired: %s ; BirthDAY: %s", lastName, firstName, hireDate, birthDate);	
	}
}
