package arrays;

public class StudentPooll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int responses[] = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
		
		int frequency[] = new int[11];
		
		for(int amswer = 0; amswer < responses.length; amswer++){
			++frequency[responses[amswer]];}
		
		System.out.printf("%s%10s\n","Rating","Frequency");
		
		for(int rating = 1; rating < frequency.length; rating++){
			System.out.printf("%6d%10d\n", rating, frequency[rating]);}
	}

}
