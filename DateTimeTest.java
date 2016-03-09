import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeTest {
	
	public static void main(String args[]) throws ParseException{
		SimpleDateFormat dateFormatGmt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSz");
		Date date = dateFormatGmt.parse("2016-03-08T06:56:04.00GMT");
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		long timeMillis = c.getTimeInMillis();
		System.out.println(timeMillis);
		
		String S = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(timeMillis);
		System.out.println(S);
	}

}

