package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TripletsSubArray {

	public static List<List<Integer>> findTriplets(int[] nums, int sum) {
		List<List<Integer>> pair = new ArrayList<>();

		int start = 0;
		int end = 0;
		for (int i = 0; i < nums.length; i++) {
			// to avoid duplicates
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			start = i + 1;
			end = nums.length - 1;
			while (start < end) {
				// to avoid duplicates
				if (end < nums.length - 1 && nums[end] == nums[end + 1]) {
					end--;
					continue;
				}
				int total = nums[i] + nums[start] + nums[end];
				if (total == sum) {
					pair.add(Arrays.asList(nums[i], nums[start], nums[end]));
					start++;
					end--;
				} else if (total > 0) {
					end--;
				} else {
					start++;
				}
			}
		}
		return pair;
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		Map<Integer, Integer> map = new HashMap<>(nums.length, 1f);
		Set<List<Integer>> pair = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			for (int j = i + 1; j < nums.length; j++) {
				int total = (nums[i] + nums[j]);
				int balance = 0 - total;
				if (map.get(balance) != null && map.get(balance) > j) {
					pair.add(Arrays.asList(nums[i], nums[j], balance));
				}
			}
		}
		return new ArrayList<>(pair);
	}

	// Driver code
	public static void main(String[] args) {
		System.out.println(findTriplets(new int[] { 1, 2, -2, -1 }, 0));
		System.out.println(threeSum(new int[] { 1, 2, -2, -1 }));
	}
}
