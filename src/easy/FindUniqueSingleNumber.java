package easy;

public class FindUniqueSingleNumber {

	public int singleNumber(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result ^= nums[i];
		}
		return result;
	}

	public static void main(String[] args) {
		FindUniqueSingleNumber fs = new FindUniqueSingleNumber();
		System.out.println("Unique Value is : " + fs.singleNumber(new int[] { 1, 2, 3, 1, 2 }));
		System.out.println("Unique Value is : " + fs.singleNumber(new int[] { 1, 2, 2, 1 })); // No unique Value
	}
}