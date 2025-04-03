package Leetcode;

public class IsPalindrome {
	
	public static void main(String[] args) {
		int num = 2112;
		int org = num;
		int remainder = 0;
		int exp = 0;
		
		while (num > 0) {
			remainder = num % 10;
			num = num/10;
			exp = exp*10 + remainder;
		}
		
		if (org == exp)
		{
			System.out.println("both are equal"+exp);
		}else {
			System.out.println("both are not equal"+exp);
		}
		
		
	}

}
