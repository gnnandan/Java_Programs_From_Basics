package _7variablesInJava;

/*
        Notes
        1. Creation: created outside the main inside the class
        2. Value of a variable changes from object to object
        3. Instance Variable is stored inside the heap
        4. Scope allocation will occur during creation and deallocation will occur during object destruction.
        5. instance variable cannot be accessed inside "Static field"
        6. instance variable can be accessed inside "Static field" using reference variable
 */

public class _1InstanceVariableEx1
{
    String name = "Nandan";
    int age = 22;
    String email = "gnnandan7@gmail.com";
    public static void main(String[] args)
    {
        /*
        instance variable cannot be accessed inside "Static field"
        Causes error if you use it "Static field"

        System.out.println(name); ----->error
        System.out.println(age); ----->error
        System.out.println(email); ----->error

        it should be accessed using reference variable
         */

        //InstanceVariable_reference ---> reference variable
        _1InstanceVariableEx1 InstanceVariable_reference  = new _1InstanceVariableEx1();
        System.out.println(InstanceVariable_reference.name);
        System.out.println(InstanceVariable_reference.age);
        System.out.println(InstanceVariable_reference.email);
    }
}
