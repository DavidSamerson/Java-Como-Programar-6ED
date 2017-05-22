package declarando.Metodos.Com.Multiplos.Parametros;

import java.util.Scanner;

public class MaximunFinder {
	
	public void determineMaximum(){
		
	Scanner leitura = new Scanner(System.in);
	
	System.out.println("Entre com 3 valores para saber qual o maior: ");
	
	Double numero1 = leitura.nextDouble();
	Double numero2 = leitura.nextDouble();
	Double numero3 = leitura.nextDouble();
	
	Double resultado = maximum(numero1,numero2,numero3);
	
	System.out.println("\nO resultado é: "+resultado);
	}

	private Double maximum(Double x, Double y, Double z) {
		// TODO Auto-generated method stub
		double maximumValue = x;//supondo que x é o maior
		
		if (y > maximumValue){
			maximumValue = y;
		}
		if (z > maximumValue){
			maximumValue = z;
		}
		
		return maximumValue;
	}
}
