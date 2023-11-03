/*3. Write a program called HarmonicSum to compute the sum of a harmonic series, as shown below, where n=50000.
The program shall compute the sum from left-to-right as well as from the right-to-left.
Obtain the difference between these two.
Harmonic(n)=1+(1/2)+(1/3)+(1/n)
*/
public class HarmonicSum
{
    public static void main(String args[])
    {
        int n=50000;
        double sumLR=0,sumRL=0;
        for(int i=1;i<=n;i++)
        {
            sumLR+=1.0/i;
        }
        System.out.println("Sum from left to right: "+sumLR);
        for(int i=n;i>=1;i--)
        {
            sumRL+=1.0/i;
        }
        System.out.println("Sum from right to left: "+sumRL);
        System.out.println("Difference: "+(sumLR-sumRL));
    }
}
//Output:
// Sum from left to right: 11.397003949278504
// Sum from right to left: 11.397003949278519
// Difference: -1.7763568394002505E-14