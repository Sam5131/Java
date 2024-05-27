public class MovingZeros {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(int[] arr) {
        int noz = 0;
        int n = arr.length;
        print(arr);
        for (int ele : arr) {
            if (ele == 0) {
                noz++;
            }
        }
        for (int i = 0; i <= noz; i++) { // n-1 passes
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] == 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        print(arr);
    }
}
