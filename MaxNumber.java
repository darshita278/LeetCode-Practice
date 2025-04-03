package Leetcode;

public class MaxNumber {

	public static void main(String[] args) {
		int[] nums = {5,20,66,1314};
		int maxPos=0;
		int maxNeg=0;

		// final count of negative and positive numbers
		for (int num : nums) {
			if(num > 0) {
				maxPos++;
			}else if(num < 0) {
				maxNeg++;
			}else {
				System.out.println("Number is non postive or negative:"+num);
			}
		}
		
		//Find max count\
		System.out.println("Max number is : "+Math.max(maxPos, maxNeg));
		if(maxNeg > maxPos) {
			System.out.println("There are "+maxNeg + "negative and "+maxPos+" positive number.Maximum count is:"+maxNeg);
		}else {
			System.out.println("There are "+maxNeg + "negative and "+maxPos+" positive number.Maximum count is:"+maxPos);
		}
	}

}
