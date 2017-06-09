package polimorfismo.Geral;

public class PlayableInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payable payableObjects[] = new Payable [4];
		
		payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
		payableObjects[1] = new Invoice("56799", "tire", 2, 79.00);
		payableObjects[2] = new SalariedEmployee2("jonh", "seat", "111-111-1111", 800.00);
		payableObjects[3] = new SalariedEmployee2("lisa", "seat", "888-888-8888", 1300.00);
		
		System.out.println("Polimorficamente falando: ");
		
		for(Payable currentPayable : payableObjects){
			System.out.printf("%s \n%s: $%,.2f\n\n", currentPayable.toString(),
					"Payment duo", currentPayable.getPaymentAmount());
		}

	}

}
