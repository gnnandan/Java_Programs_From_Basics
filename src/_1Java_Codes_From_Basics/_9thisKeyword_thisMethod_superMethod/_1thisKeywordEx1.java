package _9thisKeyword_thisMethod_superMethod;

import java.util.Scanner;

public class _1thisKeywordEx1
{
    int id;
    String name;

    _1thisKeywordEx1(int id, String name)
    {
        this.id = id;
        this.name = name;
        System.out.println("Name: "+id);
        System.out.println("Id: "+name);
    }


    public static void main(String[] args)
    {
        System.out.println("'this - keyword' is used to solve shadow problem by differentiating local variables and global variables");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.print("Enter you Id: ");
        int id = scanner.nextInt();

        //calling constructor
        new _1thisKeywordEx1(id,name);
    }
}
