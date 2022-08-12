package algorithm;

public class MaxArea {

	public int maxArea(int[] height) {
		int maxArea = 0;
		int tempMax = 0;

		int left = 0;
		int right = height.length - 1;
		while (left < right) {
			if (height[left] < height[right]) {
				tempMax = ((right - left) * height[left]);
				if (tempMax > maxArea) {
					maxArea = tempMax;
				}
				left++;
			} else {
				tempMax = ((right - left) * height[right]);
				if (tempMax > maxArea) {
					maxArea = tempMax;
				}
				right--;
			}
		}
		return maxArea;
	}

	public static void main(String[] args) {
		MaxArea mx = new MaxArea();
		System.out.println(mx.maxArea(new int[] { 3, 9, 3, 4, 7, 2, 12, 6 }));
		System.out.println(mx.maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
		System.out.println(mx.maxArea(new int[] { 1, 1 }));
	}
}