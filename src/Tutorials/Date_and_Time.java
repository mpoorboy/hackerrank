import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Scanner;

public class Date_and_Time {

    public static void dayOfWeek(int m, int d, int y) {
        Calendar calendar = Calendar.getInstance();
		    calendar.set(y, m - 1, d);
        String dow = new DateFormatSymbols().getWeekdays()[calendar.get(Calendar.DAY_OF_WEEK)].toUpperCase();
		    System.out.println(dow);   
    }
    
	  public static void main(String[] args) { 
		    Scanner sc = new Scanner(System.in);
		    int month = sc.nextInt();
		    int day = sc.nextInt();
		    int year = sc.nextInt();
        dayOfWeek(month, day, year);
        sc.close();  
	}   
}
