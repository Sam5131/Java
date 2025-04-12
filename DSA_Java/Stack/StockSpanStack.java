import java.security.PublicKey;
import java.util.Stack;

class Pair{
    int price;
    int span;

    public Pair(int price,int span){
        this.price = price;
        this.span = span;
    }
}
class StockSpanStack{
    Stack<Pair> st;
    public StockSpanStack(){
        st = new Stack<>();
    }
    public int next(int price){
        int span = 1;
        while(!st.isEmpty()&&st.peek().price<=price){
            span = span + st.pop().span;
        }
        st.push(new Pair(price,span));
        return span;
    }
}