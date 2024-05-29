import java.util.Scanner;

public class printIncreasingAfterCalls {
 public static void dec(int n){
        if(n==0){return;}
        dec(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        dec(n);
        sc.close();
    }
}
