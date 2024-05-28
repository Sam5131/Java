import java.util.*;
public class printDecreasing {
    public static void dec(int n){
        if(n==0){return;}
        System.out.println(n);
        dec(--n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        dec(n);
    }
}
