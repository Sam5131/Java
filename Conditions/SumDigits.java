/*2. Write a Java program called SumDigits to sum up the individual digits of a positive integer, given in the command line.
The output shall look like:
> java SumDigits 12345
The sum of digits = 1 + 2 + 3 + 4 + 5 = 15
*/
public class SumDigits
{
    public static void main(String args[])
    {
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        System.out.print("The sum of digits = ");
        while(n > 0)
        {
            System.out.print(n%10);
            sum += n%10;
            n /= 10;
            if(n > 0)
                System.out.print(" + ");
        }
        System.out.println(" = " + sum);
    }
}
//Output:
// > java SumDigits 12345
// The sum of digits = 5 + 4 + 3 + 2 + 1 = 15