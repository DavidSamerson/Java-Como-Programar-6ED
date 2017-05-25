package arrays;

public class InitArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int ARRAY_LENGTH = 10;
		int array[] = new int[ ARRAY_LENGTH ];
		
		for( int counter = 0 ; counter < array.length ; counter++ ){
			
			array[ counter ] = 2 + 2 * counter;
		}
		for( int counter = 0 ; counter < array.length ; counter++ ){
			
			System.out.printf("%5d%8d\n", counter, array [ counter ]);
		}

	}

}
