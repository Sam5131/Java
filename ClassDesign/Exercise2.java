/*Write the program description given in Exercise1 in java using the Scanner class
[name the file as Exercise2.java] */
import java.util.*;
class Exercise2
{
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter 10 numbers: ");
        int sum=0;
        for(int i=0;i<10;i++)
        {
            int num=sc.nextInt();
            sum+=num;
        }
        System.out.println("Sum of 10 numbers is: "+sum);}
    }
}