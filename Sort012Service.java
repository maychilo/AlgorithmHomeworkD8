package homeworkD8;

public class Sort012Service {
	public static int[] Sort012(int[] nums) {
		int count[] = new int[nums.length];
		for (int i = 0; i < count.length; i++) {
			count[nums[i]] = count[nums[i]] + 1;
		}

		int[] newnums = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {

			if (i < count[0]) {
				newnums[i] = 0;
			} else if (i < count[0] + count[1]) {
				newnums[i] = 1;
			} else {
				newnums[i] = 2;
			}
		}
		return newnums;
	}
}
