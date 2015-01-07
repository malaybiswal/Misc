package string;
import java.io.*;
public class question {
	public static void main(String[] args){
		/*String name = null;
		File file = new File(name);
		System.out.println(file.getName());*/
		/*String name = null;
		File file = new File("/folder", name);
		System.out.print(file.exists());*/
		/*{
		test();
		} catch(Exception e){System.out.println(e);}*/
		
		File file = new File("/Users/mala0858/Documents/workspace/scjp/src/string/file.txt");
		System.out.println("path -> " + file.getPath());
		System.out.println("absolute -> " + file.getAbsolutePath());
		//System.out.println("canonical -> " + file.getCanonicalPath());
	}
	
	/*static void test() throws IOException {
		String parent = null;
		File file = new File(parent, "myfile.txt");
		file.createNewFile();
		}*/

}
