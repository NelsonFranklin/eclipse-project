package xcptn;
import java.io.*;

class Serializedemo{

	public static void main(String[] args) throws Exception {
Dog d1=new Dog();
FileOutputStream fos=new FileOutputStream("frank.txt");
ObjectOutputStream oss=new ObjectOutputStream(fos);
oss.writeObject(d1);

FileInputStream fis=new FileInputStream("frank.txt");
ObjectInputStream ois=new ObjectInputStream(fis);
 Dog d2=(Dog)ois.readObject();
 System.out.println(d2.i);
	
	
 System.out.println(d2.j);
 }
}
