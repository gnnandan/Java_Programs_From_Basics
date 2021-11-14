package _1Java_Codes_From_Basics._19FileHandLingInJava;

import java.io.File;
import java.io.IOException;

public class _3creatingADirectoryEx3
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("C:\\Users\\NANDAN GN\\Desktop\\Learning Resources\\Java Programs\\src\\_1Java_Codes_From_Basics\\_19FileHandLingInJava\\Files");
        System.out.println("Check Existence of Directory: "+f.exists());
        f.mkdir();//creating a directory
        System.out.println("Check Existence of Directory Now: "+f.exists());
        System.out.println("Getting directory name which is created now: "+f.getName());
    }
}
