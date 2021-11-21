package _1Java_Codes_From_Basics._20JDBC._2CRUDOperationUsingJDBCEx._3insertingValues;

import java.sql.*;
import java.util.Scanner;

public class _2multipleInsertionEx2
{
    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/demodb";
        String uname = "root";
        String password = "Nandan";
        Connection cs = DriverManager.getConnection(url,uname,password);
        Statement sat = cs.createStatement();

        //inputs should be same as column names in mysql table
        int eno;
        double esal;
        String ename, eaddr, choice;

        // input class
        Scanner input = new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter Employee - id: ");
            eno = input.nextInt();

            System.out.print("Enter Employee - name: ");
            ename = input.next();

            System.out.print("Enter Employee - salary: ");
            esal  = input.nextDouble();

            System.out.print("Enter Employee - place: ");
            eaddr = input.next();

            String query = String.format("INSERT INTO employees VALUES (%d, '%s',%f,'%s')",eno, ename, esal, eaddr);
            sat.executeUpdate(query);

            System.out.print("Do you want to insert more record - [Yes or No]: ");
            choice = input.next();
            if (choice.equalsIgnoreCase("No"))
            {
                System.out.println("Data Inserted Successfully...!");
                break;
            }

        }
        cs.close();
    }
}
