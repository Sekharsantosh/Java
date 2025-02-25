import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class FileHandling {
    public static void writingContent(String file){
        try{
        FileWriter fw =new FileWriter(file);
        fw.write("This is method to write content on file.\n Hello world");
        fw.close();
        }
        catch(IOException e){
            System.out.println("File not found");
        }
    }
    public static void main(String args[]){
        //creating Files using Java.
        try{
            File file=new File("new_file.txt");
            if(file.createNewFile()){
                System.out.println("New file created : "+file.getName());
            }
            
            else{
                System.out.println("File already exists");
            }
            String t=file.getName();
            writingContent(t);
            Scanner read=new Scanner(file);
            while(read.hasNextLine()){
                String data=read.nextLine();
                System.out.println(data);
            }
            read.close();
        }

        catch(FileAlreadyExistsException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        

    }
}
