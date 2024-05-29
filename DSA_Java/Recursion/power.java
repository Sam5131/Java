import java.util.Scanner;

public class power {
    public static int exponential(int n,int m) {
        if(n==0&&m==0){
            System.out.println("Not defined");
            return -1;
        }
        if (m == 0) {
            return 1;
        } // base case
        int ans = n * exponential(n,m-1); // recursive call with changed parameter
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number");
        int n = sc.nextInt();
        System.out.println("Enter the exponential number");
        int m = sc.nextInt();
        System.out.println(exponential(n,m));
        sc.close();
    }
}
