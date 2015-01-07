package string;
import java.io.*;
import java.util.*;

public class file {
	public static void main(String[] args){
		try{
		/*File existingDir = new File("/Users/mala0858/Documents/workspace/scjp/src/string/existingDir");
		existingDir.mkdir();
		System.out.println(existingDir.isDirectory());
		File existingDirFile = new File(existingDir,"existingDirFile.txt");
		existingDirFile.createNewFile();
		System.out.println(existingDirFile.isFile());*/
			
			/*File delDir = new File("/Users/mala0858/Documents/workspace/scjp/src/string/delDir");	
			delDir.mkdir();
			File delFile1 = new File(delDir,"delFile1.txt");
			delFile1.createNewFile();
			File delFile2 = new File(delDir,"delFile2.txt");
			delFile2.createNewFile();
			delFile1.delete();
			//delFile2.delete();
			System.out.println("delDir is "+ delDir.delete());
			File newName = new File(delDir, "newName.txt");
			delFile2 .renameTo(newName);
			File newDir = new File("/Users/mala0858/Documents/workspace/scjp/src/string/newDir");
			delDir.renameTo(newDir);*/
			
			String[] files = new String[100];
			//ArrayList  files = new ArrayList();
			File search = new File("/Users/mala0858/Downloads");
			files=search.list();
			for(String fn: files){
				System.out.println("found-: "+fn);
			}
		
		}catch(Exception e){}
		
		
	}
}
