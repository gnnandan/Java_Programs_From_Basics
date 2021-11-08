package _5arraysInJava;

public class _7multidimensionalArray_TypeRegularArrayEx7
{
    public static void main(String[] args)
    {
        //{Creating and Initializing}creating an multidimensional array
        int numbers [][]  = {{1,2,3},{10,20,30},{100,200,300}};
//        int[][] numbers = {{1,2,3},{10,20,30},{100,200,300}};

        //accessing the array element of multidimensional array
        System.out.println("Accessing 1st row, 2nd column data: "+numbers[1][2]);

        //displaying the multidimensional data
        for(int i =0;i < numbers.length;++i)
        {
            for (int j = 0;j<numbers[i].length;++j)
            {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

        //checking the length of array
        System.out.println("The length of multidimensional array is: "+numbers.length+" dimensions");
    }
}
