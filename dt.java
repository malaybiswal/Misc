package string;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class dt {
	public static void main(String[] args){
		/*Date d = new Date();
		String s = d.toString();
		System.out.println(s);
		Calendar c = Calendar.getInstance();
		int field=2;
		c.add(field, 1);
		System.out.println(c);*/
		/*Calendar c = Calendar.getInstance();
		Locale loc = new Locale("US");
		Date d = c.getTime();
		DateFormat df = DateFormat.getDateInstance(2,loc);
		String s = df.format(d);
		System.out.println(s);*/
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.DAY_OF_WEEK, 1);
		Date d2 = c.getTime();
		System.out.println(d2);
		c.roll(Calendar.HOUR,3);
		Date d3 =c.getTime();
		System.out.println(d3);
	}

}
