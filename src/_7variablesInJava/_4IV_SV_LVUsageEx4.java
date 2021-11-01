package _7variablesInJava;

public class _4IV_SV_LVUsageEx4
{
    String Name = "Nandan G N"; //this is instance variable
    static int Number= 10; //this is static variable

    public static void main(String[] args)
    {
        _4IV_SV_LVUsageEx4 instance_access = new _4IV_SV_LVUsageEx4();
        System.out.println(instance_access.Name);//accessing instance variable
        System.out.println("----------------------");

        System.out.println(_4IV_SV_LVUsageEx4.Number);//accessing static variable "Way 1*"
        System.out.println(Number);//accessing static variable "Way 2"
        _4IV_SV_LVUsageEx4 static_access = new _4IV_SV_LVUsageEx4();
        System.out.println(static_access.Number);

        System.out.println("----------------------");
        //System.out.println(i);//*When you try to access the local variable outside the method means it will cause error*
        LocalVariable();

    }
    static void LocalVariable()
    {
        int i = 100;//this is local variable
        for(i=0;i<=20;i++)
        {
            System.out.print(i+" "); //accessing local variable
        }
    }
}
