package string;

import java.io.*;
class Employee implements Serializable{

	public String name;
	public String address;
	public int SSN;
	public int number;};
public class SerializeDemo
{
   public static void main(String [] args) throws ClassNotFoundException
   {
      Employee e = new Employee();
      e.name = "Malay Biswal";
      e.address = "3333 Oakwell Ct";
      e.SSN = 111222333;
      e.number = 1101;
      try
      {
         FileOutputStream fileOut =
         new FileOutputStream("/tmp/employee.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in /tmp/employee.ser");
      }catch(IOException i)
      {
          i.printStackTrace();
      }
      try{
    	  FileInputStream fis = new FileInputStream("/tmp/employee.ser");
    	  ObjectInputStream ois = new ObjectInputStream(fis);
    	  e = (Employee) ois.readObject();
    	  System.out.println("\n"+"Name: "+e.name);
    	  System.out.println("Address: "+e.address);
    	  System.out.println("SSN "+e.SSN);
    	  System.out.println("Number "+e.number);
    	  fis.close();
    	  ois.close();
      }catch(IOException i)
      {
          i.printStackTrace();
      }
   }
}
