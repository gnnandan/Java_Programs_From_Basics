package _1Java_Codes_From_Basics._19FileHandLingInJava._6printWriter;


import java.io.File;
import java.io.PrintWriter;

public class _1printWriterEx1
{
    public static void main(String[] args)throws Exception
    {
        String pathOfFile = "C:\\Users\\NANDAN GN\\Desktop\\Learning Resources\\Java Programs\\src\\_1Java_Codes_From_Basics\\_19FileHandLingInJava\\_6printWriter\\fileReaderExample.txt";
        PrintWriter printWriter = new PrintWriter(pathOfFile);

        File file = new File(pathOfFile);//we call file name because to use getName() method
        String data = "We are writing data into the file: "+file.getName()+" using PrintWriter";
        printWriter.write(data);
        printWriter.flush();
        printWriter.close();
        System.out.println("---------------------------------------------------------");
        System.out.println("Data written into the file: '"+file.getName()+"' successfully");
    }
}
