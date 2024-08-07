
// ! 217 - Containes Duplicate - https://leetcode.com/problems/contains-duplicate/description/
/*
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.



Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

 */

import java.util.Arrays;
public class leetcode_217 {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1 };
        System.out.println(containsDuplicate(nums));

    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}

