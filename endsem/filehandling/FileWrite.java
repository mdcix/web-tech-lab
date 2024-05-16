import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
  public static void main(String[] args) throws IOException {
      FileWriter Writer = new FileWriter("newfile.txt"); //this will create a new file or OVERWRITE EXISTING FILE...
      //to avoid over writing and want to append, use 
      //FileWriter Writer = new FileWriter("newfile.txt", true); 
      Writer.write("This\nis\nthe\nmessage\nto be \nwritten");
      Writer.close();
      System.out.println("Successfully wrote to the file.");
    }
}