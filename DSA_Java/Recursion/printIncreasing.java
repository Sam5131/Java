import java.util.Scanner;

public class printIncreasing {
    
    public static void inc(int x,int n) {
        if(x>n){return;}
        System.out.println(x);
        inc(x+1,n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        inc(1,n);
        sc.close();
    }
}
