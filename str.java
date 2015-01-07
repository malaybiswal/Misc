package string;

public class str {
	public static void main(String[] args){
		String s = "abcdef";
		String s2=s;
		System.out.println("Original s: "+s+" s2: "+s2);
		s= s.concat(" more stuff ");
		System.out.println("After 1st change s: "+s);
		s.concat(" even  more");
		System.out.println("After 2nd change s: "+s);
		System.out.println("S2:" +s2);
		System.out.println("***********************************");
		String str3="0123456789";
		String str1 = "Spring ";
		String str2 = str1+ "summer ";
		str1.concat("fall ");
		str2.concat("str1");
		str1+="winter";
		System.out.println(str1+" "+str2+ " charAt:  "+str1.charAt(0)+ "  "+str1.length());
		System.out.println(" SUBSTR: "+str3.substring(2,3));
		
		String x = "malay";
		x=x.toUpperCase();
		System.out.println(x);
		
		StringBuffer sb = new StringBuffer("abc");
		sb.append("def").reverse().insert(3,"---");
		System.out.println(sb);
		
		String s10 = "abcdefghijkl";
		System.out.println("SUBSTRING 5,8 IS:"+s10.substring(5,8));//fgh
		
	}
}
