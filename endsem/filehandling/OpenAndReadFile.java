//Open and read content from sample.txt
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class OpenAndReadFile {
    public static void main(String args[]) throws IOException{
        int lineCount = 0;
        File fileptr = new File("sample.txt");
        
        if(fileptr.exists()){       //fileptr.exists() -> returns true if that file exist else return false
            
            Scanner scan = new Scanner(fileptr);    //Scanner(fileptr) -> used to scan from file
            
            while(scan.hasNextLine()){      //loop continues until a next line is there
                String line = scan.nextLine();
                System.out.println(line);
                lineCount+=1;
            }
            System.out.println("Number of lines = "+lineCount);
            scan.close();
        }
        else{
            System.out.println("File Does not exist !!!");
        }
    }
}

/*OUTPUT
line 1
line 2
line 3
line 4
line 5
Number of lines = 5
*/
