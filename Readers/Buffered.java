//WAP to take input from user using the BufferedReader method and perform addition
import java.io.*;
class sum
{
    int i,j;
    void get_Data() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number: ");
        i = Integer.parseInt(br.readLine());
        System.out.println("Enter second number: ");
        j = Integer.parseInt(br.readLine());
    }
    void results()
    {
        System.out.println("Addition of "+i+" and "+j+" is "+(i+j));
    }
}
public class Buffered
{
    public static void main(String Args[])
    {
        sum obj=new sum();
        try
        {
            obj.get_Data();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        obj.results();
    }

}
