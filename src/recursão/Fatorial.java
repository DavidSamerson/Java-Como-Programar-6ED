package recursão;

public class Fatorial {
	
	public long factorial (long number)
	{
		if (number <=1)
		{
			return 1;
		}
		else {
			return number * factorial(number-1);
		}
	}
	
	public void displayFactorials()
	{
		for (int i = 0; i <= 100; i++) {
			
			System.out.printf("%d = %d\n",i,factorial(i));
			
		}
	}

}
