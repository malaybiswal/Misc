package string;
import java.text.*;
import java.util.*;
public class dateformat {
	public static void main(String[] args){
		Date d1 = new Date();
		DateFormat[] dfa = new DateFormat[6];
		dfa[0] = DateFormat.getInstance();
		dfa[1] = DateFormat.getDateInstance();
		dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT);
		dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);
		dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);
		for (DateFormat df: dfa)
			System.out.println(df.format(d1));
		System.out.println("DEFAULT:"+dfa[1].format(d1));
		
		String s = dfa[1].format(d1);
		try{
			Date d2 = dfa[1].parse(s);
			System.out.println("Parsed:"+d2.toString());
		}
		catch(ParseException pe){System.out.println("EXCEPTION");}
		
	}

}
