package classes.Membros.Static;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf("Employee antes da instanciação: %d\n",Employee.getCount());
		
		Employee e1 = new Employee("Susan","Backer");
		Employee e2 = new Employee("Bob","Blue");
		
		System.out.println("\nEmployee depois da instanciação: ");	
		System.out.printf("Via E1.getCount(): %d\n", e1.getCount());
		System.out.printf("Via E1.getCount(): %d\n", e2.getCount());
		System.out.printf("Via Employee.getCount(): %d\n",Employee.getCount());
		
		System.out.printf("\nEmployee 1: %s %s\nEmployee 2: %s %s \n\n"
				,e1.getFirstName(),e1.getLastName(),e2.getFirstName(),e2.getLastName());
		
		e1 = null;
		e2 = null;
		
		//coleta de lixo
		System.gc();
		
		System.out.printf("\nEmployees depois de System.gc(): %d\n", Employee.getCount());

	}

}
