package hierarquia.Herança;

public class BPCET4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasePlusCommissionEmployee4 employee = new BasePlusCommissionEmployee4("BOB",
				"Lewis", "333-33-3333", 5000, .04, 300);
		
		System.out.println("Informações sobre os métodos:");
		
		System.out.printf("\nNome: %s %s\n",employee.getFirstName(), employee.getLastName());
		System.out.printf("Numero Segurança social: %s\n",employee.getSocialSecurityNumber());
		System.out.printf("Gross sales: %s\n",employee.getGrossSales() );
		System.out.printf("Commission rate: %s \n",employee.getCommissionRate() );
		System.out.printf("Base Salary: %s \n",employee.getBaseSalary() );
		
		employee.setBaseSalary(1000);
		
		System.out.printf("\n%s: \n\n%s\n", "Updated employee information",
				employee.toString());
		

	}

}
