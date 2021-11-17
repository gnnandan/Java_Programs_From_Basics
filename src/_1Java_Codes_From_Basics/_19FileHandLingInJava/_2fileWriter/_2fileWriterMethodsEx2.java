package _1Java_Codes_From_Basics._19FileHandLingInJava._2fileWriter;

import java.io.FileWriter;

public class _2fileWriterMethodsEx2
{
    public static void main(String[] args) throws Exception
    {

        FileWriter fr = new FileWriter("C:\\Users\\NANDAN GN\\Desktop\\Learning Resources\\Java Programs\\src\\_1Java_Codes_From_Basics\\_19FileHandLingInJava\\_2fileWriter\\fileWriterMethodsFile.txt");
        int intval=10;
        fr.write("Writing Int Value: "+intval); // writing int Value
        fr.write("\n");

        char charVal = 'a';
        fr.write("Writing Char Value: "+charVal);// writing Char Value
        fr.write("\n");

        String strValue = "Hello Welcome To Java";
        fr.write("Writing String Value: "+strValue);// writing String Value
        fr.write("\n");

        fr.write("Writing ASCII Value: "+100); // writing ASCII Value

        fr.flush();//to ensure that the data is written into file
        fr.close();//to close the file
        System.out.println("Data written into the file successfully");
    }

}
