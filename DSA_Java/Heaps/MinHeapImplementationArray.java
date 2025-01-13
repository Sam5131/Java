class MinHeap {
    private int[] arr;
    private int size;

    MinHeap(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    public void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int size() {
        return size;
    }

    public void upHeapify(int idx) {
        if (idx == 0)
            return;
        int parent = (idx - 1) / 2;
        if (arr[idx] < arr[parent]) {
            swap(idx, parent);
            upHeapify(parent);
        }
    }

    public int peek() {
        if(size == 0){
            System.out.println("Heap empty");
            return -1;
        }
        return arr[0];
    }

    public void add(int num) {
        arr[size++] = num;
        upHeapify(size - 1);
    }
}

public class MinHeapImplementationArray {
    public static void main(String[] args) {
        MinHeap pq = new MinHeap(10);

        pq.add(1);
        pq.add(6);
        pq.add(2);
        System.out.println(pq.size());
    }
}
