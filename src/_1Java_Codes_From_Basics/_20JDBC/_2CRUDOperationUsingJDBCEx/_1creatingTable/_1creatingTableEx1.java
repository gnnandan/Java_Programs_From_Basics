package _1Java_Codes_From_Basics._20JDBC._2CRUDOperationUsingJDBCEx._1creatingTable;

import java.sql.*;

public class _1creatingTableEx1
{
    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/demodb";
        String uname = "root";
        String password = "Nandan";
        Connection con = DriverManager.getConnection(url,uname,password);
        System.out.println("Testing Connection: "+con);
        Statement st = con.createStatement();
        String query="create table employees(eno int(5) primary key,ename varchar(20),esal double(10,2),eaddr varchar(20))";
        st.executeUpdate(query);
        String dbName = con.getCatalog(); // used to get executing database name
        System.out.println("Table created successfully in the schema/database: "+dbName);
        con.close();
    }
}
