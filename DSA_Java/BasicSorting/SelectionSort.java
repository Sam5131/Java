public class SelectionSort {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    /* public static void main(String[] args) { // Ascending Selection Sort using min element
        int arr[] = { 10, -4, 20, 1, -6, 8 };
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        print(arr);
    } */

    public static void main(String[] args) {    // Decsending Selection Sort using max element
        int arr[]={10,-4,20,1,-6,8};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int max=Integer.MIN_VALUE;
            int maxIndex=-1;
            for(int j=i;j<n;j++){
                if(arr[j]>max){
                    max=arr[j];
                    maxIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[maxIndex];
            arr[maxIndex]=temp;
        }
        print(arr);
    }
}
