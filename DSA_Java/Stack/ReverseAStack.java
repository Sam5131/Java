import java.util.Stack;

public class ReverseAStack {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);

        ReverseStack(st);

        Stack<Integer> st_temp = new Stack<>(); // Creating a temporary stack to hold all the poped elements of st
        while (!st.isEmpty()) {
            st_temp.push(st.pop());
        }
        System.out.println(st_temp);
        System.out.println(st); // st is now empty
    }

    public static void ReverseStack(Stack<Integer> st) { // Reverse a stack using recursion
        if (st.isEmpty()) {
            return;
        }
        int top = st.pop();
        System.out.println(top);
        ReverseStack(st);
        st.push(top);
    }
}
