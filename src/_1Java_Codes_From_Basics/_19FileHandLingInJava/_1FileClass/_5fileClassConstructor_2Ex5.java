package _1Java_Codes_From_Basics._19FileHandLingInJava._1FileClass;
//This constructor is used to create a new file in directory within sub directory
import java.io.File;
import java.io.IOException;

public class _5fileClassConstructor_2Ex5
{
    public static void main(String[] args) throws IOException
    {
        File directory = new File("C:\\Users\\NANDAN GN\\Desktop\\Learning Resources\\Java Programs\\src\\_1Java_Codes_From_Basics\\_19FileHandLingInJava\\Directory");
        System.out.println("Check Directory Exists: "+directory.exists());
        directory.mkdir(); //creating directory
        System.out.println("Check Directory Exists Now: "+directory.exists());

        System.out.println();

        File createFile = new File(directory, "DirectoryFile.txt");

        System.out.println("Check File Exists Now: "+createFile.exists());
        createFile.createNewFile();//creating new file in created directory
        System.out.println("Check File Exists Now: "+createFile.exists());


        System.out.println("------------------------------------------------------");
        System.out.println("File with name: "+createFile.getName()+" is successfully created in directory with name: "+directory.getName());
    }
}
