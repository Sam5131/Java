/*WAP to perform arthematic opeartions by initializing variables*/
class getData
{
    int a,b;
    void get_Data()
    {
        a=10;
        b=20;
    }
}
class operations
{
    void results()
    {
        getData obj = new getData();
        obj.get_Data();
        int i= obj.a; int j= obj.b;
        System.out.println("Addition of "+i+" and "+j+" is "+(i+j));
        System.out.println("Subtraction of "+i+" and "+j+" is "+(i-j));
        System.out.println("Multiplication of "+i+" and "+j+" is "+(i*j));
        System.out.println("Division of "+i+" and "+j+" is "+(i/j));
    }
}
public class AOperations
{
    public static void main(String Args[])
    {
        operations obj = new operations();
        obj.results();
    }
}
//Output:
// Addition of 10 and 20 is 30
// Subtraction of 10 and 20 is -10
// Multiplication of 10 and 20 is 200
// Division of 10 and 20 is 0
// Remainder of 10 and 20 is 10