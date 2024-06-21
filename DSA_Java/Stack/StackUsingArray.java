class stack {
    int[] arr = new int[5];
    int idx = 0;

    void push(int val) {
        if (isFull()) {
            System.out.println("Stack is Full");
            return;
        }
        arr[idx] = val;
        idx++;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        int top = arr[idx - 1];
        arr[idx - 1] = 0;
        idx--;
        return top;
    }

    int size() {
        return idx;
    }

    boolean isFull() {
        if (idx == arr.length)
            return true;
        return false;
    }

    boolean isEmpty() {
        if (idx == 0)
            return true;
        return false;
    }

    void display() {
        for (int i = 0; i <= idx - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    int peek() {
        if (idx == 0) {
            System.out.println("the Stack is Empty");
            return -1;
        }
        return arr[idx - 1];
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        stack st = new stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.size());
        st.display();
        st.pop();
        st.display();
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.isFull());
    }
}
