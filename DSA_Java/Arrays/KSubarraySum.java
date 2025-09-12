public class KSubarraySum {
    public static boolean checkSubarray(int[] arr, int k, int sum){
        int n = arr.length;
        int windowSum = 0;
        for(int left = 0; left < k; left++){
            windowSum = windowSum + arr[left];
        }
        if(windowSum == sum){
            return true;
        }
        for(int right = k; right < n; right++){
            windowSum += arr[right];
            windowSum -= arr[right - k];
            if(windowSum == sum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[]arr = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 4;
        int sum = 18;
        System.out.println(checkSubarray(arr, k, sum));
    }
}
