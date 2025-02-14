//given a m x n grid you have to reach from top left to bottom right. you can either go right or down at a time. Find number of paths.

import java.util.Scanner;

public class mazePath {
//    public static int maze(int row,int col,int m,int n){
//        if(row==m||col==n){return 1;}
//        int rightWays=maze(row,col+1,m,n);
//        int downWays=maze(row+1,col,m,n);
//        return rightWays+downWays;
//    }

    public static int maze2(int row,int col){
        if(row==1||col==1){return 1;}
        int rightWays=maze2(row,col-1);
        int downWays=maze2(row-1,col);
        return rightWays+downWays;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter m");
        int m = sc.nextInt();
//        System.out.println(maze(1,1,m,n));
        System.out.println(maze2(m,n));
        sc.close();
    }
}
