import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ZeroSumSubarrays {

    public static List<int[]> findSubarraysWithZeroSum(int[] arr) {
        // HashMap to store cumulative sum and their corresponding indices
        HashMap<Integer, List<Integer>> cumulativeSumMap = new HashMap<>();
        // List to store the start and end indices of all subarrays with zero sum
        List<int[]> subarrays = new ArrayList<>();
        
        int currentSum = 0;  // Initialize cumulative sum
        
        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];  // Add current element to cumulative sum
            
            // If currentSum is zero, the subarray from 0 to i has a sum of zero
            if (currentSum == 0) {
                subarrays.add(new int[]{0, i});
            }
            
            // If currentSum has been seen before, all subarrays from previous
            // occurrences of the same sum to the current index have a sum of zero
            if (cumulativeSumMap.containsKey(currentSum)) {
                List<Integer> indices = cumulativeSumMap.get(currentSum);
                for (int startIndex : indices) {
                    subarrays.add(new int[]{startIndex + 1, i});
                }
            }
            
            // Add current index to the list of indices where this cumulative sum occurs
            cumulativeSumMap.putIfAbsent(currentSum, new ArrayList<>());
            cumulativeSumMap.get(currentSum).add(i);
        }
        
        return subarrays;
    }

    public static void main(String[] args) {
        int[] arr = {4, -1, -3, 1, 2, -1};  // Example input
        List<int[]> result = findSubarraysWithZeroSum(arr);
        
        // Print the subarrays' start and end indices in the form (start_index, end_index)
        for (int[] subarray : result) {
            System.out.println("(" + subarray[0] + ", " + subarray[1] + ")");
        }
    }
}
