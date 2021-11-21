package _1Java_Codes_From_Basics._20JDBC._2CRUDOperationUsingJDBCEx._4selectCommand;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class _2selectEntireRecord
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
        ResultSet resultSet = statement.executeQuery("SELECT * from employees");

        boolean recordFound  = false;
        System.out.println("E_Id\tE_Name\t\tE_Salary\tE_Place");
        System.out.println("-----------------------------------------");
        while(resultSet.next())
        {
            recordFound = true;
            System.out.println(resultSet.getInt("eno")+"\t\t"+resultSet.getString("ename")+"\t"+"\t"+resultSet.getDouble("esal")+"\t"+"\t"+resultSet.getString("eaddr"));
        }
        if(recordFound == false)
        {
            System.out.println("Record Not Found");
        }
        connection.close();
    }
}
