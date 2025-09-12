import java.util.Arrays;

public class SortTheUnsort {
    public static void SortPart(int[] arr) {
        int n = arr.length;
        int start = -1, end = -1;

        // Step 1: Find where order breaks from left
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) { // ascending break
                start = i - 1;
                break;
            }
        }

        // Step 2: Find where order breaks from right
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) { // ascending break
                end = i + 1;
                break;
            }
        }

        if (start == -1 || end == -1) {
            System.out.println("Array is fully descending, no ascending subarray.");
            return;
        }

        System.out.println("Ascending subarray found from index " + start + " to " + end);

        // Step 3: Sort only the subarray in descending order
        Arrays.sort(arr, start, end + 1); // sorts ascending
        reverse(arr, start, end);         // reverse it to make descending

        // Step 4: Print fixed array
        System.out.println("Array after fixing:");
        System.out.println(Arrays.toString(arr));
    }

    // helper to reverse a section
    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {100, 90, 80, 60, 55, 70, 65, 40, 20};
        SortPart(arr);
    }
}
