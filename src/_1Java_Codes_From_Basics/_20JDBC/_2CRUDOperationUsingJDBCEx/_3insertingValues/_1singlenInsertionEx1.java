package _1Java_Codes_From_Basics._20JDBC._2CRUDOperationUsingJDBCEx._3insertingValues;

import java.sql.*;
public class _1singlenInsertionEx1
{
    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/demodb";
        String uname = "root";
        String password = "Nandan";
        Connection connection = DriverManager.getConnection(url,uname,password);
        System.out.println("Connection Successful with the database: "+connection.getCatalog());

        Statement statement = connection.createStatement();
        //CREATING A TABLE
        statement.executeUpdate("create table employees(eno int(5) primary key,ename varchar(20),esal double(10,2),eaddr varchar(20))");
        int insertCount = statement.executeUpdate("insert into employees values(1,'Nandan G N', 650000, 'Tiptur')");
        System.out.println("Number of statements inserted: "+insertCount);
        connection.close();
    }
}
