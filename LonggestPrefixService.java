package homeworkD8;

public class LonggestPrefixService {
	public static String longestPrefix(String[] strs) {

		String prefix = strs[0].substring(0, minLength(strs)); // 1

		for (int i = 1; i < strs.length; i++) // n

			while (!strs[i].contains(prefix)) { // minLength(strs)-1

				prefix = prefix.substring(0, prefix.length() - 1);

				if (prefix.length() == 0)
					return ""; // 1
			}

		return prefix; // 1
	}// O(n)=(minLength-1)*n

	public static int minLength(String[] strs) {
		int minLength = strs[0].length();
		for (int i = 1; i < strs.length; i++) {
			if (strs[i].length() < minLength) {
				minLength = strs[i].length();
			}
		}
		return minLength;
	}
}
