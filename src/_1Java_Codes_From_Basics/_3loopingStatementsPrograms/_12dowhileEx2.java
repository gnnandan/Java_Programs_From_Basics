package _3loopingStatementsPrograms;

public class _12dowhileEx2
{
    public static void main(String[] args)
    {
        char UC='A';
        char lc ='a';
        do
        {
            System.out.println("Upper Case Letter: " + UC + "," + " Lower Case Letter: " + lc + " ");
            UC++;
            lc++;
        }while(UC <= 'Z' && lc <= 'z');

    }
}
