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

    void insertAtTail(int val) {
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

    void insertAtHead(int val) {
        dNode temp = new dNode(val);
        if (size == 0) {
            head = tail = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    void InsertAtIndex(int idx, int val) { // Inseting an element at the desired index
        dNode temp = new dNode(val);
        if (idx == 0) { // if desired index is zero
            insertAtHead(val);
            return;
        }
        if (idx == size) { // if desried index is the size of the LL
            insertAtTail(val);
            return;
        }
        if (idx > size) {
            System.out.println("Invalid Index!");
            return;
        }
        dNode x = head;
        for (int i = 1; i <= idx - 1; i++) { // bring the index to the required position
            x = x.next;
        }
        dNode y = x.next;
        x.next = temp;
        temp.prev = x;
        y.prev = temp;
        temp.next = y;
        // Insertion part
        size++;
    }

    void deleteAtHead() throws Error{
        if(head==null) throw new Error("List is Empty");
        head=head.next;
        head.prev=null;
        size--;
    }

    void deleteAtTail()throws Error{
        if(tail==null)throw new Error("list is empty");
        tail=tail.next;
        tail.prev=null;
        size--;
    }

    void deleteAtIndex(int idx) throws Error { // Method to delete element from a desired index
        if (idx == 0) { // if index is zero
            deleteAtHead();
        }
        if(idx==size-1){
            deleteAtTail();
        }
        if (idx < 0 || idx >= size) { // if index is invalid
            throw new Error("Invalid Index");
        }
        dNode temp = head;
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }
        if (temp.next == tail) {
            tail = temp;
        }
        temp.next = temp.next.next;
        temp=temp.next;
        temp.prev=temp.prev.prev;
        size--;
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
        DLL list = new DLL();
        list.insertAtHead(10);
        list.display();
        list.insertAtHead(20);
        list.display();
        list.InsertAtIndex(2, 80);
        list.display();
    }
}
