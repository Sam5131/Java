//WAP to use Command line arguements to take input from user and perform addition
class addn
{
    int i,j;
    void add(String Args[])
    {   System.out.println("Enter two numbers: ");
        i = Integer.parseInt(Args[0]);
        j = Integer.parseInt(Args[1]);
        System.out.println("Addition of "+i+" and "+j+" is "+(i+j));
    }
}
public class CommandLine
{
    public static void main(String Args[])
    {
        try
        {
            addn obj=new addn();
            obj.add(Args);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
//Output:
//Enter two numbers:
//10 20
//Addition of 10 and 20 is 30