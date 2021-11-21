package _1Java_Codes_From_Basics._20JDBC._2CRUDOperationUsingJDBCEx._4selectCommand;

import java.sql.*;

public class _1selectParticularColumnsEx1
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
        ResultSet resultSet = statement.executeQuery("SELECT ename, esal from employees");

        boolean recordFound  = false;
        System.out.println("E_Name\t\tE_Salary");
        System.out.println("------------------------------");
        while(resultSet.next())
        {
            recordFound = true;
            System.out.println(resultSet.getString("ename")+"\t"+"\t"+resultSet.getDouble("esal"));
        }
        if(recordFound == false)
        {
            System.out.println("Record Not Found");
        }
        connection.close();
    }
}
