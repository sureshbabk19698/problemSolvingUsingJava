package easy;

import java.util.Arrays;

public class MergeSortArray {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		// 1, 4, 5
		// 2, 3

		int index = m + n - 1;
		int r1 = m - 1;
		int r2 = n - 1;

		while (r1 >= 0 && r2 >= 0) {
			nums1[index--] = nums1[r1] > nums2[r2] ? nums1[r1--] : nums2[r2--];
		}

		while (r2 >= 0) {
			nums1[index--] = nums2[r2--];
		}
	}

	public static void main(String[] args) {
		MergeSortArray ms = new MergeSortArray();
		int nums1[] = { 1, 2, 3, 0, 0, 0 };
		int nums2[] = { 2, 3, 4 };
		ms.merge(nums1, 3, nums2, 3);

		System.out.println(Arrays.toString(nums1));
	}
}
