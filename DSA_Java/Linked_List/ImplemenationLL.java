class SLL { // Singly Linked List
    private Node head;
    private Node tail;
    private int size;

    void InsertAtHead(int val) { // Insert element at the beginning of the list
        Node temp = new Node(val);
        if (head == null) { // Linked List is empty initially
            head = tail = temp;
        } else { // Linked list not empty initially
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void InsertAtEnd(int val) { // Insert an element at the end of the linked list
        Node temp = new Node(val);
        if (head == null) { // Linked List is empty initially
            head = tail = temp;
        } else { // Linked list not empty initially
            tail.next = temp;
            tail = temp;
        }
        size++; // size of linkedlist as a data member
    }

    void display() { // display the linked list
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void size() { // display size of the linked list as a method
        System.out.println("Lenght of Linked List: " + size);
    }
}

public class ImplemenationLL {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.InsertAtEnd(10); // insert a node at the end of a linked list
        list.InsertAtEnd(20);
        list.InsertAtEnd(30);
        list.InsertAtEnd(40);
        list.display(); // display the list
        list.size(); // display the size

        list.InsertAtHead(5); // insert a node at the beginning of a linked list
        list.display();
    }
}
