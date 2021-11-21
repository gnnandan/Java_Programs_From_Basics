package _1Java_Codes_From_Basics._20JDBC._1SimpleJDBCConnectionEx;
import java.sql.*; //1. Import the packages
public class _1javaDatabaseCollectionEx1
{
    public static void main(String[] args) throws Exception
    {
        /*
        Steps - To Connect the java with JDBC
        TODO
        1. Import the packages           -------> sql.*;
        2. load and register the driver  -------> oracle/mysql driver (com.mysql.jdbc.driver) or (com.mysql.cj.jdbc.Driver)
        3. create a connection  ----------------> object of connection string (getConnection)
        4. create a statement  -----------------> object of statement string
        5. execute the query   -----------------> query execution (stmt.executeQuery(query))
        6. process the query and store it in Result_set ->  (ResultSet rs = stmt.executeQuery(query))
        7. add 'ResultSet.next' and print the result by specifying the detatype of column
        8. close the connection
         */
        Class.forName("com.mysql.cj.jdbc.Driver");//2. load and register the driver
        String url = "jdbc:mysql://localhost:3306/friends_data";
        String username = "root";
        String password = "Nandan";
        Connection con = DriverManager.getConnection(url,username,password); //3. create a connection
        Statement stmt = con.createStatement();//4. create a statement
        String query = "SELECT * FROM friends_data.friendsinfo";
        ResultSet rs = stmt.executeQuery(query); //5. execute the query
        //7. add 'ResultSet.next' and print the result by specifying the detatype of column
        //if we don't use while with 'rs.next()' it will show the one data
        while(rs.next())
        {
            int col1 = rs.getInt("friendId");
            String col2 = rs.getString("friendName");
            int col3 = rs.getInt("friendPhone");
            String col4 = rs.getString("friendBranch");
            String col5 = rs.getString("friendWork");
            System.out.println(col1+" : "+col2+" : "+col3+" : "+col4+" : "+col5);
        }
    }
}
