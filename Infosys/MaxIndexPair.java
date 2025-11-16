//Maximum value of |arr[i]-arr[j]| + |i - j|
class MaxIndexPair{
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        System.out.print(indexPair(arr));
    }
    // public static int indexPair(int[]arr){  //Brute Force
    //     int n = arr.length;
    //     int result = Integer.MIN_VALUE;
    //     for(int i = 0; i < n; i++){
    //         for(int j = 0; j < n; j++){
    //             int ans = Math.abs(arr[i] - arr[j]) + Math.abs(i - j);
    //             result = Math.max(result, ans);
    //         }
    //     }
    //     return result;
    // }

    public static int indexPair(int[] arr){
        int n = arr.length;
        int max1 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE, min2 = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            int a = arr[i] + i;
            int b = arr[i] - i;

            max1 = Math.max(max1, a);
            min1 = Math.min(min1, a);

            max2 = Math.max(max2, b);
            min2 = Math.min(max2, b);
        }
        return Math.max(max1 - min1, max2 - min2);
    }

}