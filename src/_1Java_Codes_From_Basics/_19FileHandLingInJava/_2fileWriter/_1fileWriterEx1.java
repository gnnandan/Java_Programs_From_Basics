package _1Java_Codes_From_Basics._19FileHandLingInJava._2fileWriter;

import java.io.File;
import java.io.FileWriter;

public class _1fileWriterEx1
{
    public static void main(String[] args) throws Exception
    {
        //creating a file
        File file = new File("C:\\Users\\NANDAN GN\\Desktop\\Learning Resources\\Java Programs\\src\\_1Java_Codes_From_Basics\\_19FileHandLingInJava\\_2fileWriter\\fileWriterFile.txt");
        file.createNewFile();//creating a file

        System.out.println("File Exist: "+file.exists()+" name is "+file.getName());

        System.out.println("writing into the file path: "+file.getAbsolutePath());

        //now writing into the created file
        FileWriter fw = new FileWriter(file);
        String writeData = "Hello, i'm writing data into the file\nfile name: "+file.getName()+"\nfile path: "+file.getAbsolutePath()+"\nfile directory: "+file.getParentFile().getName();;

        fw.write(writeData);
        fw.flush();
        fw.close();
    }
}
