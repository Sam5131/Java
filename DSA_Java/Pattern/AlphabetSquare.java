import java.util.*;
public class AlphabetSquare {
    public static void main(String[]args){
        System.out.println("Enter the number of rows:");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++)
        {
            for(char ch='A';ch<'A'+rows;ch++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
