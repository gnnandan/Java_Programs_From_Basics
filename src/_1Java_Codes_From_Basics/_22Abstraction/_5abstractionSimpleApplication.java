package _1Java_Codes_From_Basics._22Abstraction;

import java.util.Scanner;

abstract class remoteFunction
{
    abstract void buttonON();
    abstract void buttonOFF();
}

class TV_Remote extends remoteFunction
{
    void operateRemote()
    {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Do you want to watch 'TV', if yes press remote(on or off): ");
        String input = scanner.next();
        //if(input == "On") or like below
        if(input.equalsIgnoreCase("on") )
        {
            buttonON();
        }
        else
        {
            buttonOFF();
        }
    }
    void buttonON()
    {
        System.out.println("TV is turned ON.....!");
    }
    void buttonOFF()
    {
        System.out.println("TV is turned OFF.....!");
    }
}



public class _5abstractionSimpleApplication
{
    public static void main(String[] args)
    {
        TV_Remote tvr = new TV_Remote();
        tvr.operateRemote();
    }
}
