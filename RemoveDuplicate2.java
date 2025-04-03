package Leetcode;

public class RemoveDuplicate2 {

	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2,3};
		RemoveDuplicate2 re = new RemoveDuplicate2();
		System.out.println(re.removeElement(nums));
	}

	public int removeElement(int[] nums) {
		int k = 1;
		int count = 0; 

		for (int i = 1; i < nums.length; i++) {
			if(nums[i] == nums[i-1]) {
				count++;
				if(count<2) {
					nums[k] = nums[i];
					k++;
				}
			}else {
				count = 0;
				nums[k] = nums[i];
				k++;
			}
		}

		return k;

	}

}
