import java.util.*;
public class preInPost {
    public static void pip(int n) {
        if(n==0){return;}
        System.out.println("pre "+n);  //pre
        pip(n-1);
        System.out.println("in "+n);  //in
        pip(n-1);
        System.out.println("post "+n);  //post
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        pip(n);
        sc.close();
    }
}
