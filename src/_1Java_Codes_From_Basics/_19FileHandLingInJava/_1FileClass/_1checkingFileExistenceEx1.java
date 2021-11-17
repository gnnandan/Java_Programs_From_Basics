package _1Java_Codes_From_Basics._19FileHandLingInJava._1FileClass;

import java.io.File;

public class _1checkingFileExistenceEx1
{
    public static void main(String[] args)
    {
        File f = new File("fileEx.txt");
        System.out.println("Check File Existence: "+f.exists()); // checks the file existence
    }
}
