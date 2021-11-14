package _1Java_Codes_From_Basics._19FileHandLingInJava;
//This constructor is used to create a new file in working directory
import java.io.File;
import java.io.IOException;

public class _4fileCassConstructor_1Ex4
{
    public static void main(String[] args) throws IOException
    {
        // creates java file object
        File f = new File("workingDirectoryFile.txt");
        System.out.println("Check File Existence: "+f.exists()); // checks the file existence
        f.createNewFile(); //creating a file
        System.out.println("File Xcreated successfully with name "+f.getName());//used to get the created fileName
        System.out.println("Check File Existence Now: "+f.exists());
    }
}
