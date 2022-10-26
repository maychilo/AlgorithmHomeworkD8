package homeworkD8;

public class RomanNumberService {
	public static int romanToInt(String str) {

		int romanToInt = 0;
		for (int i = 0; i < str.length(); i++) {

			romanToInt = romanToInt + getValue(str.charAt(i));

		}
		int k = 0;
		int n = str.length() - 1;

		while (k < n) {
			if (getValue(str.charAt(n - k)) > getValue(str.charAt(n - k - 1)))

			{
				romanToInt = romanToInt - 2 * getValue(str.charAt(n - k - 1));

			}
			k++;
		}
		return romanToInt;
	}

	// TIME COMPLEXITY O(n)

	public static int getValue(char A) {
		int value = 0;

		switch (A) {
		case 'I':
			value = 1;
			break;
		case 'V':
			value = 5;
			break;

		case 'X':
			value = 10;
			break;
		case 'L':
			value = 50;
			break;

		case 'C':
			value = 100;
			break;

		case 'D':
			value = 500;
			break;

		case 'M':
			value = 1000;
			break;
		}
		return value;
	}

}
