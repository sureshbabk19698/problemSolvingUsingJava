package medium;

public class MaxSubArray {

	public int maxSubArray(int[] nums) {

		int sum = 0;
		int max = nums[0];
		// Kadane's Algorithm, if sum produces negative result, then set to 0
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			max = sum < max ? max : sum;
			sum = sum < 0 ? 0 : sum;
		}
		return max;
	}

	public static void main(String[] args) {
		MaxSubArray ms = new MaxSubArray();
		System.out.println(ms.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
		System.out.println(ms.maxSubArray(new int[] { 5, 4, -1, 7, 8 }));
		System.out.println(ms.maxSubArray(new int[] { -1, -2 }));
		System.out.println(ms.maxSubArray(new int[] { -2, 1 }));
		System.out.println(ms.maxSubArray(new int[] { -2, -3, -1 }));
		System.out.println(ms.maxSubArray(new int[] { -1, 0, -2 }));
	}
}
