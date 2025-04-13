import java.util.Stack;

class StockSpanStack {

    private static class Pair {
        int price;
        int span;

        Pair(int price, int span) {
            this.price = price;
            this.span = span;
        }
    }

    Stack<Pair> st;

    public StockSpanStack() {
        st = new Stack<>();
    }

    public int next(int price) {
        int span = 1;
        while (!st.isEmpty() && st.peek().price <= price) {
            span += st.pop().span;
        }
        st.push(new Pair(price, span));
        return span;
    }
}
