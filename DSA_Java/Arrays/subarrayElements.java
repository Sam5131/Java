//Count the subarray where all elements are greater than K

public class subarrayElements {
    public static int count(int[]arr, int k){
        int n = arr.length;
        int count = 0;
        // for(int i = 0; i < n; i++){
        //     for(int j = i; j < n; j++){
        //         if(arr[j] <= k){
        //             break;
        //         }
        //         count++;
        //     }
        // }

        //Sliding Window approach
        int start = 0;
        for(int end = 0; end < n; end++){
            if(arr[end] <= k){
                start = end + 1;
                continue;
            }
            count = count + (end - start + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[]arr = {3, 4, 5, 6, 7, 2, 10, 11};
        int k = 5;
        System.out.println(count(arr,k));
    }
}
