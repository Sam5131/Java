public class SubsetSums {
    public static void SumSubsets(int i, int[] arr, int sum) {
        if (i == arr.length) {
            System.out.print(sum+" ");
            return;
        }
        int digit = arr[i];
        SumSubsets(i + 1, arr, sum);
        SumSubsets(i + 1, arr, sum + digit);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 1};
        SumSubsets(0, arr, 0);
    }
}
