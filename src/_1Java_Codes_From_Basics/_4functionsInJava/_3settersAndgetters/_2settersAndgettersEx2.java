package _4functionsInJava._3settersAndgetters;

import java.util.Scanner;

public class _2settersAndgettersEx2
{
    public static void main(String[] args)
    {
        data d = new data();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter student usn: ");
        int usn = input.nextInt();

        System.out.print("Enter student branch: ");
        String branch = input.next();

        //Call - 1 setters() method using reference variable
        d.setSname(name);
        d.setSuns(usn);
        d.setSbranch(branch);

        System.out.println();

        //Call - 2 getters() method using reference variable to display the data
        System.out.println("Student Name: "+d.getSname());
        System.out.println("Student USN: "+d.getSusn());
        System.out.println("Student Branch: "+d.getSbranch());
    }
}

class data
{
    private String sname;
    private int susn;
    private String sbranch;

    //setters methods
    public void setSname(String StudentName)
    {
        sname = StudentName;
    }
    public void setSuns(int USN)
    {
        susn = USN;
    }
    public void setSbranch(String Branch)
    {
        sbranch = Branch;
    }

//    getters methods
    String getSname()
    {
        return sname;
    }
    int getSusn()
    {
        return susn;
    }
    String getSbranch()
    {
        return sbranch;
    }
}
