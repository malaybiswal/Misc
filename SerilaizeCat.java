package string;
import java.io.*;

class Cat implements Serializable{};

public class SerilaizeCat {
	public static void main(String[] args){
		Cat c = new Cat();
		try{
			FileOutputStream fos = new FileOutputStream("/tmp/testser.ser");
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(c);
			os.close();
		}catch(Exception e){}
		
		try{
			FileInputStream fis = new FileInputStream("/tmp/testser.ser");
			ObjectInputStream is = new ObjectInputStream(fis);
			c = (Cat) is.readObject();
		}catch(Exception e){
			
		}
		
	}
}
