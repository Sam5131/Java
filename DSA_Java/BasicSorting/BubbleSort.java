public class BubbleSort {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    /*
     * public static void main(String[] args) { //Bubble Sort - 1
     * int[]arr={5,1,3,4,2};
     * int n=arr.length;
     * print(arr);
     * for(int i=0;i<=n-1;i++){ //n-1 passes
     * for(int j=0;j<n-1;j++){
     * if(arr[j]>arr[j+1]){
     * int temp=arr[j];
     * arr[j]=arr[j+1];
     * arr[j+1]=temp;
     * }
     * }
     * }
     * print(arr);
     * }
     */

    /*
     * public static void main(String[] args) { //Bubble Sort - 2
     * int[]arr={5,1,3,4,2};
     * int n=arr.length;
     * print(arr);
     * for(int i=0;i<=n-1;i++){ //n-1 passes
     * for(int j=0;j<n-1-i;j++){ //n-1-i passes 1 less than the previous pass
     * if(arr[j]>arr[j+1]){
     * int temp=arr[j];
     * arr[j]=arr[j+1];
     * arr[j+1]=temp;
     * }
     * }
     * }
     * print(arr);
     * }
     */

    public static void main(String[] args) { // Bubble Sort Optimized
        int[] arr = { 5, 1, 3, 4, 2 };
        int n = arr.length;
        print(arr);
        for (int i = 0; i <= n - 1; i++) { // n-1 passes
            boolean flag=true;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag=false;
                }
            }
            if(flag==true) break; //if array is already sorted then break the loop
        }
        print(arr);
    }
}