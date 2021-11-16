package _1Java_Codes_From_Basics._19FileHandLingInJava._4bufferedWriterEx4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class _2BufferedWriterMethodsEx2
{
    public static void main(String[] args) throws IOException
    {
        FileWriter fileWriter = new FileWriter("C:\\Users\\NANDAN GN\\Desktop\\Learning Resources\\Java Programs\\src\\_1Java_Codes_From_Basics\\_19FileHandLingInJava\\_3fileReaderEx3\\fileReaderExample.txt");
        BufferedWriter bf = new BufferedWriter(fileWriter);
        bf.write("ASCII Value: "+100);
        bf.newLine();
        char[] c = {'J','A','V','A'};
        bf.write("Character Value: " + c);
        bf.newLine();
        String s = "Learning JAVA";
        bf.write("String Value:" + s);
        bf.flush();
        bf.close();
        System.out.println("Data Successfully Written Into File......!");
    }
}
