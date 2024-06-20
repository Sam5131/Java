import java.util.*;

public class CopyStack {
    public static void main(String[] args) {
        Stack<Integer> st_original = new Stack<>();
        st_original.push(10);
        st_original.push(20);
        st_original.push(30);
        st_original.push(40);
        System.out.println(st_original);

        Stack<Integer> st_temp = new Stack<>();
        while (!st_original.isEmpty()) {
            st_temp.push(st_original.pop());
        }
        System.out.println(st_temp);
        Stack<Integer> st_copy = new Stack<>();
        while (!st_temp.isEmpty()) {
            st_copy.push(st_temp.pop());
        }
        System.out.println(st_copy);
    }
}
