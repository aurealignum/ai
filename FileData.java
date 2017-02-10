


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
        sc.useDelimiter("\n"); //set scanner to split responses into lines
        String response = sc.next();
        
        //check response against text file
        try{
            ReadFile file = new ReadFile(file_name);
            String[] aryLines = file.OpenFile();
            int i = 0;
            int isSame = 0;
            boolean at = true;
            //scan through all of the file
            try {
                int lines = file.readLines(); //changing lines to a local var so i can stop loop
                while (at = true) {
            	System.out.println(file.readLines());
            	System.out.println(aryLines.length);
            	System.out.println(lines + ">" + aryLines.length);
            		while (lines >= aryLines.length){
            		
            			if (aryLines[i].equalsIgnoreCase("hi")){
                            isSame = 1;
                            System.out.println("true");
            			} else {
                            isSame = 2;
                            at = false;
                        }  
                        
                        if (isSame == 1) {
                            lines = lines * -1;
                            System.out.println(aryLines[i+1]);
                            response = sc.next();
                            System.out.println(response);
                        } else {
                            i = i+2;
                        }
                        
                        //end of while
                    }
                }
                System.out.println("Sorry I dont know what that means, what is the response?");
                String proper_response = sc.next();
                data.writeToFile(response + proper_response); 
                
            } catch (ArrayIndexOutOfBoundsException a) {
            	System.out.println("Sorry I dont know what that means, what is the response?");
                String proper_response = sc.next();
                data.writeToFile(response + proper_response); 
            	//System.out.println("arrayindexoutofboundsexception");
            }
        } catch (IOException e) {
            System.out.println( e.getMessage());
        }

        sc.close();
        System.out.println("File written to");
    }
}
