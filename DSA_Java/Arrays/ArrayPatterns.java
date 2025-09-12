import java.util.*;

public class ArrayPatterns {

    // ---------- SUBARRAYS ----------
    public static List<List<Integer>> getSubarrays(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                List<Integer> sub = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    sub.add(arr[k]);
                }
                list.add(sub);
            }
        }
        return list;
    }

    // ---------- SUBSETS ----------
    public static List<List<Integer>> getSubsets(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        generateSubsets(arr, 0, list, new ArrayList<>());
        return list;
    }

    private static void generateSubsets(int[] arr, int index, List<List<Integer>> list, List<Integer> current) {
        list.add(new ArrayList<>(current));

        for (int i = index; i < arr.length; i++) {
            current.add(arr[i]);
            generateSubsets(arr, i + 1, list, current);
            current.remove(current.size() - 1); // backtrack
        }
    }

    // ---------- SUBSEQUENCES ----------
    public static List<List<Integer>> getSubsequences(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        generateSubsequences(arr, 0, list, new ArrayList<>());
        return list;
    }

    private static void generateSubsequences(int[] arr, int index, List<List<Integer>> list, List<Integer> current) {
        if (index == arr.length) {
            list.add(new ArrayList<>(current)); // ✅ must add a copy
            return;
        }

        // include current element
        current.add(arr[index]);
        generateSubsequences(arr, index + 1, list, current);

        // exclude current element
        current.remove(current.size() - 1);
        generateSubsequences(arr, index + 1, list, current);
    }

    // ---------- DRIVER ----------
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        System.out.println("Subarrays:");
        for (List<Integer> sub : getSubarrays(arr)) {
            System.out.println(sub);
        }

        System.out.println("\nSubsets:");
        for (List<Integer> sub : getSubsets(arr)) {
            System.out.println(sub);
        }

        System.out.println("\nSubsequences:");
        for (List<Integer> sub : getSubsequences(arr)) {
            System.out.println(sub);
        }
    }
}
