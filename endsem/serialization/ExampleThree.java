//java code for final with transient

import java.io.*;


class Dog implements Serializable{
		int i=10;
		transient final int j=20;
}
class GFG {
	public static void main (String[] args)throws IOException,ClassNotFoundException 
	{
		Dog d1=new Dog();
		//Serialization started
		System.out.println("serialization started");
		FileOutputStream fos= new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("Serialization ended");
	
		//Deserialization started
		System.out.println("Deserialization started");
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2=(Dog) ois.readObject();
		System.out.println("Deserialization ended");
		System.out.println("Dog object data");
		//final result
		System.out.println(d2.i+"\t" +d2.j);
	}
}
