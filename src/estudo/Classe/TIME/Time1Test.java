package estudo.Classe.TIME;

public class Time1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		time1 time = new time1();
		
		System.out.print("The universal initial time is: ");
		System.out.println(time.toUniversalString());
		System.out.print("The initial standard time is: ");
		System.out.println(time.toString());
		System.out.println();
		
		time.setTime(13, 27, 6);
		System.out.print("The universal initial after time is: ");
		System.out.println(time.toUniversalString());
		System.out.print("The initial standard after time is: ");
		System.out.println(time.toString());
		System.out.println();
		
		time.setTime(99, 99, 99);
		System.out.print("The universal initial after time is: ");
		System.out.println(time.toUniversalString());
		System.out.print("The initial standard after time is: ");
		System.out.println(time.toString());
		System.out.println();

	}

}
