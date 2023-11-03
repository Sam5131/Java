//4. Write a program to print Nth prime number.
public class PrimeNth
{
    public static void main(String args[])
    {
        int n = Integer.parseInt(args[0]);
        int count = 0, num=1, i = 2;
        while(count<n)
        {
            num++;
            for(i=2;i<=num;i++)
            {
                if(num%i==0)
                    break;
            }
            if(i==num)
                count++;
        }
        System.out.println("The " + n + "th prime number is " + num);
    }    
}
//Output:
// > java PrimeNth 10
// The 10th prime number is 29