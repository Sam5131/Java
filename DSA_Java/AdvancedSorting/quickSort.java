public class quickSort {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int lo, int hi) {
        int pivot = arr[lo], pivotIdx = lo;
        int smallercount = 0;
        for (int i = lo + 1; i <= hi; i++) {
            if (arr[i] <= pivot) {
                smallercount++;
            }
        }
        int correctIdx = pivotIdx + smallercount;

        swap(arr, pivotIdx, correctIdx);

        int i = lo, j = hi;
        while (i < correctIdx && j > correctIdx) {
            if (arr[i] <= pivot)
                i++;
            else if (arr[j] > pivot)
                j--;
            else if (arr[i] > pivot && arr[j] <= pivot) {
                swap(arr, i, j);
            }
        }
        return correctIdx;
    }

    public static void QuickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int idx = partition(arr, low, high);
        QuickSort(arr, low, idx - 1);
        QuickSort(arr, idx + 1, high);
    }

    public static void main(String[] args) {
        int[] arr = { 13, 14, 57, 78, 33, 55, 36 };
        int n = arr.length;
        print(arr);
        QuickSort(arr, 0, n - 1);
        print(arr);
    }
}
