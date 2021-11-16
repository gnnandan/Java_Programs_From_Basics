package _1Java_Codes_From_Basics._19FileHandLingInJava._3fileReaderEx3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class _2waysOfReadingDataUsingfileReaderEx2
{
    public static void main(String[] args) throws IOException
    {
        readDataWay_1();
        System.out.println();
        readDataWay_2();
        System.out.println();
        readDataWay_3();
    }
    static void readDataWay_1() throws IOException
    {
        File file = new File("C:\\Users\\NANDAN GN\\Desktop\\Learning Resources\\Java Programs\\src\\_1Java_Codes_From_Basics\\_19FileHandLingInJava\\_3fileReaderEx3\\fileReaderExample.txt");
        FileReader fr = new FileReader(file);
        System.out.println("Way - 1 Of Reading Data From File");
        System.out.println("******************************************************************************");
        char[] chars = new char[(int)file.length()]; //type 1
        fr.read(chars);
        System.out.println(chars);
    }

    static void readDataWay_2() throws IOException
    {
        File file = new File("C:\\Users\\NANDAN GN\\Desktop\\Learning Resources\\Java Programs\\src\\_1Java_Codes_From_Basics\\_19FileHandLingInJava\\_3fileReaderEx3\\fileReaderExample.txt");
        FileReader fr = new FileReader(file);
        System.out.println("Way - 2 Of Reading Data From File");
        System.out.println("******************************************************************************");
        char[] data = new char[(int)file.length()];
        fr.read(data);
        for(char dataCh:data)
        {
            System.out.print(dataCh);
        }
        System.out.println();
    }
    static void readDataWay_3() throws IOException
    {
        File file = new File("C:\\Users\\NANDAN GN\\Desktop\\Learning Resources\\Java Programs\\src\\_1Java_Codes_From_Basics\\_19FileHandLingInJava\\_3fileReaderEx3\\fileReaderExample.txt");
        FileReader fr = new FileReader(file);
        System.out.println("Way - 3 Of Reading Data From File");
        System.out.println("******************************************************************************");
        int i = fr.read();
        while(i!=-1)
        {
            System.out.print((char)i);
            i = fr.read();
        }
    }
}
