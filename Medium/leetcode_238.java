// ! 238 - Product Of The Array Except Itself
/*
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.


Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 */
public class leetcode_238 {
    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4 };
        int result[] = productExceptSelf(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int newArr[] = new int[nums.length];
        newArr[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            newArr[i] = newArr[i - 1] * nums[i - 1];
        }

        int rightProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            newArr[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return newArr;
    }
}
