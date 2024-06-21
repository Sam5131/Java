class stackNode {
    int val;
    stackNode next;

    stackNode(int val) {
        this.val = val;
    }
}

class stackLL {
    stackNode head = null;
    int size = 0;

    void push(int val) {
        stackNode temp = new stackNode(val);
        temp.next = head;
        head = temp;
        size++;
    }

    int size() {
        return size;
    }

    int pop() {
        if (head == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        int top = head.val;
        head = head.next;
        size--;
        return top;
    }

    int peek() {
        if (head == null) {
            System.out.println("Stack is Empty");
            return -1;
        }
        int x = head.val;
        return x;
    }

    boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    void display() {
        displayRec(head);
    }

    void displayRec(stackNode h) {
        if (h == null) {
            return;
        }
        displayRec(h.next);
        System.out.println(h.val);
    }
}

public class StackUsingLL {
    
}
