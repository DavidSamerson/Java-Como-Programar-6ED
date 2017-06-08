package polimorfismo.Geral;

public class PayrollSystemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SalariedEmployee se = new SalariedEmployee("Jonh", "Smith", "111-11-1111", 800.00);
		HourlyEmployee he = new HourlyEmployee("Karen", "Prince", "222-222-2222", 16.75, 40);
		CommissionEmployee ce = new CommissionEmployee("Sue", "Jones", "333-333-3333", 10000, .06);
		BasePlusCommissionEmployee bpce = new BasePlusCommissionEmployee("Bob", "Lewins", "444-444-4444", 50000, .04,
				300);
		
		System.out.println("Processo Individual: \n");
		System.out.printf("%s\n%s: $%,.2f\n\n",se,"earned",se.earnings());
		System.out.printf("%s\n%s: $%,.2f\n\n",he,"earned",he.earnings());
		System.out.printf("%s\n%s: $%,.2f\n\n",ce,"earned",ce.earnings());
		System.out.printf("%s\n%s: $%,.2f\n\n",bpce,"earned",bpce.earnings());
		
		Employee employees[] = new Employee[4];
		
		employees[0] = se;
		employees[1] = he;
		employees[2] = ce;
		employees[3] = bpce;
		
		System.out.println("Employees tratadas polimorficamente:");
		
		for(Employee currentEmployee : employees){
			
			System.out.println(currentEmployee);
			//chama o toString do objeto atual do forEach.
			
			//determina se o objeto atual é instância da classe bpce
			if(currentEmployee instanceof BasePlusCommissionEmployee){
				
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
				//downcasting
				
				double oldBaseSalary = employee.getBaseSalary();
				employee.setBaseSalary(1.10 * oldBaseSalary);
				System.out.printf("nova base salarial em 10%% incrementado é: $%,.2f\n", employee.getBaseSalary());
				
			}
			
			System.out.printf("Earned $%,.2f\n\n",currentEmployee.earnings());
			
			for(int j = 0; j < employees.length; j++){
				
				System.out.printf("Employee %d is a %s\n",j,employees[j].getClass().getName());
			}
		}
	}

}
