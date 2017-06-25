package genericos;

public class MaximumTest {
	
	public static <T extends Comparable<T>> T maximum(T x, T y, T z){
		T max = x;
		if(y.compareTo(max)>0){
			max = y;
		}
		if(z.compareTo(max)>0){
			max = z;
		}
		return max;
	}

	public static void main(String[] args) {
		
		System.out.printf("Maximo entre %d, %d e %d é: %d\n",3,4,5,maximum(3, 4, 5));
		System.out.printf("Maximo entre %.1f, %.1f e %.1f é: %.1f\n",1.1,2.2,3.3,maximum(1.1, 2.2, 3.3));
		System.out.printf("Maximo entre %s, %s e %s é: %s","PEAR","APPLE","ORANGE",maximum("pear","apple","orange"));
		
	}

}
