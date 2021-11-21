package _1Java_Codes_From_Basics._20JDBC._2CRUDOperationUsingJDBCEx._6deletingDataFromTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class _1deletingDataEx1
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
        String query = "DELETE FROM employees WHERE eno = 6";
        int deleteCount = statement.executeUpdate(query);
        System.out.println("The number of rows deleted: "+deleteCount);
        connection.close();
    }
}
