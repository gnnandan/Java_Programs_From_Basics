package _8waysOfInitializingTheObject;

public class _1initilizeObjectUsingReferenceVariableEx1
{
    // instance variables
    String Name;
    int age;
    int phone;
    public static void main(String[] args)
    {
        _1initilizeObjectUsingReferenceVariableEx1 io = new _1initilizeObjectUsingReferenceVariableEx1();

        //accessing objects using reference variable(io --> reference variable)
        io.Name="Nandan";
        io.age = 22;
        io.phone = 1234567;
        System.out.println(io.Name+"\n"+io.age+"\n"+io.phone);
    }
}
