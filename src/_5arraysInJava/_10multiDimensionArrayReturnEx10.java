package _5arraysInJava;

public class _10multiDimensionArrayReturnEx10
{
    public static void main(String[] args)
    {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};

        //calling function
        doSum(a);

        System.out.println();

        int d[][] = returnDoSum();
        int sumc=0;
        for(int x = 0;x<= d.length-1;x++)
        {
            for(int y = 0; y<=d[x].length-1;y++)
            {
                System.out.print(d[x][y]+" ");
                sumc= sumc + d[x][y];
            }
            System.out.println(" ");
        }
        System.out.println("The sum of (Returned) array 'c' is: "+sumc);
    }
    static void doSum(int b[][])
    {
        int sum = 0;
        for(int i=0;i<=b.length-1;i++)
        {
            for(int j = 0;j<=b[i].length-1;j++)
            {
                System.out.print(b[i][j]+" ");
                sum = sum + b[i][j];
            }
            System.out.println(" ");
        }
        System.out.println("The sum of (Unreturned) array 'b' is: "+sum);
    }

    static int [][] returnDoSum()
    {
        int c[][] = {{11, 12, 13}, {14, 15, 16}, {17, 18, 19}};
        return c;
    }
}
