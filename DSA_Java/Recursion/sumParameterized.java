import java.util.Scanner;

public class sumParameterized {
    public static void sum(int n,int s){
        if(n==0){
            System.out.println("The answer is: "+s);
            return;
        }
        System.out.println(n+" + "+s+": "+(s+n));
        sum(n-1,s+n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        sum(n,0);
        sc.close();
    }
}
