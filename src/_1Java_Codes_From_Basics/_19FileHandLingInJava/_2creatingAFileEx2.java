package _1Java_Codes_From_Basics._19FileHandLingInJava;

import java.io.File;
import java.io.IOException;

public class _2creatingAFileEx2
{
    public static void main(String[] args) throws IOException
    {
        // creates java file object
        File f = new File("C:\\Users\\NANDAN GN\\Desktop\\Learning Resources\\Java Programs\\src\\_1Java_Codes_From_Basics\\_19FileHandLingInJava\\fileEx.txt");
        System.out.println("Check File Existence: "+f.exists()); // checks the file existence
        f.createNewFile(); //creating a file
        System.out.println("File Xcreated successfully with name "+f.getName());//used to get the created fileName
        System.out.println("Check File Existence Now: "+f.exists());
    }
}
