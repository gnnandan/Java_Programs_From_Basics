package _1Java_Codes_From_Basics._5arraysInJava.arraysRevisited;

public class _4multidimensionalArray
{
    public static void main(String[] args)
    {

        int num[][] = {{50,60,55,67,70},{62,65,70,70,81},{72,66,77,80,69}};

        //way 1
        for(int i=0;i< num.length;i++)
        {
            for(int j=0;j<num[i].length;j++)
            {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}
