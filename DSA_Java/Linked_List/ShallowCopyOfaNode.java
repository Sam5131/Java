public class ShallowCopyOfaNode {
    public static void main(String[] args) {
        Node a=new Node(90);
        Node temp=a; //Shallow copy
        // Node temp = new Node(90); //Deep copy
        System.out.println(a.val);
        System.out.println(temp.val);
    }
}
