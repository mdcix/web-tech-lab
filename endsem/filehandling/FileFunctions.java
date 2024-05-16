import java.io.File;
import java.io.IOException;

public class FileFunctions { 
  public static void main(String[] args) throws IOException{
    File file = new File("sample.txt");
    if (file.exists()) {
      System.out.println("File name : " + file.getName());
      System.out.println("Absolute path : " + file.getAbsolutePath());
      System.out.println("File size in bytes : " + file.length());
      System.out.println("Write Permission there ? " + file.canWrite());
      System.out.println("Read Permission there ? " + file.canRead());
      System.out.println("Is it a file ? " + file.isFile());
      System.out.println("Is it a directory ? " + file.isDirectory());
    } 
    else {
      System.out.println("The file does not exist.");
    }
  }
}


/*OUTPUT
File name : sample.txt
Absolute path : /home/lekhzzz/Documents/java/practice/sample.txt
Writeable : true
Readable : true
File size in bytes : 35
Is it a file ? : true
Is it a directory ? : false
*/
