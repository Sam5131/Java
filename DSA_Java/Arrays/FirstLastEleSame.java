//Maximum length of subarray whose first and last element same
import java.util.*;
public class FirstLastEleSame {
    public static int maxLenSubArray(char[]arr){
        int maxLen = 0;
        int n = arr.length;
        // for(int i = 0; i < n; i++){
        //     int j;
        //     for(j = n - 1; j >= 0; j--){
        //         if(arr[i] == arr[j]){
        //             break;
        //         }

        //     }
        //     maxLen = Math.max(maxLen, j - i + 1);
        // }

        //Optimal appraoch:
        int[]last = new int[26];    //last occurence array
        int[]first = new int[26];   //first occurence array

        Arrays.fill(last, -1);
        Arrays.fill(first, -1);


        for(int i = 0; i < n; i++){
            int index = arr[i] - 'a';
            if(first[index] == -1){
                first[index] = i;
            }
            last[index] = i;
        }

        for(int i = 0; i < 26; i++){
            if(first[i] != -1){
                maxLen = Math.max(maxLen, last[i] - first[i] + 1);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        char[] arr = { 'g', 'e', 'e', 'k', 's' };
        System.out.println(maxLenSubArray(arr));
    }
}
