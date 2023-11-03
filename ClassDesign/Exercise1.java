/*Write a program in java to take 10 integer numbers as user input using the BufferedReader 
and print the sum of these numbers [name the file as Exercise1.java]. */
import java.io.*;
public class Exercise1
{
    public static void main(String Args[])
    {
        System.out.println("Enter 10 numbers: ");
        int sum=0;
        try
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            for(int i=1;i<=10;i++)
            {
                int num=Integer.parseInt(br.readLine());
                sum+=num;
            }
            System.out.println("Sum of the numbers is: "+sum);
        }
        catch(IOException e)
        {}
    }
}