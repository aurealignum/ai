
package textfile;
import java.io.IOException;
import java.util.Scanner;

public class FileData {
    public static void main (String[] args)throws IOException {
        String file_name = "C:\\Users\\at018719\\Desktop\\test.txt";
        
        //read a file
        try{
            ReadFile file = new ReadFile(file_name);
            String[] aryLines = file.OpenFile();
        } catch (IOException e) {
            System.out.println( e.getMessage());
        }
        
        //write to a file
        WriteFile data  = new WriteFile(file_name, true);
        Scanner sc = new Scanner(System.in);
        
        /*
        System.out.println("Hello");
        String response = sc.next();
        if (response.equals("Hey")){
            System.out.println("Hey fam");
        } else {
            System.out.println("Sorry i didnt get that");
            String explanation = sc.next();
            data.writeToFile(response + "=>" + explanation);
        }
        */
        
        System.out.println("File written to");
    }
}
