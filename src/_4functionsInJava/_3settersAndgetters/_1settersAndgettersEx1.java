package _4functionsInJava._3settersAndgetters;

import java.util.Scanner;

public class _1settersAndgettersEx1
{
    public static void main(String[] args)
    {
        credentials credentials = new credentials();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String un = input.next();

        System.out.print("Enter your password: ");
        String p = input.next();

        //taking username and Password for setter
        credentials.setUsername(un);
        credentials.setPassword(p);

        System.out.println();
        //displaying username and password using getter
        System.out.println("Username: "+credentials.getUsername());
        System.out.println("Password: "+credentials.getPassword());
    }
}
class credentials
{
    private String un; // Instance Variable (IV)
    private String pwd;// Instance Variable (IV)

    //setters to set or to modify the value of instance variable
    void setUsername(String username) //method with parameter and no return
    {
        un = username;
    }
    void setPassword(String password) //method with parameter and no return
    {
        pwd = password;
    }

    //getters to get of instance variable and return the value
    // *Returning datatype is important*
    String getUsername()//method with no parameter and with return
    {
        return un;
    }
    String getPassword()//method with no parameter and with return
    {
        return pwd;
    }
}
