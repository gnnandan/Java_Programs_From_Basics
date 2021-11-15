package _1Java_Codes_From_Basics._19FileHandLingInJava._1methodThatSupportFileIO;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class _1methodsFileHandlingEx1
{
    public static void main(String[] args) throws IOException
    {
        File cd = new File("C:\\Users\\NANDAN GN\\Desktop\\Learning Resources\\Java Programs\\src\\_1Java_Codes_From_Basics\\_19FileHandLingInJava\\_1methodThatSupportFileIO\\methodsDirectory");
        System.out.println("Check for directory: "+cd.exists());//directory the directory existence

        //create directory
        cd.mkdir();
        System.out.println("Check for directory: "+cd.exists());

        System.out.println();
        File cf = new File(cd, "methodsFile.txt");
        System.out.println("Check for file: "+cf.exists());//checks the file existence
        cf.createNewFile();
        System.out.println("Check for file: "+cf.exists());

        System.out.println();
        System.out.println("Confirm is directory: "+cd.isDirectory());//checks whether created directory or others
        System.out.println();
        System.out.println("Confirm is file: "+cf.isFile());//checks whether created file or others

        
        System.out.println();

        System.out.println("The files present in directory: "+cd.getName());
        int directoryCount = 0;
        String sd[] = cd.list();//list of directories
        for(String s1:sd)
        {
            directoryCount++;
            System.out.println(s1);
        }
        System.out.println("Total number of directory: "+directoryCount);
        System.out.println();

        File checkDirectories = new File("C:\\Users\\NANDAN GN\\Desktop\\Learning Resources\\Java Programs\\src");
        System.out.println("The files in directory: "+checkDirectories.getName());
        int count = 0;
        String sdd[] = checkDirectories.list();//check the list of file from different directory
        for(String s:sdd)
        {
            count++;
            System.out.println(s);
        }
        System.out.println("The total number of files in project directory: "+checkDirectories.getName()+" is "+count);
        System.out.println("The length of the project directory: "+checkDirectories.getName()+" is "+checkDirectories.length());
        System.out.println();
        System.out.println("Checking the length of file:\n"+cf.length());//length of file
    }
}
