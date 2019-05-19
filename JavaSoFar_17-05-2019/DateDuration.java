import java.util.*;
import java.text.SimpleDateFormat;
import java.time.*;

class DateDuration{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the date in yyyy-mm-dd format");
		String date = scan.nextLine();
		
		LocalDate ld = LocalDate.now();
		LocalDate personDate = LocalDate.parse(date);
		Period p = Period.between(personDate,ld);
		System.out.println("Difference is: " + p.getYears() + " years " + p.getMonths() + " months and " + p.getDays() + " days.");

	}
}
