package string;

public class test {
	public static void main(String[] args){
		String s = "big surprise ";
		System.out.println(s.toString()+"**");
		String s1 = "0123456789";
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5,8));
		StringBuffer sb = new StringBuffer("012345");
		sb.append("6789");
		System.out.println("Sb: "+sb);
		
	}
}
