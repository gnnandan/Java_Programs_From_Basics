package _1Java_Codes_From_Basics._19FileHandLingInJava._6printWriter;

import java.io.File;
import java.io.PrintWriter;

public class _2printWriterMethodsEx2
{
    public static void main(String[] args) throws Exception
    {
        String pathOfFile = "C:\\Users\\NANDAN GN\\Desktop\\Learning Resources\\Java Programs\\src\\_1Java_Codes_From_Basics\\_19FileHandLingInJava\\_6printWriter\\fileReaderExample.txt";
        PrintWriter printWriter = new PrintWriter(pathOfFile);

        File file = new File(pathOfFile);//we call file name because to use getName() method

        printWriter.write("ASCII Value: "+100);
        int i  = 10000;
        printWriter.println();

        printWriter.write("int Value: "+i);
        printWriter.println();

        char[] c = {'a','b','c','d'};
        printWriter.write("Char Value: "+c);
        printWriter.println();

        String newData = "Learning JAVA";
        printWriter.write("String Value: "+newData);
        printWriter.println();

        printWriter.flush();
        printWriter.close();

        System.out.println("---------------------------------------------------------");
        System.out.println("Data written into the file: '"+file.getName()+"' successfully");
    }
}
