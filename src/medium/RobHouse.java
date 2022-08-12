package medium;

public class RobHouse {

	public static int rob(int[] nums) {
		int n = nums.length;
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return nums[0];
		}
		int prev = nums[0], current = Math.max(nums[0], nums[1]);
		for (int i = 2; i < n; i++) {
			int temp = current;
			current = Math.max(current, prev + nums[i]);
			prev = temp;
		}
		return current;
	}

	public static void main(String[] args) {
		System.out.println(rob(new int[] { 5, 1, 1, 5, 1, 1, 5 }));
	}
}
