import java.util.*;
class StarRectangle{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length:");
        int a=sc.nextInt();
        System.out.println("Enter the breadth:");
        int b=sc.nextInt();
        int i,j;
        for(i=1;i<=b;i++)
        {
            for(j=1;j<=a;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
