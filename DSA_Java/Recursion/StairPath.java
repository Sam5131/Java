//Find number of ways to reach the nth stair if 1 or 2 jumps are allowed

import java.util.Scanner;

public class StairPath {
    public static int stair(int n){
        if(n<=2){return n;}
        return stair(n-1)+stair(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(stair(n));
        sc.close();
    }
}
