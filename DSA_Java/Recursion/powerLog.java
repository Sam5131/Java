import java.util.Scanner;

public class powerLog {
        public static int exponential(int n,int m) {
        if(n==0&&m==0){
            System.out.println("Not defined");
            return -1;
        }
        if (m == 0) {
            return 1;
        } // base case
        int ans=exponential(n, m/2);
        if(m%2==0){
            return ans*ans;
        }
        else{
            return ans*ans*n;
        }
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
