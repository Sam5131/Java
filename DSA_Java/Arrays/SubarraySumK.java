import java.util.*;
public class SubarraySumK {
    public static int subarraySum(int[]arr, int k){
        int count = 0;
        int n = arr.length;

        //Brute force
        // for(int i = 0; i < n; i++){
        //     int sum = 0;
        //     for(int j = i; j < n; j++){
        //         sum += arr[j];
        //         if(sum == k){
        //             count++;
        //         }
        //     }
        // }

        //Optimal
        HashMap<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0, 1);

        int prefixSum = 0;
        for(int num : arr){
            prefixSum += num;

            if(prefixMap.containsKey(prefixSum - k)){
                count += prefixMap.get(prefixSum - k);
            }

            prefixMap.put(prefixSum, prefixMap.getOrDefault(prefixSum, 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[]arr = {1,1,1};
        int k = 2;
        System.out.println(subarraySum(arr, k));
    }
}
