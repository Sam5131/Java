//Maximum length of subarray whose first and last element same

public class FirstLastEleSame {
    public static int maxLenSubArray(char[]arr){
        int maxLen = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int j;
            for(j = n - 1; j >= 0; j--){
                if(arr[i] == arr[j]){
                    break;
                }

            }
            maxLen = Math.max(maxLen, j - i + 1);
        }

        return maxLen;
    }
    public static void main(String[] args) {
        char[] arr = { 'g', 'e', 'e', 'k', 's' };
        System.out.println(maxLenSubArray(arr));
    }
}
