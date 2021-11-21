package _1Java_Codes_From_Basics._20JDBC._2CRUDOperationUsingJDBCEx._5updatingTableValues;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class _1updatingValuesEx1
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
        String query = "UPDATE employees SET esal=15000 WHERE ename = 'Nandan'";
        int updateCount = statement.executeUpdate(query);
        System.out.println("The number of rows updated: "+updateCount);
        connection.close();
    }
}
