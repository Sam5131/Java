import java.util.Scanner;

public class sumReturn {
    public static int sum(int n){
        if(n==1||n==0){return n;} // base case
        int ans=n+sum(n-1);    // recursive call with changed parameter
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(sum(n));
        sc.close();
    }
}
