package string;
import java.io.*;
public class writer3 {
	public static void main(String[] args){
		try{
		File existingDir = new File ("/Users/mala0858/Downloads/");
		System.out.println(existingDir.isDirectory());
		File existingDirFile = new File(existingDir,"MALAY.txt");
		File file = new File(existingDir,"test.txt");
		System.out.println(existingDirFile.isFile());
		FileReader fr = new FileReader(existingDirFile);
		BufferedReader br = new BufferedReader(fr);
		String s="" ;
		
		while ((s= br.readLine())!=null){
			System.out.println(s);
		}
		existingDirFile.renameTo(file);
		
		}catch(IOException e){
			
		}
	}

}
