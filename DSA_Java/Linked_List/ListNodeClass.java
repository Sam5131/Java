class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class ListNodeClass {
    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }


    public static void display(Node head){
        if(head==null){return;}
        System.out.println(head.val);   //a->b->c
        display(head.next);
        // System.out.println(head.val);   //c->b->a
    }

    public static void main(String[] args) {
        Node a = new Node(20);
        Node b = new Node(40);
        Node c = new Node(60);
        a.next = b; // linking 20->40
        b.next = c; // 20->40->60

        // System.out.println(a.val);
        // System.out.println(a.next.val);
        // System.out.println(a.next.next.val);
        print(a);
        display(a);
    }
}