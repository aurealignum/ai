
package textfile;
import java.io.IOException;
import java.util.Scanner;

public class FileData {
    public static void main (String[] args)throws IOException {
        String file_name = "C:\\Users\\computer\\Desktop\\test.txt";
        
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
        sc.useDelimiter("\n"); //set scanner to split responses into lines
        String response = sc.next();
        
        //check response against text file
        try{
            ReadFile file = new ReadFile(file_name);
            String[] aryLines = file.OpenFile();
            int i = 0;
            
            //scan through all of the file
            try {
            	System.out.println(file.readLines());
            	System.out.println(aryLines.length);
            	while (aryLines.length <= file.readLines()){
            		if (aryLines[i].equalsIgnoreCase(response)){
            			System.out.println(aryLines[i+1]);
            		}
            		System.out.println(i + aryLines[i] + ":" + response);
            		i = i+2;
            		
            	}
            	
            } catch (ArrayIndexOutOfBoundsException a) {
            	//System.out.println(a.getMessage());
            }
        } catch (IOException e) {
            System.out.println( e.getMessage());
        }
        
       
        System.out.println("Sorry I dont know what that means, what is the response?");
        String proper_response = sc.next();
        data.writeToFile(response + proper_response); 
        
        
        sc.close();
        System.out.println("File written to");
    }
}
