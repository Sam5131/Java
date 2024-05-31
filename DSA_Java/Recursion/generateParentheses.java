import java.util.Scanner;

public class generateParentheses {
    public static void print(int open,int close,int n,String s){
        if(s.length()==n*2){
            System.out.println(s);
            return;
        }
        if(open<n) print(open+1, close, n, s+"(");
        if(close<open) print(open, close+1, n, s+")");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        print(0,0,n,"");
        sc.close();
    }
}