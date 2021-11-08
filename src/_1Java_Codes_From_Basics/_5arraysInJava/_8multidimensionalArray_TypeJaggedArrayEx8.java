package _5arraysInJava;

public class _8multidimensionalArray_TypeJaggedArrayEx8
{
    public static void main(String[] args)
    {
        //declaring and initializing of array
        int data[][] = {{1,2,3},{1,2}};

        //checking the size
        System.out.println("The length of array is: "+data.length);

        //displaying data
        for(int i = 0;i< data.length;i++)
        {
            for(int j = 0;j< data[i].length;j++)
            {
                //call variable_name[i][j]
                System.out.print(data[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
