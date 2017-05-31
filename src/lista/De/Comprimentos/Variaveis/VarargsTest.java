package lista.De.Comprimentos.Variaveis;

public class VarargsTest {
	
	public static double average(double... numbers)
	{
		double total = 0.0;
		
		for( double d:numbers )
			total += d;
		
		return total / numbers.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
