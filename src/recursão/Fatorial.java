package recurs�o;

public class Fatorial {
	
	public long factorial (long number)
	{
		if (number <=1)
		{
			return 1;
		}
		else {
			return number * factorial(number);
		}
	}
	
	public void displayFactorials()
	{
		for (int i = 0; i <= 10; i++) {
			
			System.out.printf("%d = %d\n",i,factorial(i));
			
		}
	}

}
