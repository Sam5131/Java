import java.util.*;
public class ValueOfString {
    public static void main(String[] args) {
        String  s = "ABE";
        System.out.println(value(s));
    }
    public static int findv(char ch){
        return ch - 'A' + 1;
    }
    public static boolean check(String s){
        char ch [] = s.toCharArray();
        for(char c : ch){
            if(findv(c) % 2 != 0){
                return true;
            }
        }
        return false;
    }
    public static int value(String s){
        int n = s.length();
        String st = "";
        if(check(s)){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            st = new String(ch);
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            char ch = st.charAt(i);
            sum = sum + findv(ch) * i;
        }
        return sum;
    }
}
