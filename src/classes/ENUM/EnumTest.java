package classes.ENUM;

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("All books: \n");
		
		for(Book book : Book.values())
			System.out.printf("%-10s%-45s%s\n",book,book.getTitle(),book.getCopyrightYeah());

	}

}
