package _1Java_Codes_From_Basics._19FileHandLingInJava._3fileReader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _1fileReaderEx1
{
    public static void main(String[] args) throws IOException
    {
        FileWriter fr = new FileWriter("C:\\Users\\NANDAN GN\\Desktop\\Learning Resources\\Java Programs\\src\\_1Java_Codes_From_Basics\\_19FileHandLingInJava\\_3fileReader\\fileReaderExample.txt");

        String name = "Nandan";
        int age = 22;
        String email = "gnnandan7@gmail.com";
        String branch = "CSE";

        fr.write("Name: "+name+"\n"+"Age: "+age+"\n"+"Email: "+email+"\n"+"Branch: "+branch);
        fr.flush();
        fr.close();
        /**
        @reading_a_file which was created and written from FileWriter Class
         */

        //open a file
        File file = new File("C:\\Users\\NANDAN GN\\Desktop\\Learning Resources\\Java Programs\\src\\_1Java_Codes_From_Basics\\_19FileHandLingInJava\\_3fileReader\\fileReaderExample.txt");
        //pass the opened file as parameter to FileReader Class
        FileReader frr = new FileReader(file);

        //read the data as array of characters
        char[] data = new char[(int)file.length()];

        frr.read(data);
        System.out.println(data);
        frr.close();

        /*System.out.println(data);
        -------- or --------------
        for(char ch1:data)
        {
            System.out.println(ch1);
        }*/

    }
}
