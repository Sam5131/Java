import java.util.Scanner;

public class gcd {
    public static int gcdRec(int a,int b){
        if(b%a==0){return a;}
        return gcdRec(b%a,a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=sc.nextInt();
        System.out.println("Enter b: ");
        int b=sc.nextInt();
        System.out.println(gcdRec(a,b));
        sc.close();
    }
}
