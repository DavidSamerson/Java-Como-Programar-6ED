package testando.Composicao;

public class Date {

	private int month;
	private int day;
	private int yeah;

	public Date(int theMonth, int theDay, int theYear) 
	{
		month = checkMonth(theMonth);
		yeah = theYear;
		day = checkDay(theDay);

		System.out.printf("Date Object constructor for date %s\n", this);
	}

	private int checkMonth(int testMonth) 
	{
		// TODO Auto-generated method stub

		if (testMonth > 0 && testMonth <= 12)
			return testMonth;

		else {
			System.out.println("Invalid Method .. ");
			return 1;
		}
	}

	private int checkDay(int theDay) 
	{
		// TODO Auto-generated method stub
		return 0;
	}

}
