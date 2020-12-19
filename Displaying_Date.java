package Date;
import java.time.LocalDate;
import java.time.LocalTime;

public class Displaying_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		System.out.println("Current time is "  +  time + " Today's date " + date);

	}

}
