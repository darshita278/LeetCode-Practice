package Leetcode;

public class RemoveAllDuplicate {

	public static void main(String[] args) {

		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		RemoveAllDuplicate re = new RemoveAllDuplicate();
		System.out.println(re.removeElement(nums));
	}

	public int removeElement(int[] nums) {
		int k = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i-1]) {
				nums[k] = nums[i];
				k++;
			}
		} 
		return k;

	}

}
