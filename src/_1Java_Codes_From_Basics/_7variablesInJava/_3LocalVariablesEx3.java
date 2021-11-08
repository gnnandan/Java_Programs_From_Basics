package _7variablesInJava;

/*
     Note
     1. Declaration: inside method/block
     2. Location: stack memory hence it is also called as stack variable.
     3. scope: memory will be allocated when ever control enters the method/block. memory will be deallocated when ever control leaves the  method/block.
     4. accessing: accessed only within the method/block. Outside not accessible
 */
public class _3LocalVariablesEx3
{
    public static void main(String[] args)
    {

        for(int i = 0;i<=10;i++) //i local variable
        {
            System.out.print(i+" ");
        }
        //System.out.println(i); *error accessing local variable here*
    }
}
