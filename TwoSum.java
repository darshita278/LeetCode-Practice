package Leetcode;

public class TwoSum {

	public static void main(String[] args) {
		int nums[] = {3,2,4,3,3};
		int target = 6;
		
		
		for(int i=0; i < nums.length; i++) {
				for(int j=i+1; j<nums.length;j++) {
					if(nums[j] == target - nums[i]) {
						System.out.println("index:["+i+","+j+"]");};
					}
				}
				
				
			}
		}
		
		
		
