import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static boolean BalancedBracket(String s){
        Stack<Character> st = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(ch);
            }
            else{
                st.pop();
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        boolean ans = BalancedBracket(s);
        System.out.println(ans);
    }
}
