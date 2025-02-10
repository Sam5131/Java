import java.util.*;

public class factorial {
    public static int fact(int n) {
        if (n == 1 || n == 0) {
            System.out.println("The factorial of 1 is: "+1);
            return 1;
        } // base case
        int ans = n * fact(n - 1);    // recursive call with changed parameter
        System.out.println("The factorial of "+n+" is: "+ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("\nThe factorial of " + n + " is: " + fact(n));
        sc.close();
    }
}
