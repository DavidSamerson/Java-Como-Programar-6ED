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
		
		double d1 = 10.0 , d2 = 20.0 , d3 = 30.0 , d4 = 40.0;
		
		System.out.printf("D1 = %.1f\n"
				+ "D2 = %.1f\n"
				+ "D3 = %.1f\n"
				+ "D4 = %.1f\n\n",d1,d2,d3,d4);
		
		System.out.printf("AVERAGE de 1 e 2 é: %.1f",average(d1,d2));
		System.out.printf("AVERAGE de 1 , 2 e 3 é: %.1f",average(d1,d2,d3));
		System.out.printf("AVERAGE de 1 , 2 , 3 e 4 é: %.1f",average(d1,d2,d3,d4));

	}

}
