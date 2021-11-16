package _1Java_Codes_From_Basics._19FileHandLingInJava._4bufferedWriterEx4;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class _1BufferedWriterEx1
{
    public static void main(String[] args) throws Exception
    {

        FileWriter fileWriter = new FileWriter("C:\\Users\\NANDAN GN\\Desktop\\Learning Resources\\Java Programs\\src\\_1Java_Codes_From_Basics\\_19FileHandLingInJava\\_3fileReaderEx3\\fileReaderExample.txt");
        BufferedWriter bf = new BufferedWriter(fileWriter);
        String data = "I'm Writing Data To File Using BufferedWriter";
        bf.write(data);
        bf.flush();
        bf.close();
        System.out.println("Data written into file successfully......!");
    }
}
