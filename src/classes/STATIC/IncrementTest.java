package classes.STATIC;

public class IncrementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Increment value = new Increment(5);

		System.out.printf("Before Incrementing: %s\n\n", value);

		for (int i = 1; i <= 3; i++) {
			
			value.addIncrementToTotal();
			System.out.printf("after Incrementing: %s\n\n", value);


		}

	}

}
