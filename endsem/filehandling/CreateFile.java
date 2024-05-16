//Code to create a new file named newfile.txt
import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String args[]) throws IOException{
        File fileptr = new File("newfile.txt");
        if(fileptr.createNewFile()){ //fileptr.createNewFile() function to create a file
            System.out.println("File with name = "+fileptr.getName()+" has been created");
        }
        else{
            System.out.println("File already exist !!!");
        }
    }
}
