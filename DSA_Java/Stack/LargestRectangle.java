import java.util.Stack;

public class LargestRectangle {

    private static class Pair {
        int element;
        int index;

        public Pair(int element, int index) {
            this.element = element;
            this.index = index;
        }
    }

    public int maxArea(int[] height) {
        int max_area = Integer.MIN_VALUE;
        int n = height.length;
        Stack<Pair> st = new Stack<>();
        int[] nse = new int[n];
        int[] pse = new int[n];

        //Calculate the next smallest element
        nse[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && st.peek().element >= height[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nse[i] = n;
            } else {
                nse[i] = st.peek().index;
            }
            st.push(new Pair(height[i], i));
        }
        System.out.println("The next smallest element array: ");
        for(int ele: nse){
            System.out.print(ele + " ");
        }
        System.out.println();
        st.clear();

        //Calculate the previous smallest element
        pse[0] = -1;
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && st.peek().element >= height[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                pse[i] = -1;
            } else {
                pse[i] = st.peek().index;
            }
            st.push(new Pair(height[i], i));
        }

        System.out.println("The previous smallest element array: ");
        for(int ele: pse){
            System.out.print(ele + " ");
        }
        //Calculate the area
        for (int i = 0; i < n; i++) {
            int area = height[i] * (nse[i] - pse[i] - 1);
            max_area = Math.max(max_area, area);
        }
        return max_area;
    }

    public static void main(String[] args) {
        int[] height = {10,2,3,5,11,13,15,7,2};
        LargestRectangle obj = new LargestRectangle();
        System.out.println(obj.maxArea(height));
    }
}
