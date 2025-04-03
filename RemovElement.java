package Leetcode;


public class RemovElement {

	public static void main(String[] args) {
		int[] nums = {3,2,2,3};
		int val = 3;
		RemovElement re = new RemovElement();
		System.out.println(re.removeElement(nums, val));
	}
	
	public int removeElement(int[] nums, int val) {
		int k=0;
		for (int i = 0; i < nums.length; i++) {
			if (nums.length != 0 && nums[i] != val) {
				nums[k] = nums[i];
				k++;
			}
		}
		
		return k;
		
	}

}
