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

//Algorithm:
//1. Choose a pivot element.
//2. Partition the array such that all elements less than the pivot are on the left side and all elements greater than the pivot are on the right side.
//3. Recursively sort the left and right subarrays.
//4. The base case of the recursion is when the array has less than or equal to one element.
//5. The time complexity of the quicksort algorithm is O(n log n) in the average and best case and O(n^2) in the worst case.
//6. The space complexity of the quicksort algorithm is O(log n) in the average and best case and O(n) in the worst case.