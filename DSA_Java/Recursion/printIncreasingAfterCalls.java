import java.util.Scanner;

public class printIncreasingAfterCalls {
 public static void inc(int n){
        if(n==0){return;}
        inc(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        inc(n);
        sc.close();
    }
}
