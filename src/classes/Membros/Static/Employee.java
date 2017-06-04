package classes.Membros.Static;

public class Employee {
	
	private String firstName;
	private String lastName;
	private static int count = 0;

	public Employee(String first, String last) {
		// TODO Auto-generated constructor stub
		firstName = first;
		lastName = last;
		
		count ++;
		System.out.printf("Enployee Construtor: %s %s , Count: %d\n", firstName, lastName, count);
	}

	protected void finalize(){
		
		count --;
		System.out.printf("Enployee Construtor: %s %s , Count: %d\n", firstName, lastName, count);
	}
}
