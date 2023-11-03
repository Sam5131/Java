//Wap to take input from user using Console Window and perform Addition
import java.io.*;
class add
{
    int i,j;
    void get_Data()
    {
        Console c = System.console();
        i = Integer.parseInt(c.readLine("Enter first number: "));
        j = Integer.parseInt(c.readLine("Enter second number: "));
    }
    void results()
    {
        System.out.println("Addition of "+i+" and "+j+" is "+(i+j));
    }
}
public class ConsoleWindow 
{
    public static void main(String Args[])
    {
        add obj=new add();
        obj.get_Data();
        obj.results();
    }
}
//Output:
//Enter first number: 10
//Enter second number: 20
//Addition of 10 and 20 is 30
