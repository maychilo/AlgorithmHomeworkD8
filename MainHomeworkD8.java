package homeworkD8;

import java.util.Scanner;

public class MainHomeworkD8 {

	public static void main(String[] args) {
		// SORT---O(n)

		int[] nums = { 1, 0, 1, 0, 2, 2, 0, 2, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2 };

		int[] newnums= Sort012Service.Sort012(nums);

		System.out.println("Sort Array is : ");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(newnums[i] + " ");
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
