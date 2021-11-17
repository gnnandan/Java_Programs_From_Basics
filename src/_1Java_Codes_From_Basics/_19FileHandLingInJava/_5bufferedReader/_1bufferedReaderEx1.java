package _1Java_Codes_From_Basics._19FileHandLingInJava._5bufferedReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class _1bufferedReaderEx1
{
    public static void main(String[] args)throws IOException
    {
        String path ="C:\\Users\\NANDAN GN\\Desktop\\Learning Resources\\Java Programs\\src\\_1Java_Codes_From_Basics\\_19FileHandLingInJava\\_5bufferedReader\\fileReaderExample.txt";
        FileReader fileReader = new FileReader(path);
        BufferedReader bfr = new BufferedReader(fileReader);
        String line = bfr.readLine();
        //logic to read data from the file
        while(line!=null)
        {
            System.out.println(line);
            line = bfr.readLine();
        }
        bfr.close();
        System.out.println("------------------------------------------------------------");
        System.out.println("Read operation is completed successfully......!");
    }
}
