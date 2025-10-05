
public class Pattern1 {

    public static void main(String args[])
    {
        // *****
        // *****
        // *****
        // *****
     
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        // *
        // * *
        // * * *
        // * * * *
        // * * * * *


        for(int i=0;i<=5;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        // 1
        // 2 2
        // 3 3 3
        // 4 4 4 4
        // 5 5 5 5 5

        for(int i=1;i<=5;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("" + i + " ");
            }
            System.out.println();
        }

        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
        for(int i=0;i<5;i++)
        {
            for(int j=1;j<=i+1;j++)
            {
                System.out.print("" + j + " ");
            }
            System.out.println();
        }
        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1

        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("" + j + " ");
            }
            System.out.println();
        }
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *

         for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }


    }
}
