import java.util.*;

public class StockSpanStack {
    public static int[] StockSpan(int[] price, int n) {
        Stack<Integer> st = new Stack<>();
        int[] arr = new int[n];
        st.push(0);
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && price[i] >= price[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty())
                arr[i] = i + 1;
            else
                arr[i] = i - st.peek();
            st.push(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 100, 80, 60, 70, 75, 85 };
        StockSpan(arr, 5);
        for (int i : arr)
            System.out.println(arr[i]);
    }
}