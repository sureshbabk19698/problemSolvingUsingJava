package easy;

public class FindAnagram {

	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		int source[] = new int[128];

		for (int i = 0; i < s.length(); i++) {
			source[s.charAt(i)]++;
		}

		for (int i = 0; i < t.length(); i++) {
			if (--source[t.charAt(i)] < 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isAnagram("rat", "car"));
		System.out.println(isAnagram("anagram", "nagaram"));
		System.out.println(isAnagram("aacc", "ccac"));
	}
}