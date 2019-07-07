package datetime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Date_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy hh:mm a");
		
		System.out.println(date.toString());

		// ist time zone
		formatter.setTimeZone(TimeZone.getTimeZone("Australia/Currie"));
		System.out.println("timezone : " + formatter.format(date));
		
		String[] allTimeZones = TimeZone.getAvailableIDs();
		for (int i = 0; i < allTimeZones.length; i++) {
			System.out.println(allTimeZones[i]);
		}
	}

}
