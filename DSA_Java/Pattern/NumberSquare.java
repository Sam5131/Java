import java.util.*;
public class NumberSquare {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows:");
        int rows=sc.nextInt();
        System.out.println("Enter the columns:");
        int columns=sc.nextInt();
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=columns;j++)
            {
                System.out.print(j);
            }
            System.out.println();   //Move to next line
        }
    }
}
