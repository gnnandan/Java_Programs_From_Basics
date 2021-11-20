package _1Java_Codes_From_Basics._20JDBC._2CRUDOperationUsingJDBCEx._2dropingTable;

import java.sql.*;
public class _1dropTableEx1
{
    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/demodb";
        String un = "root";
        String pass = "Nandan";
        Connection conn = DriverManager.getConnection(url,un,pass);
        System.out.println("Connection Successful with the database: "+conn.getCatalog());
        Statement s = conn.createStatement();
        s.executeUpdate("Drop table employees");
        System.out.println("Table deleted successfully....!");
        conn.close();
    }
}
