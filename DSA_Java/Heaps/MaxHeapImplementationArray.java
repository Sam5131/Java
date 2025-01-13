class MaxHeap {
    private int arr[];
    private int size;

    MaxHeap(int capactiy) {
        arr = new int[capactiy];
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
        if (idx == 0) {
            return;
        }
        int parent = (idx - 1) / 2;
        if (arr[idx] > arr[parent]) {
            swap(idx, parent);
            upHeapify(parent);
        }
    }

    public void add(int num) {
        arr[size++] = num;
        upHeapify(size - 1);
    }

    public void downHeapify(int i) {
        int lc = 2 * i + 1;
        int rc = 2 * i - 1;
        int maxIndex = i;
        if (arr[maxIndex] < arr[lc]) {
            maxIndex = lc;
        }
        if (arr[maxIndex] < arr[rc]) {
            maxIndex = rc;
        }
        if (i == maxIndex) {
            return;
        }
        swap(i, maxIndex);
        downHeapify(maxIndex);
    }

    public int remove() throws Exception {
        if (size == 0) {
            throw new Exception("heap is Empty");
        }
        int peek = arr[0];
        swap(0, size - 1);
        size--;
        downHeapify(0);
        return peek;
    }

}

public class MaxHeapImplementationArray {
    public static void main(String[] args) {
        MaxHeap pq = new MaxHeap(10);
        pq.add(3);
        pq.add(5);
        pq.add(9);
        System.out.println(pq);
    }
}
