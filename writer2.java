package string;
import java.io.*;
public class writer2 {
	public static void main(String[] args){
		char[] in = new char[50];
		int size = 0;
		try{
		File file = new File("/Users/mala0858/Downloads/test.txt");
		FileWriter fw = new FileWriter(file);
		fw.write("howdy\nfolks\n");
		fw.flush();
		fw.close();
		FileReader fr = new FileReader(file);
		size = fr.read(in);
		System.out.println(size);
		for(char c: in){
			System.out.println(c);
		}
		fr.close();
		}catch(IOException ie){
			System.out.println(ie);
		}
	}
}
