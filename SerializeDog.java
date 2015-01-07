package string;
import java.io.*;
// Serializable for Object containing another object
class Dog implements Serializable{
	public Collar theCollar;
	public int dogSize;
	public Dog(Collar collar, int size){
		 theCollar = collar;
		dogSize = size;
	}
	public Collar getCollar() { return theCollar;}
}
class Collar implements Serializable{
	public int collarSize;
	public Collar(int size) { collarSize = size; }
	public int getCollarSize() { return collarSize; }
}
public class SerializeDog {
	public static void main(String [] args) throws ClassNotFoundException {
		Collar c = new Collar(3);
		Dog d = new Dog(c,8);
		try{
			FileOutputStream fileOut =
			         new FileOutputStream("/tmp/dog.ser");
			         ObjectOutputStream out = new ObjectOutputStream(fileOut);
			         out.writeObject(d);
			         fileOut.close();
			         out.close();
		}catch(Exception e){ e.printStackTrace();}
		
		try{
			FileInputStream fin =
			         new FileInputStream("/tmp/dog.ser");
			         ObjectInputStream in = new ObjectInputStream(fin);
			         d = (Dog) in.readObject();
			         System.out.println("\n"+"Collar: "+c.getCollarSize());
			         System.out.println("\n"+"Collar: "+d.getCollar().getCollarSize());
			         System.out.println("\n"+"Dog: "+d.dogSize);
			         fin.close();
			         in.close();
		}catch(Exception e){ e.printStackTrace();}
	}
	
}
