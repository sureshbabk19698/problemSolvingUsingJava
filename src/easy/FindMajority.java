package easy;

import java.util.HashMap;
import java.util.Map;

public class FindMajority {

	// [3,2,3]
	// [2,2,1,1,1,2,2]

	public int majorityElement(int[] nums) {
		int majElement = nums[0];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.compute(nums[i], (key, val) -> val != null ? val + 1 : 1);
			if (map.containsKey(nums[i])) {
				int majEleCount = map.get(majElement);
				if (majElement != nums[i] && majEleCount < map.get(nums[i])) {
					majElement = nums[i];
				}
			}
		}
		return majElement;
	}

	public int majorityElementByMooreAlgo(int[] nums) {
		int count = 0;
		int candidate = nums[0];
		for (int i : nums) {
			if (candidate == i) {
				count++;
			} else {
				--count;
				if (count == 0) {
					candidate = i;
					count++;
				}
			}
		}
		return candidate;
	}

	public static void main(String[] args) {
		FindMajority fm = new FindMajority();
		System.out.println(fm.majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 }));
		System.out.println(fm.majorityElementByMooreAlgo(new int[] { 2, 2, 1, 1, 1, 2, 2 }));
	}

}