//WAP to take input from user and perform arithematic operations
import java.util.*;
class opeartions
{
    int i,j;
    void get_Data()
    {
        System.out.println("Enter two numbers: ");
        try (Scanner sc = new Scanner(System.in)) {
            i=sc.nextInt();
            j=sc.nextInt();
        }
    }
    void results()
    {
        System.out.println("Addition of "+i+" and "+j+" is "+(i+j));
        System.out.println("Subtraction of "+i+" and "+j+" is "+(i-j));
        System.out.println("Multiplication of "+i+" and "+j+" is "+(i*j));
        System.out.println("Division of "+i+" and "+j+" is "+(i/j));
        System.out.println("Remainder of "+i+" and "+j+" is "+(i%j));
    }
}
class UserOperations
{
    public static void main(String Args[])
    {
        opeartions obj = new opeartions();
        obj.get_Data();
        obj.results();
    }
}
//Output:
// Enter two numbers:
// 10
// 20
// Addition of 10 and 20 is 30
// Subtraction of 10 and 20 is -10
// Multiplication of 10 and 20 is 200
// Division of 10 and 20 is 0
// Remainder of 10 and 20 is 10