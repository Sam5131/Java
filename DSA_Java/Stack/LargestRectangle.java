import java.util.Stack;

public class LargestRectangle {
    public int maxArea(int[] height) {
        int max_area = Integer.MIN_VALUE;
        int n = height.length;
        Stack<Pair> st = new Stack<>();
        int[] nse = new int[n];
        int[] pse = new int[n];
        //Calculate the next smallest element
        nse[n - 1] = -1;
        for(int i = n-2;i>=0;i--){
            while(!st.isEmpty() && st.peek().element>)
        }
    }
}
