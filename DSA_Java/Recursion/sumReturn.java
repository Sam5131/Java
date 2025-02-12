import java.util.Scanner;

public class sumReturn {
    public static int sum(int n) {
        if (n == 1 || n == 0) {
            System.out.println(n);
            return n;
        } // base case
        int prevSum = sum(n - 1);
        int ans = n + prevSum;
        System.out.println(n + " + " + prevSum + " = " + ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("The answer is: " + sum(n));
        sc.close();
    }
}
