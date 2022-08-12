package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		storeAllRecursive(nums.length, nums, result);
		return result;
	}

	public void storeAllRecursive(int n, int[] elements, List<List<Integer>> result) {
		
		if (n == 1) {
			storeArray(elements, result);
		} else {
			for (int i = 0; i < n - 1; i++) {
				storeAllRecursive(n - 1, elements, result); // 3 // 2
				// 1. print array without swap, n == 1 // 1,2,3
				// 2. n = 3, swap first and last , i=1
				// 3. n = 2, swap first and second
				if (n % 2 == 0) {
					swap(elements, i, n - 1);
				} else {
					swap(elements, 0, n - 1);
				}
			}
			storeAllRecursive(n - 1, elements, result); // n = 2, swap and exit [2, 1, 3]
		}
	}

	private void swap(int[] input, int a, int b) {
		int tmp = input[a];
		input[a] = input[b];
		input[b] = tmp;
	}

	private void storeArray(int[] input, List<List<Integer>> result) {
		List<Integer> combination = new ArrayList<>();
		for (int i = 0; i < input.length; i++) {
			combination.add(input[i]);
		}
		result.add(combination);
	}

	public static void main(String[] args) {
		Permutation per = new Permutation();
		int[] arr1 = { 1, 2, 3 };
		per.permute(arr1).stream().forEach(System.out::println);
//		int[] arr2 = { 1, 2, 3, 4, 5 };
//		per.permute(arr2).stream().forEach(System.out::println);

	}

}
