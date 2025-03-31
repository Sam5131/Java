import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class uniqueSubsets {
    public static void findSubsets(int i, int[] arr, ArrayList<Integer> curr, HashSet<ArrayList<Integer>> subsets) {
        if(i == arr.length) {
            subsets.add(new ArrayList<>(curr));
            return;
        }
        int digit = arr[i];
        // don't add the element in the arraylist
        findSubsets(i+1, arr, curr, subsets);

        //add the element in the arraylist
        curr.add(digit);
        findSubsets(i+1,arr, curr, subsets);
        curr.remove(curr.size()-1);

    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,5};
        Arrays.sort(arr);
        HashSet<ArrayList<Integer>> subsets = new HashSet<>();
        findSubsets(0,arr,new ArrayList<>(),subsets);

        for(ArrayList<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
