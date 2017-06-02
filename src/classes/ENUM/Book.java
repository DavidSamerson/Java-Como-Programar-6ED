package classes.ENUM;

public enum Book {

	JHTP6("A", "2000"), CHTP4("B", "2001"), IW3HTP3("C", "2002"), CPPHTP4("D", "2003"), 
	VBHTP2("E","2004"), CSHARPHTP("F", "2005");

	private final String title;
	private final String yeah;

	Book(String bookTitle, String yeah) {
		title = bookTitle;
		this.yeah = yeah;
	}

	public String getTitle() {
		return title;
	}

	public String getCopyrightYeah() {
		return yeah;
	}
}