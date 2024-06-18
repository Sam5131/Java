class dNode {
    int val;
    dNode next;
    dNode prev;

    dNode(int val) {
        this.val = val;
    }
}

class DLL {
    dNode head;
    dNode tail;
    int size;

    void display() {
        dNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void insertAtTail(dNode head, int val) {
        dNode temp = new dNode(val);
        if (size == 0) {
            head = tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
}

public class doublyLinkedListImplementaion {
    public static void print(dNode head) {
        dNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void printReverse(dNode tail) {
        dNode temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        dNode a = new dNode(10);
        dNode b = new dNode(20);
        dNode c = new dNode(30);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        print(a);
        printReverse(c);
    }
}
