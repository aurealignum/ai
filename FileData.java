
package textfile;
import java.io.IOException;
import java.util.Scanner;

public class FileData {
    public static void main (String[] args)throws IOException {
        String file_name = "C:\\Users\\at018719\\Desktop\\test.txt";
        
        /*
        try{
            ReadFile file = new ReadFile(file_name);
            String[] aryLines = file.OpenFile();
        } catch (IOException e) {
            System.out.println( e.getMessage());
        }
        */
        
        //write to a file
        WriteFile data  = new WriteFile(file_name, true);
        Scanner sc = new Scanner(System.in);
        
        //functional code here \/
        
        System.out.println("Hello");
        sc.useDelimiter("\n"); //set scanner to accept " " as one token
        String response = sc.next();
        
        try{
            ReadFile file = new ReadFile(file_name);
            String[] aryLines = file.OpenFile();
            
            //scan through all of the file
            for (int i = 0; i < 10; i++){
                
            }
        } catch (IOException e) {
            System.out.println( e.getMessage());
        }
        
        if (response.equals("Hey")){
            System.out.println("Hey fam");
        } else {
            System.out.println("Sorry I dont know what that means, what is the response?");
            String proper_response = sc.next();
            data.writeToFile(response + "_" + proper_response); 
        }
        
        
        System.out.println("File written to");
    }
}
