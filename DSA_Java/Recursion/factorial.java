import java.util.*;
public class factorial {
    public static int fact(int n){
        if(n==1||n==0){return 1;} // base case
        int ans=n*fact(n-1);    // recursive call with changed parameter
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(fact(n));
        sc.close();
    }
}
