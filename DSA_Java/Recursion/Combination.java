import java.util.*;

public class Combination {

    public static void findCombinations(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (target == 0) { // Base case: target is achieved
            ans.add(new ArrayList<>(ds));
            return;
        }

        if (ind == arr.length) { // Base case: index out of bounds
            return;
        }

        // Pick the current element if it is <= target
        if (arr[ind] <= target) {
            ds.add(arr[ind]);
            findCombinations(ind, arr, target - arr[ind], ans, ds); // Do not increment index for the same element
            ds.remove(ds.size() - 1); // Backtrack
        }

        // Skip the current element
        findCombinations(ind + 1, arr, target, ans, ds);
    }

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        System.out.println(ans);
    }
}
