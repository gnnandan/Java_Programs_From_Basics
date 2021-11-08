package _7variablesInJava;

/*
    Notes
    1. Definition: Static variable begins with "Static Keyword"
    2. Location: It is stored in Static Memory Segment Area
    3. Declaration: Static variables are declared within the class but outside the methods or block.
    4. Scope: allocated during loading of class file and deallocated while unloading the class file.
    5. accessing ways:
        way 1: using Class_Name.variableName **Best and recommended
        way 2: directly calling variableName
        way 3: by creating reference variable
 */
public class _2StaticVariableEx2
{
    static String name = "Nandan";
    static int age = 22;
    static String email = "gnnandan7@gmail.com";
    public static void main(String[] args)
    {
        System.out.println(_2StaticVariableEx2.name);//way 1
        System.out.println(age);//way 2
        _2StaticVariableEx2 staticVariable_Reference = new _2StaticVariableEx2();
        System.out.println(staticVariable_Reference.email);//way 3
    }
}
