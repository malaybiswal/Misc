package string;

public class leak {
	public static void main(String[] args){
		long i=0;
		long l1,l2,l3;
		Runtime rt = Runtime.getRuntime();
		l1 = System.currentTimeMillis();
		String str = null;
		for(i=0;i<=999999999;i++){
			str= str+"dsgdfgfdfgjqeuywqiouruewioujiernbxzcbzxcvxzghcfagsfdhasgdla";
			 
			if(i%10000==0){
				 l2 = System.currentTimeMillis();
				 l3=l2-l1;
				System.out.println("TIME: "+l3+"**********"+"COUNT: "+i+"  "+"LENGTH: "+str.length()+"   "+str);
				System.out.println("Total JVM Memory: "+rt.totalMemory());
				System.out.println("Before JVM Memory: "+rt.freeMemory());
			}
		}
	}
}
