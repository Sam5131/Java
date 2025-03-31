import java.util.*;
/*
* Given an array of distinct integers candidates and a target integer target,
* return a list of all unique combinations of candidates where the chosen numbers sum to target.
* You may return the combinations in any order.
* The same number may be chosen from candidates an unlimited number of times.
* Two combinations are unique if the frequency of at least one of the chosen numbers is different.
*/
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
