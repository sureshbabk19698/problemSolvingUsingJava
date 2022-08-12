package easy;

import java.util.Arrays;

public class PlusOne {
	public int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] == 9)
				digits[i] = 0;
			else {
				digits[i]++;
				return digits;
			}
		}
		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;
	}

	public static void main(String[] args) {
		PlusOne p1 = new PlusOne();
		System.out.println(Arrays.toString(p1.plusOne(new int[] { 1, 2, 3 })));
		System.out.println(Arrays.toString(p1.plusOne(new int[] { 8, 8, 9 })));
	}
}