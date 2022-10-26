package homeworkD8;

import java.util.Arrays;
import java.util.Scanner;

public class MainHomeworkD8 {

	public static void main(String[] args) {
		// SORT---O(n)
		
		int[] nums = { 1, 0, 1, 0, 2, 2, 0, 2, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2 };

		int count[] = new int[nums.length];
		for (int i = 0; i < count.length; i++) {
			count[nums[i]] = count[nums[i]] + 1;
		}
		int a = count[0];
		int b = count[1];
		int c = count[2];
		int[] array1 = new int[a];
		Arrays.fill(array1, 0);

		int[] array2 = new int[b];
		Arrays.fill(array2, 1);

		int[] array3 = new int[c];
		Arrays.fill(array3, 2);

		int[] result = new int[nums.length];
		System.arraycopy(array1, 0, result, 0, a);
		System.arraycopy(array2, 0, result, nums.length - b - c, b);
		System.arraycopy(array3, 0, result, nums.length - c, c);

		System.out.println("Sort Array is : ");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

		// ROMAN NUMBER O(n)
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\nPlease enter your Roman number :");

		String str = sc.nextLine();
		int integer = RomanNumberService.romanToInt(str);

		System.out.println("Integer number is: " + integer + "\n");

		// Square Root // Time Complexity O(n)

		System.out.println("Please enter your number :");
		double n = sc.nextDouble();

		System.out.print("\nSquare Root of " + n + " is :\t");
		System.out.println(SquareRootService.getSqrt(n) + "\n");
		sc.close();

		// LONGEST SAME STRING - Time Complexity O(n)*(minString.length)

		String[] strs = { "Flower", "Flame", "Flight", "Florist" };

		System.out.println("The longest prefix of the strings is :" + LonggestPrefixService.longestPrefix(strs));

	}
}
