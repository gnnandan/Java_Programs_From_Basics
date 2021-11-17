package _1Java_Codes_From_Basics._19FileHandLingInJava._1FileClass;

import java.io.File;
import java.io.IOException;

public class _6fileClassConstructor_3Ex6
{
    public static void main(String[] args) throws IOException
    {
        File directory = new File("C:\\Users\\NANDAN GN\\Desktop\\Learning Resources\\Java Programs\\src\\_1Java_Codes_From_Basics\\_19FileHandLingInJava\\Directory\\SubDirectory");
        System.out.println("Check Directory Exists: "+directory.exists());
        directory.mkdir(); //creating directory
        System.out.println("Check Directory Exists Now: "+directory.exists());

        System.out.println();
        File newFile = new File(directory,"SubDirectoryFile.txt");
        System.out.println("Check File Exists Now: "+newFile.exists());
        newFile.createNewFile();//creating new file in created directory
        System.out.println("Check File Exists Now: "+newFile.exists());


        System.out.println("------------------------------------------------------");
        System.out.println("File with name: "+newFile.getName()+" is successfully created in Sub directory with name: "+directory.getName());
    }
}
