package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>(nums.length, 1f);
		int i = 0;
		for (i = 0; i < nums.length; i++) {
			int balance = target - nums[i];
			if (!map.containsKey(balance)) {
				map.put(nums[i], i);
			} else {
				return new int[] { map.get(balance), i };
			}
		}
		return new int[2];
	}

	public static void main(String[] args) {
		TwoSum ts = new TwoSum();
		System.out.println(Arrays.toString(ts.twoSum(new int[] { 2, 7, 11, 15 }, 9)));
		System.out.println(Arrays.toString(ts.twoSum(new int[] { 3, 3 }, 6)));
		System.out.println(Arrays.toString(ts.twoSum(new int[] { 3, 2, 4 }, 6)));
	}
}
