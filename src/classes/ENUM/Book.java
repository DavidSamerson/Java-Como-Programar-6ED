package classes.ENUM;

public enum Book {
	
	JHTP6("A","a"),
	CHTP4("B","b"),
	IW3HTP3("C","c"),
	CPPHTP4("D","d"),
	VBHTP2("E","e"),
	CSHARPHTP("F","f");
	
	private final String title;
	private final String yeah;

	Book(String bookTitle, String yeah)
	{
		title = bookTitle;
		this.yeah = yeah;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getCopyrightYeah()
	{
		return yeah;
	}
}