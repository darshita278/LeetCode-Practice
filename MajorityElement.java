package Leetcode;

public class MajorityElement {

	public static void main(String[] args) {
		int[] nums= {2,2,1,1,1,2,2,1,1};
		MajorityElement me = new MajorityElement();
		System.out.println(me.majorityElement(nums));
	}
	
	public int majorityElement(int[] nums) {
		
		int count = 1;
		int majority =nums[0];
		
		for (int i = 1; i < nums.length; i++) {
				if(count == 0) {
					count++;
					majority = nums[i];
				}else if(majority == nums[i]) {
					count++;
				}else {
					count--;
				}

		}
		
		return majority;
	}
}
