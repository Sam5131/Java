/*1.Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n), where F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1. Also compute their average. [ Note: the value 20 should be passed as  a command line arguments]
The output shall look like:
The first 20 Fibonacci numbers are:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
The average is 885.5
*/
class Fibonacci
{
    public static void main(String args[])
    {

        int n = Integer.parseInt(args[0]);
        int a = 1, b = 1, c = 0;
        double sum = 0;
        System.out.println("The first " + n + " Fibonacci numbers are:");
        for(int i = 1; i <= n; i++)
        {
            System.out.print(a + " ");
            sum += a;
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("\nThe average is " + sum/n);
    }
}
//Output:
// The first 20 Fibonacci numbers are:
// 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610
// 987 1597 2584 4181 6765
// The average is 885.5