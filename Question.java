package leetcode_7_reverse_integer;

/*
 * Reverse digits of an integer.

   Example1: x = 123, return 321
   Example2: x = -123, return -321
   
   The input is assumed to be a 32-bit signed integer. 
   Your function should return 0 when the reversed integer overflows.
 */

public class Question {
	public static void main(String args[]) {
		int input_num = 23456;
		int result = 0;
		
		result = Solution.reverse(input_num);
		
		System.out.print(result);
		
	}
}
