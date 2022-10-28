package homeworkD8;

public class LonggestPrefixService {
	public static String longestPrefix(String[] strs) {

		String prefix = strs[0].substring(0, minLength(strs)); // 1

		   for (int j = 0; j < strs.length; j++) { // length(strs)

			while (!strs[j].contains(prefix)) { 

				prefix = prefix.substring(0, prefix.length() - 1);// minlenght(strs)

				if (prefix.length() == 0)
					return "";// 1
			}
		}

		return prefix; //1
		
	}// Time complexity O(n) = length(strs)*minlenght(strs)+3

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
